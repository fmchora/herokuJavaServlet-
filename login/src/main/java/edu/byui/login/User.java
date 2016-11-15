/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.login;

/**
 *
 * @author Felipe
 */
public class User {
   public String username;
   public String password;
   
   public void setUserName(String username){
       this.username = username;
   }
   public void setPassword(String password){
       this.password = password;
   }
   
   public String getUserName(){
       return this.username;
   }
   
   public String getPassword(){
       return this.password;
   }
      
}
