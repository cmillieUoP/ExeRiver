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
import java.util.Observer;

public class Author extends User {
	
private ArrayList booksWritten;
private Subject Book;
private Subject BookRevision;
private Subject Meeting;
private Subject Payment;
        
    //This is the constructor for an author
    public Author(Subject bookID){
        
        Subject book = bookID;
        this.Book = book;
        Book.addObserver((Observer) this);
        }
    
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
        
        public void printAuthorDetails(){
            System.out.println("Name:" + forename + surname);
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