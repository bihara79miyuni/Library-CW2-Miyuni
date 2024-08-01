/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplelibrary.Entity;

/**
 *
 * @author user
 */
public class BookReservationEntity {
    private String memberId;
    private String bookId;
    private String bDate;
    private String dDate;
    private String rDate;

    public BookReservationEntity() {
    }

    public BookReservationEntity(String memberId, String bookId, String bDate, String dDate, String rDate) {
        this.memberId = memberId;
        this.bookId = bookId;
        this.bDate = bDate;
        this.dDate = dDate;
        this.rDate = rDate;
    }

    /**
     * @return the memberId
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
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
     * @return the bDate
     */
    public String getbDate() {
        return bDate;
    }

    /**
     * @param bDate the bDate to set
     */
    public void setbDate(String bDate) {
        this.bDate = bDate;
    }

    /**
     * @return the dDate
     */
    public String getdDate() {
        return dDate;
    }

    /**
     * @param dDate the dDate to set
     */
    public void setdDate(String dDate) {
        this.dDate = dDate;
    }

    /**
     * @return the rDate
     */
    public String getrDate() {
        return rDate;
    }

    /**
     * @param rDate the rDate to set
     */
    public void setrDate(String rDate) {
        this.rDate = rDate;
    }

    @Override
    public String toString() {
        return "BookReservationEntity{" + "memberId=" + memberId + ", bookId=" + bookId + ", bDate=" + bDate + ", dDate=" + dDate + ", rDate=" + rDate + '}';
    }
    
    
}
