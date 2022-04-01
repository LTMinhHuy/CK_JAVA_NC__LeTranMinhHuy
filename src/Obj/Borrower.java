/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obj;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Borrower extends Person {
    
    private List<Loan> booksBorrowed_23; // books currently borrowed (Loans)
    private List<requestsForHold> holdRequests_23; // requests for put the book on hold by this user

    public Borrower(int id, String Name, String Address, String PhoneNo, String Password)
    {
        super(id, Name, Address, PhoneNo, Password);
        this.booksBorrowed_23 = new ArrayList();
        this.holdRequests_23 = new ArrayList();
    }

    ///////////////////////////////////// PRINTING FUNCTIONS ///////////////////////////////////////////
    public void printBorrowedBooks()
    {
        if (!booksBorrowed_23.isEmpty())
        { 
            System.out.println("Borrowed Books are: ");
                        
            for (int i = 0; i < booksBorrowed_23.size(); i++)
            {                      
                booksBorrowed_23.get(i).getBook().viewBookDetails();
            }
        }
        else
            System.out.println("No books have been borrowed yet.");  
    }
    
    public void printHoldRequests()
    {
         if (!holdRequests_23.isEmpty())
        { 
            System.out.println("Borrowed Books are: ");
                        
            for (int i = 0; i < holdRequests_23.size(); i++)
            {                      
                holdRequests_23.get(i).getBook().viewBookDetails();
            }
        }
        else
            System.out.println("No books have been borrowed yet.");  
    }
    public void printInfo()
    {
        super.printInfo();
        this.printBorrowedBooks();
        this.printHoldRequests();
    }
    //////////////////////////////////// ADD & REMOVE FUNCTIONS FOR BOOKS & REQUESTS ////////////////////////////
    public void borrowBook(Loan e) {
        booksBorrowed_23.add(e);
    }

    public void removeBorrowedBook(Loan i) 
    {
        booksBorrowed_23.remove(i);
    }
    
    
    public void addHoldRequest(requestsForHold e) {
        holdRequests_23.add(e);
    }

    public void removeHoldRequest(requestsForHold i) 
    {
        holdRequests_23.remove(i);
    }

    /////////////////////////// GETTERS & SETTERS /////////////////////////////////
    public List<Loan> getBooksBorrowed() {
        return booksBorrowed_23;
    }

    public void setBooksBorrowed(List<Loan> booksBorrowed) {
        this.booksBorrowed_23 = booksBorrowed;
    }

    public List<requestsForHold> getHoldRequests() {
        return holdRequests_23;
    }

    public void setHoldRequests(List<requestsForHold> holdRequests) {
        this.holdRequests_23 = holdRequests;
    }
    
    
    ////////////////////////////////////////////////////////////////////////////////////
    
    public void editBorrowerInformation() // updation
    {
        
    }
    public void addBooksBorrowed(Loan loan)
    {
        booksBorrowed_23.add(loan);
    }
     public void removeBooksBorrowed(int index) // by index
    {
        booksBorrowed_23.remove(index);
    }
      public void removeBooksBorrowed(Loan loan)
    {
        booksBorrowed_23.remove(loan);
    }
    
}