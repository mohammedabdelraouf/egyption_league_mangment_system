/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 *
 * @author mohammed abdelraouf
 */
public class files {
    
    static File players = new File("players.txt") ;
    static File teams = new File("teams.txt") ;
    static File matches = new File("matches.txt");
    static File stadiums = new File("stadiums.txt");
	 public static void createFile(File my_file){
	        try {  
	            
	             if (my_file.createNewFile()) {
	             System.out.println("File created: " + my_file.getName());
	        } else {
	             System.out.println("File  "+ my_file.getName()+" already exists." );
	             }
	        } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }
	    }
	 
	 public static void writeToFile(String line , File  file){
	        try {
	            FileWriter myWriter = new FileWriter(file);
	            myWriter.write(line);
	            myWriter.close();
	            System.out.println("Successfully wrote to the file.");
	        } catch (IOException e) {
	             System.out.println("An error occurred in writing.");
	            e.printStackTrace();
	        }
	    }
	 
	
	 
	 public static void insert_in_file (String object ,File file) { 
     try {
         Files.write(Paths.get(file.getAbsolutePath()), object.getBytes(), StandardOpenOption.APPEND);
         
        
      //   JOptionPane.showMessageDialog(rootPane, "Student Added Sucessfully", null,JOptionPane.INFORMATION_MESSAGE);
         System.out.println("Successfully wrote to the file.");
     } catch (IOException e) {
       System.out.println("An error occurred.");
       e.printStackTrace();
     }
	 
	 }
    
}
