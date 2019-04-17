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
import java.util.Observer;

public interface Subject {
        //methods to add and remove observers
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	//method to notify observers of change
	public void notifyObservers();
	
}
