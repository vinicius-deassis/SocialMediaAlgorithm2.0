/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginSystem;
import java.util.ArrayList;
public class RegisterDatabase {
    private ArrayList<Register> registerList;
    
    public RegisterDatabase(){
        registerList = new ArrayList();     
    }
    
    public void SendRegister(Register r){
        registerList.add(r);
    }
    
    public String ShowRegisters(){
        String iterator = "";
        for(Register r: registerList){
            iterator += r;
        }
        return iterator;
    }
    
    public boolean CheckRegister(Register r){
        boolean login = false;
        int found = 0;
        for(Register check:registerList){
            if(check.getUser().equals(r.getUser()) && check.getPass().equals(r.getPass())){
                System.out.println("ok");
            }
            else{
                found = found +1;               
            }
        }
        if(found == registerList.size()){
            System.out.println("Nao encontrado");
            login = false;
        }
        else{
            login = true;
        }
        return login;
    }
}
