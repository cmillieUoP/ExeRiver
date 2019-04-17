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

public class ProfessionalReviewer extends User{
    //This is a list of booksReviewed
    //The intention here is to source the list by books the PR has been assigned to
    private ArrayList booksReviewed;
    private Subject Book;
    private Subject Payment;
    private Subject Meeting;
    
    public ProfessionalReviewer(){
             
        this.Book = Book;
        Book.addObserver((Observer) this);
        }
    @Override
    public void updateBookDetails(int profR1Rating, int profR2Rating, int editorRating, String profR1Comments, String profR2Comments, boolean overallAcceptStatus, boolean manuscriptAgreed){

    }
    
    @Override
    public void updatePaymentDetails(float amount, boolean complete){

    }
    @Override
    public void updateMeetingDetails(String meetingNotes){

    }
    
    public void addBooksReviewed() {
        booksReviewed = new ArrayList();
        booksReviewed.add("input when registered to book");
        booksReviewed.remove("input when PR is no longer registered to book");
        //https://www.dummies.com/programming/java/use-array-lists-in-java/
    }
    
}
