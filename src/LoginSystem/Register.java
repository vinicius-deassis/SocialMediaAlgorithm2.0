/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginSystem;

/**
 *
 * @author Vinicius Assis
 */
public class Register {
    private String user;
    private String pass;
      
    public Register(String user, String pass){
       this.user = user;
       this.pass = pass;    
    }
    
    public String getUser(){
        return user;
    }
    public String getPass(){
        return pass;
    }
    
    public void setUser(String user){
        this.user = user;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
    @Override
    public String toString(){
        return "\nUser: " + getUser()+ "\nSenha: " + getPass();
    }
}
