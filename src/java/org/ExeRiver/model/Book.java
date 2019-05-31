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
import java.util.List;

public class Book implements Subject {
    public String bookID;
    public String bookTitle;
    //This is the string reference that can be used to route to the file in the html
    public String bookImageRef;
    //This is the ID of the first professional reviewer assigned to the book
    public String profRID1;
    //This is the ID of the second professional reviewer assigned to the book
    public String profRID2;
    public String editorID;
    public String authorID;
    public String authorName;
    //This is the ID of the agent who is assigned to deal with the book
    public String agentID;
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
    private ArrayList booksList;
    
    public Book(String bookID, String bookTitle, String profRID1, String profRID2,String editorID, String authorID, String authorName, String agentID) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.profRID1 = profRID1;
        this.profRID2 = profRID2;
        this.editorID = editorID;
        this.authorID = authorID;
        this.authorName = authorName;
        this.agentID = agentID;
        bookObservers = new ArrayList();
    }

    public Book(){
    }

    //Gets and Sets
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getProfRID2() {
        return profRID2;
    }

    public void setProfRID2(String profRID2) {
        this.profRID2 = profRID2;
    }
    
    
    public String getBookID(){
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookImageRef() {
        return bookImageRef;
    }

    public void setBookImageRef(String bookImageRef) {
        this.bookImageRef = bookImageRef;
    }

    public String getProfRID1() {
        return profRID1;
    }

    public void setProfRID1(String profRID1) {
        this.profRID1 = profRID1;
    }

    public String getEditorID() {
        return editorID;
    }

    public void setEditorID(String editorID) {
        this.editorID = editorID;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
    
    public int getProfR1Rating() {
        return profR1Rating;
    }

    public void setProfR1Rating(int profR1Rating) {
        this.profR1Rating = profR1Rating;
    }

    public int getProfR2Rating() {
        return profR2Rating;
    }

    public void setProfR2Rating(int profR2Rating) {
        this.profR2Rating = profR2Rating;
    }

    public int getEditorRating() {
        return editorRating;
    }

    public void setEditorRating(int editorRating) {
        this.editorRating = editorRating;
    }

    public String getProfR1Comments() {
        return profR1Comments;
    }

    public void setProfR1Comments(String profR1Comments) {
        this.profR1Comments = profR1Comments;
    }

    public String getProfR2Comments() {
        return profR2Comments;
    }

    public void setProfR2Comments(String profR2Comments) {
        this.profR2Comments = profR2Comments;
    }

    public boolean isProfR1Accept() {
        return profR1Accept;
    }

    public void setProfR1Accept(boolean profR1Accept) {
        this.profR1Accept = profR1Accept;
    }

    public boolean isProfR2Accept() {
        return profR2Accept;
    }

    public void setProfR2Accept(boolean profR2Accept) {
        this.profR2Accept = profR2Accept;
    }

    public boolean isOverallAcceptStatus() {
        return overallAcceptStatus;
    }

    public void setOverallAcceptStatus(boolean overallAcceptStatus) {
        this.overallAcceptStatus = overallAcceptStatus;
    }

    public int getCurrentRevision() {
        return currentRevision;
    }

    public void setCurrentRevision(int currentRevision) {
        this.currentRevision = currentRevision;
    }

    public boolean isManuscriptAgreed() {
        return manuscriptAgreed;
    }

    public void setManuscriptAgreed(boolean manuscriptAgreed) {
        this.manuscriptAgreed = manuscriptAgreed;
    }

    public boolean isAdvancePublication() {
        return advancePublication;
    }

    public void setAdvancePublication(boolean advancePublication) {
        this.advancePublication = advancePublication;
    }

    public ArrayList getBooksList() {
        return booksList;
    }
    
    public void setBooksList(ArrayList booksList) {
        this.booksList = booksList;
    }

    public void saveBook(Book book) {
        booksList.add(book);
    }

    @Override
    public void addObserver(Observer o){
        bookObservers.add(o);
    }
    @Override
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
           observer.updateBookDetails(profR1Rating,profR2Rating,editorRating,profR1Comments,profR2Comments,overallAcceptStatus,manuscriptAgreed);
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
        System.out.println("Book ID is: " + bookID);
        System.out.println("Book Title is: " + bookTitle);
        System.out.println("Book Author is: " + authorName);
        System.out.println("Book Cover Reference is: /resources/images/books/" + bookImageRef);
        }
    
    public void createBook(){
       Book bookOne = new Book();
       bookOne.bookImageRef = "JATGP.jpg";
       bookOne.printBookDetails(); 
    }
}
