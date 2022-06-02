/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import project1.person;

/**
 *
 * @author Mohamed Magdy
 */
public class player extends person {
   
	    private String team = new String () ;
	    private String position = new String () ;
	    String id = new String() ;

	    public player() {
	    }

	    public player(String id , String name , String team , String position , double height, double weight ) {
	        super(name, height, weight);
	        this.team= team ; 
	        this.position = position ; 
                this.id = id ;
	    }

	    public String getTeam() {
	        return team;
	    }

	    public void setTeam(String team) {
	        this.team = team;
	    }

	    public String getPosition() {
	        return position;
	    }

	    public void setPosition(String position) {
	        this.position = position;
	    }
	    
	    
	    
	   public static ArrayList<player>list = new ArrayList<player>();
	    
	    public  String list_toString()
	    {
		 String res = "";
	     for(int i = 0  ; i < list.size() ; i++){
	         res += list.toString();
	     }
	     return res;
	    }
	    
	    
	    @Override
	    public String toString()
	    {
	         return  this.id + "\n" +this.name + "\n" + this.team + "\n"+ this.position + "\n" + 
                         this.weight  +"\n"+  this.height+"\n"   ;
	    }
	           
    public static  void read_file(File file )
        {
             try {
               
                Scanner reader = new Scanner(file);
                 while (reader.hasNextLine()) {
                     String id = reader.nextLine();
                     String name = reader.nextLine();
                     String team = reader.nextLine();
                     String position = reader.nextLine();
                     String weight = reader.nextLine();
                     String height = reader.nextLine();
                     
                     player p;
                    p = new player( id, name , team ,position , Double.parseDouble(height) ,
                            Double.parseDouble(weight) );
                     list.add(p);
                  }
                
                  reader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                     e.printStackTrace();
                }
        }
    
}
