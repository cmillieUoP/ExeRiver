/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ExeRiver.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;
import java.util.ArrayList;
import org.ExeRiver.model.Payment;

/**
 *
 * @author Millie Coombes
 */
 
@ManagedBean(name = "payment")  
@RequestScoped  
public class ShowPaymentBean {    
public List<Payment> paymentsList;  
public List<Payment> getPaymentsList() {    
paymentsList = new ArrayList<>();    
paymentsList.add(new Payment("P001", "E001", "AG001", "AU001", "B0001", 100.00, false));    
paymentsList.add(new Payment("P002", "E001", "AG001", "AU001", "B0002", 110.00, false));    
return paymentsList;  
}    
}  
