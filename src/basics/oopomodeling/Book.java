
package basics.oopomodeling;

import java.util.Date;

public class Book {

    private String title;

    private String author;

    private Date releaseDate;

    private int numOfPages;

    private long ID;

    public String category;

    public Book() {
    }

    public Book(String title, long iD) {
        this.title = title;
        ID = iD;
    }

    public Book(String title, String author, Date releaseDate, int numOfPages, long iD, String category) {
        super();
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.numOfPages = numOfPages;
        ID = iD;
        this.category = category;
    }

}
