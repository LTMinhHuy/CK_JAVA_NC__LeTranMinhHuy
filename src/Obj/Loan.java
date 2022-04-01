/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obj;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Loan {
    private Borrower borrower_23;
    private Date issueDate_23;
    private Date returnDate_23;
    private Members bookIssuer_23;
    private Members bookReceiver_23;
    private Book book_23;
    //private Item itemObj;

    public Loan(Borrower borrower, Date issueDate, Date returnDate, Members bookIssuer, Members bookReceiver, Book book) {
        this.borrower_23 = borrower;
        this.issueDate_23 = issueDate;
        this.returnDate_23 = returnDate;
        this.bookIssuer_23 = bookIssuer;
        this.bookReceiver_23 = bookReceiver;
        this.book_23 = book;
    }
/////////////////////////////////////// GETTERS & SETTERS /////////////////////////////////////////////
    public Borrower getBorrower() {
        return borrower_23;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower_23 = borrower;
    }

    public Date getIssueDate() {
        return issueDate_23;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate_23 = issueDate;
    }

    public Date getReturnDate() {
        return returnDate_23;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate_23 = returnDate;
    }

    public Members getBookIssuer() {
        return bookIssuer_23;
    }

    public void setBookIssuer(Members bookIssuer) {
        this.bookIssuer_23 = bookIssuer;
    }

    public Members getBookReceiver() {
        return bookReceiver_23;
    }

    public void setBookReceiver(Members bookReceiver) {
        this.bookReceiver_23 = bookReceiver;
    }

    public Book getBook() {
        return book_23;
    }

    public void setBook(Book book) {
        this.book_23 = book;
    }

  ///////////////////////////////////////////////////////////////////////////////////////////////

    // extending loan date
    public void extendIssueDate(Date newIssueDate) // renewing the issue date
    {
        this.issueDate_23 = newIssueDate;
    }
}
