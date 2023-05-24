/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LoginSystem;
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Register conta1 = new Register("vini","vini2023");
        Register conta2 = new Register("nic","nic2023");
        Register testecheck = new Register("teste","teste");
        
        RegisterDatabase teste1 = new RegisterDatabase();
        
        teste1.SendRegister(conta1);
        teste1.SendRegister(conta2);
        
        teste1.CheckRegister(testecheck);
        teste1.CheckRegister(conta1);
        
        System.out.println(teste1.ShowRegisters());
        
        
    }
    
}
