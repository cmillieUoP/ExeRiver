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

public class Meeting implements Subject{
    //This is the unique meeting ID
    private int meetingID;
    //This is a list of meeting attendees
    //The intention here is to source the list by people registering their attendance
    //private ArrayList meetingAttendees;
    //This is a title to briefly describe the meeting
    private String meetingTitle;
    //This is the type of meeting, telephone or face to face
    private String meetingType;
    //This the the recorded date of the meeting
    private String meetingDate;
    //This is attribute associated with the meeting notes
    //This may be a stored as files within the class so people
    //can upload text files of the meeting and save them
    private String meetingNotes;
    private ArrayList meetingAttendees;
    
    private ArrayList meetingObservers;
    
    //Code for observers to notify them of a change to the meeting notes
    public Meeting() {
        meetingObservers = new ArrayList();
    }
    @Override
    public void addObserver(Observer o){
        meetingObservers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        int i = meetingObservers.indexOf(o);
        if (i >= 0) {
            meetingObservers.remove(i);
        }
    }
    
    @Override
    public void notifyObservers(){
       for (int i = 0; i < meetingObservers.size(); i++) {
           Observer observer = (Observer)meetingObservers.get(i);
           //observer.updateBookDetails(profR1Rating,profR2Rating,editorRating,profR1Comments,profR2Comments,overallAcceptStatus,manuscriptAgreed);
       } 
    }
    public void meetingNotesChanged(){
        notifyObservers();
    }
    
    public void setMeetingNotes(String meetingNotes){
        this.meetingNotes = meetingNotes;
        meetingNotesChanged();
    }
    
    public String getMeetingNotes() {
        return meetingNotes;
    }
    
    
    public void addAttendees() {
        meetingAttendees = new ArrayList();
        meetingAttendees.add("input when registered to meeting");
        meetingAttendees.remove("input when attendee is removed");
        //https://www.dummies.com/programming/java/use-array-lists-in-java/
    }
    
    public void printMeetingDetails(){
        System.out.println("Meeting Title is: " + meetingTitle);
        System.out.println("Meeting Type is: " + meetingType);
        System.out.println("Date of the Meeting is: " + meetingDate);
        }
    
    public void createMeeting(){
       Meeting meetingOne = new Meeting();
       meetingOne.meetingTitle = "Review of James and the Giant Peach";
       meetingOne.meetingType = "Telephone";
       meetingOne.meetingDate = "01/04/2019";
       meetingOne.printMeetingDetails();
    }
    
    
}
