/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ExeRiver.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.ExeRiver.model.Meeting;

/**
 *
 * @author Millie Coombes
 */
@ManagedBean (name= "AddMeetingBean")
@SessionScoped
public class AddMeetingBean {
    private String meetingID;
    private String meetingTitle;
    private String meetingType;
    private String meetingDate;
    private String meetingNotes;
    private String meetingAttendees;
    private Meeting meeting = new Meeting();
    private ArrayList<Meeting> meetingsList; 

    @PostConstruct
    public void init() {
        meetingsList = new ArrayList<>();
        //Creates preset meeting entries
        meeting =new Meeting("ME0001", "Review of James and the Giant Peach", "Telephone", "01/04/2019", "TBC", "Roald Dahl, Laura Phillips & Adrian Gent");
        meetingsList.add(meeting);
        
        meeting = new Meeting();
        //Saves entry to the model list
        meeting.setMeetingsList((ArrayList<Meeting>) meetingsList);
        //Resets the data entry for the next submission
        resetAdd();
    }
    
    public AddMeetingBean() {
    }

    public void addMeeting(){
        meeting = new Meeting();
        meeting = new Meeting(this.meetingID, this.meetingTitle, this.meetingType, this.meetingDate, this.meetingNotes, this.meetingAttendees);
        meetingsList.add(meeting);
        //Saves entry to the model list
        meeting.setMeetingsList((ArrayList<Meeting>) meetingsList);
        //Resets the data entry for the next submission
        meeting = new Meeting();
        resetAdd();
    }
 
    public List<Meeting> getMeetingsList() {
         return meetingsList;
    }
    public void resetAdd()
    {
        meeting = new Meeting();
    }

    //Gets and Sets

    public String getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(String meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getMeetingAttendees() {
        return meetingAttendees;
    }

    public void setMeetingAttendees(String meetingAttendees) {
        this.meetingAttendees = meetingAttendees;
    }

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    public String getMeetingID() {
        return meetingID;
    }

    public void setMeetingID(String meetingID) {
        this.meetingID = meetingID;
    }

    public String getMeetingNotes() {
        return meetingNotes;
    }

    public void setMeetingNotes(String meetingNotes) {
        this.meetingNotes = meetingNotes;
    }

    public String getMeetingTitle() {
        return meetingTitle;
    }

    public void setMeetingTitle(String meetingTitle) {
        this.meetingTitle = meetingTitle;
    }

    public String getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(String meetingType) {
        this.meetingType = meetingType;
    }

    
}
