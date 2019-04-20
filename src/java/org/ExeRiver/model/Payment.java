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
    //This is the ID for the editor involved in the payment
    private int editorID;
    //This is the ID for the agent involved in the payment
    private int agentID;
    //This is the ID for the author involved in the payment
    private int authorID;
    //This is the ID for the book that is the subject of the payment
    private int bookID;
    //This is the amount the payment is for
    private double amount;
    //This marks whether the payment is complete and agreed or still pending
    private boolean complete;
    
    private ArrayList paymentObservers;
    
    public Payment() {
        paymentObservers = new ArrayList();
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
       Payment paymentOne = new Payment();
       paymentOne.amount = 100.00;
       paymentOne.printPaymentDetails(); 
    }
    public void printPaymentDetails(){
        System.out.println("Payment to editor is: " + amount);
    }
    }
