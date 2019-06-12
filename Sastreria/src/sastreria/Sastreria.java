/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sastreria;

import java.util.Scanner; //Libreria

/**
 *
 * @author Alriosa
 */
public class Sastreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int METROS = 3; //constante
        int persona;
        int resultado;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Bienvenido al sistema Satreria ''Sastrecito Valiente S.A'' ");
        System.out.println("Digite el numero de personas");
        persona = in.nextInt();
        
        resultado = persona * METROS;
        
        System.out.println("La cantidad de metros de Tela es de "+ resultado);
        
        
        
    }
    
}
