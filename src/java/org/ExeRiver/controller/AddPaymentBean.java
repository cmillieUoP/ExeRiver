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
import org.ExeRiver.model.Payment;

/**
 *
 * @author Millie Coombes
 */
@ManagedBean (name= "AddPaymentBean")
@SessionScoped
public class AddPaymentBean {

    private String paymentID;
    private String editorID;
    private String agentID;
    private String authorID;
    private String bookID;
    private double amount;
    private boolean complete;
    private Payment payment = new Payment();
    private ArrayList<Payment> paymentsList;

    @PostConstruct
    public void init() {
        paymentsList = new ArrayList<>();
        //Creates preset payment entries
        payment = new Payment("P001", "E001", "AG001", "AU001", "B0001", 100.00, false);
        paymentsList.add(payment);
        
        payment = new Payment();
        //Saves entry to the model list
        payment.setPaymentsList((ArrayList<Payment>) paymentsList);
        //Resets the data entry for the next submission
        resetAdd();
    }
    
    public AddPaymentBean() {
    }

    public void addPayment(){
        payment = new Payment();
        payment = new Payment(this.paymentID, this.editorID, this.agentID, this.authorID, this.bookID, this.amount, this.complete);
        paymentsList.add(payment);
        //Saves entry to the model list
        payment.setPaymentsList((ArrayList<Payment>) paymentsList);
        //Resets the data entry for the next submission
        payment = new Payment();
        resetAdd();
    }
 
    public List<Payment> getPaymentsList() {
         return paymentsList;
    }
    public void resetAdd()
    {
        payment = new Payment();
    }
 
    //Gets and sets

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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setPaymentsList(ArrayList<Payment> paymentsList) {
        this.paymentsList = paymentsList;
    }

}