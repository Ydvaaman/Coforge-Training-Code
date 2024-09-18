import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookTest {
    Book book[];

    @BeforeEach
    void setup() {
        book = new Book[3];
        book[0] = new Book(1001, "java in action", "p kumar", 2100,
                new Chapter(1, "java basic", 10));

        book[1] = new Book(1002, "java in dummies", "r kumar", 2200,
                new Chapter(2, "OOP", 20));

        book[2] = new Book(1003, "java in beginner", "suresh kumar", 2300,
                new Chapter(3, "java basic", 40));

        for (Book b : book) {
            System.out.println("book data");
            System.out.println("\t" + b.getIsbn() + "\t" + b.getBname() + "\t" + b.getCost() + "\t" + b.getAuthor());

            System.out.println("\nchapter data");
            Chapter chp = b.getChapter();
            System.out.println(b.getChapter().getChapterNo() + "\t" + chp.getChapterName() + "\t" + chp.getPageNo());
        }

    }

    @Test
    void booktest() {
        System.out.println("Test program");
        Assertions.assertEquals(3, book.length);
        Assertions.assertNotNull(book);
        Assertions.assertNotNull(book[0]);
        Assertions.assertNotNull(book[1]);
        Assertions.assertNotNull(book[2]);

        Assertions.assertEquals(book[0].getChapter().getChapterNo(), 1);
        Assertions.assertEquals(book[1].getAuthor(), "r kumar");

        String nm[] = new String[book.length];
        int index = 0;
        for (Book b : book)
            nm[index++] = b.getAuthor();

        index = 0;
        for (String name : nm)
            Assertions.assertEquals(book[index++].getAuthor(), name);



    }
}
