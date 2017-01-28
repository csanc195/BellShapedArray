import java.util.List;

/**
 * Created by CarlosSanchez on 1/27/17.
 */
public class BellShapedArrayFind <T extends Comparable> {


    public List<T> list;

    public BellShapedArrayFind(List<T> list){
        this.list = list;
    }

    /**
     * The following method searches for the element to find and returns
     * its index of occurrence if found, -1 otherwise.
     * @param elem This is the item to search.
     * @return Index of occurrence of elem in the array or -1 if the element
     * is not present.
     */
    public int FindElement(T elem){

        /* Find the index k where is the top of the curve.*/
        int count = 0;
        while(count < list.size()){
            if(list.get(count).equals(elem)){
                return count;
            }
            count++;
        }

        /*After this it checks the second portion of the array. The descending
        portion, however since we now know the beginning and end indices its
        simple to now just binary search*/

        return binarySearch(elem, count, list.size() - 1);
    }

    /**
     * The following method searches the occurrence of an item in a list and returns
     * its index of occurrence if its present and -1 otherwise.
     * @param begin Beginning of sub array.
     * @param end   End of subArray
     * @param elem This is the item to search.
     * @return The index of occurrence of elem if its present, -1 otherwise.
     */
    public int binarySearch(T elem, int begin, int end){

        int mid = (begin + end)/2;
        if(begin <= end) {
            if (list.get(mid).compareTo(elem) < 0) {
                return binarySearch(elem, begin, mid - 1);
            } else if (list.get(mid).compareTo(elem) > 0) {
                return binarySearch(elem,mid + 1, end);
            } else if (list.get(mid).compareTo(elem) == 0) {
                return mid;
            }
        }
        return -1;
    }
}
