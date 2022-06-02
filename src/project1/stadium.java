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
public class stadium {
    String stadName;
    String stadLoc;
    int seatCap;
    ArrayList <matchs> listMatches;
    
    public stadium (String stadName , String stadLoc , int seatCap){
        this.seatCap = seatCap;
        this.stadLoc = stadLoc;
        this.stadName = stadName;
        this.listMatches = new ArrayList<matchs>();
    } 
}
