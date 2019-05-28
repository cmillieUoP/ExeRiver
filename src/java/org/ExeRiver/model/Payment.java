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

public class Payment implements Subject{
    private String paymentID;
    //This is the ID for the editor involved in the payment
    private String editorID;
    //This is the ID for the agent involved in the payment
    private String agentID;
    //This is the ID for the author involved in the payment
    private String authorID;
    //This is the ID for the book that is the subject of the payment
    private String bookID;
    //This is the amount the payment is for
    private double amount;
    //This marks whether the payment is complete and agreed or still pending
    private boolean complete;
    
    private ArrayList paymentObservers;
    
    public Payment(String paymentID, String editorID, String agentID, String authorID, String bookID, double amount, boolean complete) {
        this.paymentID = paymentID;
        this.editorID = editorID;
        this.agentID = agentID;
        this.authorID = authorID;
        this.bookID = bookID;
        this.amount = amount;
        this.complete = complete;
        
        paymentObservers = new ArrayList();
    }

    public String getPaymentID() {
        return paymentID;
    }
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }
    public String getEditorID() {
        return editorID;
    }
    public void setEditorID(String editorID) {
        this.editorID = editorID;
    }
    public String getAgentID() {
        return agentID;
    }
    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
    public String getAuthorID() {
        return authorID;
    }
    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }
    public String getBookID() {
        return bookID;
    }
    public void setBookID(String bookID) {
        this.bookID = bookID;
    }
    public boolean isComplete() {
        return complete;
    }
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    
    @Override
    public void addObserver(Observer o){
        paymentObservers.add(o);
    }
    
    @Override
    public void removeObserver(Observer o) {
        int i = paymentObservers.indexOf(o);
        if (i >= 0) {
            paymentObservers.remove(i);
        }
    }
    
    @Override
    public void notifyObservers(){
       for (int i = 0; i < paymentObservers.size(); i++) {
           Observer observer = (Observer)paymentObservers.get(i);
           //observer.updatePaymentDetails(amount, complete);
       } 
    }
    
    public void paymentInfoChanged(){
        notifyObservers();
    }
    
    public void setPaymentInfo(double amount, boolean complete){
        this.amount = amount;
        this.complete = complete;
        paymentInfoChanged();
    }
    
    public double getAmount() {
        return amount;
    }
    
    public boolean getComplete() {
        return complete;
    } 
    
    public void createPayment(){
       Payment paymentOne = new Payment("P001", "E001", "AG001", "AU001", "B0001", 100.00, false);
       paymentOne.printPaymentDetails(); 
    }
    public void printPaymentDetails(){
        System.out.println("Payment to editor is: " + amount);
    }
    }
