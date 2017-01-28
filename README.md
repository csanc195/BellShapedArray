# BellShapedArray
Program that allows to search for an item in a bell shaped array.

The following program solves the simple problem of a bell shaped List of elements. Imagine a collection such as an array
which has elements which present a unique value, such as numbers, starting at <b>index 0</b> with value <b>i</b> through <b>index k</b>
with value <b>j</b> strictly increasing, the collection then continues with items of value <b>j-1</b> through <b>m</b> strictly decreasing. Notice 
that <b>i</b>, <b>j</b> and <b>m</b> are all natural numbers, where <b>m</b> is any number less than <b>j</>.
<h3> The following array is an simple example of such collection:</h3>

<b>int [] arr</b> = {<i>1, 3, 5, 7, 9, 11, 10, 8, 6, 5, 2, 0</i>};

<h3> Proposed solution: </h3>
The solution on this program is of the order <b>O(k)</b> where <b>k < n</b> and its divided in two main steps:

<ol>
  <li> Find the index of the top of the bell(k) </li>
    <li> Continue to search through the rest of the list using binary search. </li>
</ol>

<h3> Performance </h3>
<p> The algorithm's performance can be determined by the cost of part 1 added with the cost of part 2. <b>O(part1)</b> +</b> <b>O(part2)</b></p>
<p>
On the worst case where the element is not in the list, the algorithm's runtime complexity is determined by the cost of finding 
the index k, where k < n and added with the cost of performing binary search on the remaining elements. The final cost is 
<b>O(k)</b> + <b>O(log(n-k))</b> which is k. Hoever if the structure is very "Bell shaped", that is: there are almost the same amount of items
to the left and rigth of k, or if the aray is inclined to the left, that is: there are significantly more elements int the n-k to n half
than there are in the 0 to n half, then the runtime complexity of the algorithm while still linear will be significantly faster than simple linear search.
</p>
<h3>Solution</h3>
<p>
The solution here included makes use of java generics to facilitate to find an occurrence in lists of any reference type. A bell shaped list of any object can 
be searched through using the implemented functions, provieded that the user provides their own implementations of comparable's <b>compareTo()</b>.
</p>







