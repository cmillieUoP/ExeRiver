/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ExeRiver.model;

/**
 *
 * @author Millie Coombes
 */
import java.util.ArrayList;

public class Author extends User {
	
public ArrayList booksWritten;
public Subject book;
public Subject bookRevision;
public Subject meeting;
public Subject payment;
        
    //This is the constructor for an author
    public Author(/*Subject book*/){
        //this.book = book;
        //book.addObserver(this);
        }
    //These are the methods for adding the author as an observer
    //to these subjects
    public void assignBook(Subject book){
        //this.book = book;
        book.addObserver(this);
    }
    public void assignBookRevision(Subject bookRevision){
        //this.book = book;
        book.addObserver(this);
    }
    public void assignMeeting(Subject meeting){
        //this.meeting = meeting;
        meeting.addObserver(this);
    }
    public void assignPayment(Subject payment){
        //this.payment = payment;
        payment.addObserver(this);
    }
    
    //These override the update methods as stated in the Observer interface
    //When updates happen to the subjects the values passed after the method
    //will be updated in the author observer.
        @Override
	public void updateBookDetails(int profR1Rating, int profR2Rating, int editorRating, String profR1Comments, String profR2Comments, boolean overallAcceptStatus, boolean manuscriptAgreed){
            
        }
        @Override
        public void updateBookRevisionDetails(String editorComments, String manuscript){
            
        }
        @Override
        public void updatePaymentDetails(float amount, boolean complete){
            
        }
        @Override
        public void updateMeetingDetails(String meetingNotes){
            
        }

        public void createAuthor() {
        Author authorOne = new Author();
        authorOne.personalID = "AU0001";
        authorOne.forename = "Roald";
        authorOne.surname = "Dahl";
        authorOne.address = "83 High Street, Great Missenden";
        authorOne.username = "RDahl";
        authorOne.password = "WillyWonka";
        authorOne.printAuthorDetails();
        Author authorTwo = new Author();
        authorTwo.personalID = "AU0002";
        authorTwo.forename = "Daphne";
        authorTwo.surname = "Du Maurier";
        authorTwo.address = "Jamaica Inn, Bolventor, Launceston";
        authorTwo.username = "DDMaurier";
        authorTwo.password = "MaximDeWinter";
        authorTwo.printAuthorDetails();
        }
        public void printAuthorDetails(){
            System.out.println("Author name is: " + forename + " " + surname);
            System.out.println("Author address is: " + address);
            System.out.println("Author password is: " + password + " ...Sshhh");
        }
        
        public void addBooksWritten() {
        booksWritten = new ArrayList();
        booksWritten.add("input when registered to book");
        booksWritten.remove("input when PR is no longer registered to book");
        //https://www.dummies.com/programming/java/use-array-lists-in-java/
        }
        public void writeBook(){

        }
        public void submitBookRevision(){

        }
        @Override
        public void agreeFinalManuscript() {
        //When the agree button is clicked in the author screen it triggers 
        //a request to the editor to agreeFinalManuscript, when they have both
        //clicked this the manuscriptAgreed boolean value in the book to true
        } 
        
        
        
}