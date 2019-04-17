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
import java.util.Observable;
import java.util.Observer;

public abstract class ProfessionalReviewer extends Reviewer{
    //This is a list of booksReviewed
    //The intention here is to source the list by books the PR has been assigned to
    //private ArrayList booksReviewed;
    
    //Update code for the professional reviewer
    Observable observable;
    private String meetingNotes;
    
    public ProfessionalReviewer(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof Meeting) {
            Meeting meeting = (Meeting)obs;
            this.meetingNotes = meeting.getMeetingNotes();
        }
    }
    /*
    public addBooksReviewed() {
        booksReviewed = new ArrayList();
        booksReviewed.add(//input when registered to book);
        booksReviewed.remove(//input when PR is no longer registered to book);
        //https://www.dummies.com/programming/java/use-array-lists-in-java/
    }
    */
}
