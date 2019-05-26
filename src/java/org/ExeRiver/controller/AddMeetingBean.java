/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ExeRiver.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.ExeRiver.model.Meeting;

/**
 *
 * @author Millie Coombes
 */
@ManagedBean(name= "AddMeetingBean")
@RequestScoped
public class AddMeetingBean {

    private String meetingID;
    private String meetingTitle;
    private String meetingType;
    private String meetingDate;
    private String meetingNotes;
    private String meetingAttendees;
    private Meeting meeting;
    
   
    
    public AddMeetingBean() {
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

    public String getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(String meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getMeetingNotes() {
        return meetingNotes;
    }

    public void setMeetingNotes(String meetingNotes) {
        this.meetingNotes = meetingNotes;
    }

    public String getMeetingAttendees() {
        return meetingAttendees;
    }

    public void setMeetingAttendees(String meetingAttendees) {
        this.meetingAttendees = meetingAttendees;
    }

    public void addMeeting(){
        meeting = new Meeting("MEXXX", "Title", "Type", "DD/MM/YYYY", "TBC");
    }
}
