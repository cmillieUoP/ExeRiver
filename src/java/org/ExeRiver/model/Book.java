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

import java.util.Observer;
import java.util.ArrayList;


public class Book implements Subject {
    public int bookID;
    public String bookTitle;
    //This is the ID of the first professional reviewer assigned to the book
    public int profRID1;
    //This is the ID of the second professional reviewer assigned to the book
    public int profRID2;
    public int editorID;
    public int authorID;
    //This is the ID of the agent who is assigned to deal with the book
    public int agentID;
    //This is the rating out of five the first professional reviewer gives to the book
    public int profR1Rating;
    //This is the rating out of five the second professional reviewer gives to the book
    public int profR2Rating;
    //This is the rating out of five from the editor
    public int editorRating;
    //These are the comments from the first professional reviewer
    public String profR1Comments;
    //These are the comments from the second professional reviewer
    public String profR2Comments;
    //This records whether the professional reviewer one accepted or rejected the book
    public boolean profR1Accept;
    //This records whether the professional reviewer two accepted or rejected the book
    public boolean profR2Accept;
    //This records whether the book has been accepted or not, the intention is to 
    //take the first prof reviewer as the final decision so if both accept or PR1 accepts 
    //then the book is accepted etc.
    public boolean overallAcceptStatus;
    //This records the current revision the book is at, this shall be fed from the bookRevision class
    public int currentRevision;
    //This notes whether the current revision is final
    public boolean manuscriptAgreed;
    //This notes whether the Book has been accepted to advance to publication
    //This can be entered by an editor or reviewers
    public boolean advancePublication; 
    
    private ArrayList bookObservers;
    
    public Book() {
        bookObservers = new ArrayList();
    }
 
    public void addObserver(Observer o){
        bookObservers.add(o);
    }
    
    public void removeObserver(Observer o) {
        int i = bookObservers.indexOf(o);
        if (i >= 0) {
            bookObservers.remove(i);
        }
    }
    
    @Override
    public void notifyObservers(){
       for (int i = 0; i < bookObservers.size(); i++) {
           Observer observer = (Observer)bookObservers.get(i);
           //observer.updateBookDetails(profR1Rating,profR2Rating,editorRating,profR1Comments,profR2Comments,overallAcceptStatus,manuscriptAgreed);
       } 
    }
    
    public void bookValuesChanged(){
        notifyObservers();
    }
    
    public void setBookValues(int profR1Rating, int profR2Rating, int editorRating, String profR1Comments, String profR2Comments, boolean overallAcceptStatus, boolean manuscriptAgreed){
        this.profR1Rating = profR1Rating;
        this.profR2Rating = profR2Rating;
        this.editorRating = editorRating;
        this.profR1Comments = profR1Comments;
        this.profR2Comments = profR2Comments;
        this.overallAcceptStatus = overallAcceptStatus;
        this.manuscriptAgreed = manuscriptAgreed;
    }
    
    public void getBookValues(int profR1Rating, int profR2Rating, int editorRating, String profR1Comments, String profR2Comments, boolean overallAcceptStatus, boolean manuscriptAgreed){
        this.profR1Rating = profR1Rating;
        this.profR2Rating = profR2Rating;
        this.editorRating = editorRating;
        this.profR1Comments = profR1Comments;
        this.profR2Comments = profR2Comments;
        this.overallAcceptStatus = overallAcceptStatus;
        this.manuscriptAgreed = manuscriptAgreed;
    }
    
    
    public void printBookDetails(){
            System.out.println("Book Title is " + bookTitle);
        }
    
    
}
