/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Entity;

/**
 *
 * @author user
 */
public class BookDetailsEntity {
    private String bookId;
    private int isbn;
    private String author;
    private String publisher;
    private String language;

    public BookDetailsEntity() {
    }

    public BookDetailsEntity(String bookId, int isbn, String author, String publisher, String language) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.language = language;
    }

    /**
     * @return the bookId
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    /**
     * @return the isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "BookDetailsEntity{" + "bookId=" + bookId + ", isbn=" + isbn + ", author=" + author + ", publisher=" + publisher + ", language=" + language + '}';
    }
    
    
}
