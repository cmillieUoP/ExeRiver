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
import org.ExeRiver.model.ProfessionalReviewer;

/**
 *
 * @author Millie Coombes
 */
 
@ManagedBean(name = "profReviewer")  
@RequestScoped  
public class ShowProfReviewerBean {    
public List<ProfessionalReviewer> profReviewersList;  
public List<ProfessionalReviewer> getProfessionalReviewersList() {    
profReviewersList = new ArrayList<>();    
profReviewersList.add(new ProfessionalReviewer("PR0001","Dylan","Pratt","67 Park Row, Edstone","DPratt","PagesOfBooks"));       
return profReviewersList;  
}    
}  
