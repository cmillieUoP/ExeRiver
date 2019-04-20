/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ExeRiver.model;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

/**
 *
 * @author Millie Coombes
 */
public class FileReader {
      public static void main(String[] args) { 
    try {
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj); 
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  } 
    /*
    private FileReader imgJames;
    public FileReader getImgJames() {
        
        return imgJames;
    }

    public void setImgJames(FileReader imgJames) {
        this.imgJames = imgJames;
    }
   
    public static void main(String args[]) throws IOException{
    BufferedImage imgJames = null;
try {
    imgJames = ImageIO.read(new File("/resources/images/theTwits.jpg"));
} catch (IOException e) {

}
*/
    }

    

