/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;
import java.util.Scanner;

/**
 *
 * @author andre
 */
//control = java
//modelo
public class Repasandoparatalleres {
    int num = 5;
    
    public String holaMundo(){
        String hola = "Hola mundo";
        
        return hola;
    }
    public int scanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite la edad: "); // cout
        int edad = scanner.nextInt(); // cin
        scanner.close();
        return edad;
    }
    
    public String edadMundo(){
        int edad = scanner();
        String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        
        return mensaje;
    }
    
    
    //vista
    public static void main(String[] args){
        Repasandoparatalleres wer = new Repasandoparatalleres();
        System.out.println("Hola mundo !");
        System.out.println(wer.holaMundo());
        System.out.println(wer.edadMundo());
         
    }
}
