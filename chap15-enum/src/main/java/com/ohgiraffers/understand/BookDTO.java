package main.java.com.ohgiraffers.understand;

public class BookDTO {

    private String title;
    private String author;
    private String num;
    private Genre genre;
    private boolean isBorrowed;


    // constructor
    public BookDTO(String title, String author, String num, Genre genre) {
        this.title = title;
        this.author = author;
        this.num = num;
        this.genre = genre;
    }

    //getter setter

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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
//      왜 이 아이만 안썼나?
/*    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }*/

    public void borrowBook(){

    }


}
