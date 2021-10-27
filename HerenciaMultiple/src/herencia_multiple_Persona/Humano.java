/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_multiple_Persona;

/**
 *
 * @author Usuario
 */
public class Humano implements Adulto, Niño{
    
    public static void main(String[] args) {
        Humano persona = new Humano();
    }
    
    public Humano(){
        juega();
        rie();
        Adulto.trabaja();
        duerme();
        Adulto.duerme();
    }
    
    public void juega(){
        System.out.println("Esto es muy divertido");
    }
    public void rie(){
        System.out.println("jajajajaj");
    }
    public void duerme(){
        System.out.println("Zzz");
    }
    
    
    
}
