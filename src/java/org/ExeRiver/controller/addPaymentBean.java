/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ExeRiver.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Millie Coombes
 */
@ManagedBean
@RequestScoped
public class addPaymentBean {

    private String paymentAmount;
    private String paymentComplete;
   
    
    public addPaymentBean() {
    }
 
    public String getpaymentAmount() {
        return paymentAmount;
    }
 
    public void setpaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
 
    public String getpaymentComplete() {
        return paymentComplete;
    }
 
    public void setpaymentComplete(String paymentComplete) {
        this.paymentComplete = paymentComplete;
    }
    
    
    public void addPayment(){
        
    }
}
