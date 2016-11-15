/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.login;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Felipe
 */
public class FileHandler {

    public void writeToFile(File file, String post, String username){
          try {
               DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
               Date dateobj = new Date();
               BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
               
               writer.write("<h3>" + post + " </h3><h5> "  + df.format(dateobj) + " Posted by: " + username + "</h5>\n");
               //writer.write( "  " + df.format(dateobj));
               writer.close(); 

          } catch (IOException e) { 
               e.printStackTrace();
          }
    }
}
