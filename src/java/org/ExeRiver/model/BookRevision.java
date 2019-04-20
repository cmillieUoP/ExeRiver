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

public class BookRevision implements Subject {
    //This is the ID of the book, the revision is an
    //instance of
    private String bookRID;
    //This is the ID of this particular revision
    private String revisionID;
    //This is the revision number, it will match how
    //many revisions have been made
    private int revisionNumber;
    //This is the ID of the book the revision belongs to
    private String mainBookID;
    //This is the title of the book the revision belongs to
    private String mainBookTitle;
    //This is the manuscript for this revision, as submitted
    //by the author
    private String manuscript;
    //These are the comments about the current revision as entered
    //by the editor
    private String editorComments;
    
    private ArrayList bookRevisionObservers;

    public BookRevision() {
        bookRevisionObservers = new ArrayList();
    }
    
    @Override
    public void addObserver(Observer o){
        bookRevisionObservers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        int i = bookRevisionObservers.indexOf(o);
        if (i >= 0) {
            bookRevisionObservers.remove(i);
        }
    }
    
    @Override
    public void notifyObservers(){
       for (int i = 0; i < bookRevisionObservers.size(); i++) {
           Observer observer = (Observer)bookRevisionObservers.get(i);
           observer.updateBookRevisionDetails(editorComments, manuscript);
       } 
    }
    
    public void BookRevisionInfoChanged(){
        notifyObservers();
    }
    
    public void setBookRevisionInfo(String editorComments, String manuscript){
        this.editorComments = editorComments;
        this.manuscript = manuscript;
        BookRevisionInfoChanged();
    }
    
    public String getEditorComments() {
        return editorComments;
    }
    
    public String getManuscript() {
        return manuscript;
    }
    
    public void printBookRDetails(){
        System.out.println("Book Revision ID is: " + bookRID);
        System.out.println("This is a revision of the Book: " + mainBookTitle);
        }
    
    public void createBookRevision(){
       BookRevision bookROne = new BookRevision();
       bookROne.bookRID = "BR0001";
       bookROne.mainBookID = "B0001";
       bookROne.mainBookTitle = "James and the Giant Peach";
       bookROne.printBookRDetails(); 
       BookRevision bookRTwo = new BookRevision();
       bookRTwo.bookRID = "BR0002";
       bookRTwo.mainBookID = "B0002";
       bookRTwo.mainBookTitle = "The Twits";
       bookRTwo.printBookRDetails();  
    }
}
