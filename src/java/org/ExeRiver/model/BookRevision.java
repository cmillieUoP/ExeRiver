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

public class BookRevision implements Subject {
    //This is the ID of the book, the revision is an
    //instance of
    private int bookID;
    //This is the ID of this particular revision
    private int revisionID;
    //This is the revision number, it will match how
    //many revisions have been made
    private int revisionNumber;
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
    
    public void addObserver(Observer o){
        bookRevisionObservers.add(o);
    }
    
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
           //observer.updateBookDetails(profR1Rating,profR2Rating,editorRating,profR1Comments,profR2Comments,overallAcceptStatus,manuscriptAgreed);
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
}
