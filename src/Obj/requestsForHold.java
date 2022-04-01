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
public class requestsForHold {
    private Borrower borrower_23;
    private Book book_23;
    Date dateOfRequest_23;

    public requestsForHold(Borrower borrower, Book book, Date dateOfRequest) {
        this.borrower_23 = borrower;
        this.book_23 = book;
        this.dateOfRequest_23 = dateOfRequest;
    }
    
    public void holdRequestsInfo()
    {
        System.out.println("The User " + borrower_23.getName() + " Requested Book: " + book_23.getTitle() + " On: " + dateOfRequest_23);
    }
    
        /////////////////////////// GETTERS & SETTERS /////////////////////////////////

    public Borrower getBorrower() {
        return borrower_23;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower_23 = borrower;
    }

    public Book getBook() {
        return book_23;
    }

    public void setBook(Book book) {
        this.book_23 = book;
    }

    public Date getDateOfRequest() {
        return dateOfRequest_23;
    }

    public void setDateOfRequest(Date dateOfRequest) {
        this.dateOfRequest_23 = dateOfRequest;
    }
    
}
