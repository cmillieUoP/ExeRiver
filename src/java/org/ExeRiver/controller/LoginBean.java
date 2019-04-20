/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ExeRiver.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Millie Coombes
 */
@ManagedBean
@SessionScoped
public class LoginBean {
    
    //Creates classes of userName and password, will need to link these to the Person attributes
    private String userName;
    private String password;
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    //Validate User Method, takes entered input and checks against a preset 
    //acceptable username and password. Dependent on whether this is correct 
    //or not the user will be taken to the success or failure page.
    public String validateUserLogin() {
        String navResult = "";
        System.out.println("Entered Username is= " + userName + ", password is= " + password);
        if (userName.equals("AgentUsername") && password.equals("AgentPassword")) {
            navResult = "success";}
        else if (userName.equals("AuthorUsername") && password.equals("AuthorPassword")) {
            navResult = "success"; }
        else if (userName.equals("CompanyAdminUsername") && password.equals("CompanyAdminPassword")) {
            navResult = "success"; }
        else if (userName.equals("EditorUsername") && password.equals("EditorPassword")) {
            navResult = "success"; }
        else if (userName.equals("ProfReviewerUsername") && password.equals("ProfReviewerPassword")) {
            navResult = "success"; }
         else {
            navResult = "failure";
        }
        return navResult;
    }
    
}
