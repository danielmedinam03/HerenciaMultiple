/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_multiple_Figura;

/**
 *
 * @author Usuario
 */
public class Cuadrado implements Figura{

    int lado;
    public Cuadrado(int ladoParametro){
        lado = ladoParametro;
    }
     public int area(){
         return lado*lado;
     }
}
