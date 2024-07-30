/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Entity;

/**
 *
 * @author user
 */
public class BookCategoriesEntity {
    private int isbn;
    private String genre;
    private String title;
    private int copies;

    public BookCategoriesEntity() {
    }

    public BookCategoriesEntity(int isbn, String genre, String title, int copies) {
        this.isbn = isbn;
        this.genre = genre;
        this.title = title;
        this.copies = copies;
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
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the copies
     */
    public int getCopies() {
        return copies;
    }

    /**
     * @param copies the copies to set
     */
    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "BookCategoriesEntity{" + "isbn=" + isbn + ", genre=" + genre + ", title=" + title + ", copies=" + copies + '}';
    }
    
    
}
