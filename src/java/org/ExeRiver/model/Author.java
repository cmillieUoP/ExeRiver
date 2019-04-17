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
//import java.util.Observer;

public class Author extends User {
	
private ArrayList booksWritten;
private Subject Book;
        
    //This is the constructor for an author
    public Author(Subject Book,int ID, String fName, String sName, String address, String p, String uName){
        this.personalID = ID;
        this.forename = fName;
        this.surname = sName;
        this.address = address;
        this.password = p;
        this.username = uName;
       
        this.Book = Book;
        Book.addObserver(this);
    }
    
        @Override
	public void updateBookDetails(int profR1Rating, int profR2Rating, int editorRating, String profR1Comments, String profR2Comments, boolean overallAcceptStatus, boolean manuscriptAgreed){
            
        }
        @Override
        public void updateBookRevisionDetails(){
            
        }
        @Override
        public void updatePaymentDetails(){
            
        }
        @Override
        public void updateMeetingDetails(){
            
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
        public void agreeFinalManuscript() {
        
        } 
        
        
        
}