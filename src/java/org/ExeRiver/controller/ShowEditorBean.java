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
import org.ExeRiver.model.Editor;

/**
 *
 * @author Millie Coombes
 */
 
@ManagedBean(name = "editor")  
@RequestScoped  
public class ShowEditorBean {    
public List<Editor> editorsList;  
public List<Editor> getEditorsList() {    
editorsList = new ArrayList<>();    
editorsList.add(new Editor("E0001","Laura", "Phillips", "15 Circle Way, Caldecott", "LPhillips", "IReadBooks"));       
return editorsList;  
}    
}  
