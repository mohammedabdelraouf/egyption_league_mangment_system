/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.ArrayList;

/**
 *
 * @author Mohamed Magdy
 */
public class referee extends person{
    ArrayList <matchs> listMatch ;
    public referee(String name, double height, double weight)
    {
     this.name = name;
     this.height = height;
     this.weight = weight;
     this.listMatch = new ArrayList<matchs>();  
    
    }
    
   
}
