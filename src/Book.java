/**
 * Created by CarlosSanchez on 1/27/17.
 */
public class Book implements Comparable{

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.title.compareTo(((Book)o).getTitle());
    }

    @Override
    public boolean equals(Object obj) {
        return this.title.equals(((Book)obj).title) && this.author.equals(((Book)obj).author);
    }
}
