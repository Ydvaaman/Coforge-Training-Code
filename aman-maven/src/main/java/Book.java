public class Book {
    private int isbn;
    private String bname;
    private String author;
    private float cost;

    private Chapter chapter;

    public Book(int isbn, String bname, String author, float cost,Chapter chapter) {
        this.isbn = isbn;
        this.bname = bname;
        this.author = author;
        this.chapter = chapter;
        this.cost = cost;


    }

    public Chapter getChapter() {
        return chapter;
    }

    public int getIsbn() {
        return isbn;
    }

    public float getCost() {
        return cost;
    }

    public String getAuthor() {
        return author;
    }

    public String getBname() {
        return bname;
    }
}
