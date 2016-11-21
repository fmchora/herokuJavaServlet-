package chris.zappapp.postapplication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris
 */
public class Post {
    public String name;
    public String subject;
    public String comment;
    
    public void setName(String name){
        this.name = name;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public void setComment(String comment){
        this.comment = comment;
    }
    
    public String getName(){
        return this.name;
    }
   
    public String getSubject(){
        return this.subject;
    }
   
    public String getComment(){
        return this.comment;
    }
}
