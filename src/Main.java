import java.util.ArrayList;
import java.util.List;

/**
 * Created by CarlosSanchez on 1/27/17.
 */
public class Main {
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        BellShapedArrayFind someBell = new BellShapedArrayFind(bookList);

        bookList.add(new Book("Alphas", "Some Author"));
        bookList.add(new Book("Cars", "Some Author"));
        bookList.add(new Book("Epsilons", "Some Author"));
        bookList.add(new Book("Grant", "Some Author"));
        bookList.add(new Book("Iota", "Some Author"));
        bookList.add(new Book("Kappa", "Some Author"));
        bookList.add(new Book("Hums", "Some Author"));
        bookList.add(new Book("Fork", "Some Author"));
        bookList.add(new Book("Deltas", "Some Author"));
        bookList.add(new Book("Betas", "Some Author"));

        Book someBook = new Book("Fork", "Some Author");
        int index = someBell.FindElement(someBook);
        String answer = (index < 0) ?
                ("The element is not present.") :
                ("The element " + someBook + " is present at index " + index);
        System.out.println(answer);

    }
}
