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
public class team {
    String teamName;
    ArrayList <player> list ;
     ArrayList <matchs> listOFmatches ;
    
    
    public team(String teamName)
    {
    
    this.teamName = teamName;
    this.list= new ArrayList<player>();
    this.listOFmatches = new ArrayList <matchs> ();
    
    }
    
    
}
