
package basics.oopomodeling;

import java.util.Date;

public class Book {

    private String title;
    private String author;
    private Date releaseDate;
    private int numOfPages;
    private long ID;

    public Book(String title, String author, Date releaseDate, int numOfPages, long iD) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.numOfPages = numOfPages;
        this.ID = iD;
    }

    public Book(String title, long iD) {
        this.title = title;
        this.ID = iD;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
}
