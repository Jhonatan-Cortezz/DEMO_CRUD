/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuisMerino;

import java.util.Scanner;

/**
 *
 * @author Leonor
 */
public class numeromayoromenor {
 public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println ("Introduce un numero");
        num1 = teclado.nextInt();
        System.out.println ("Introduce otro numero");
        num2 = teclado.nextInt();
        if(num1==num2) {
            System.out.println ("Son iguales");
        }
        else if(num1>num2) {
            System.out.println ("El mayor e "+num1);		
        }
        else {
            System.out.println ("El mayor e "+num2); 
        }
    }
}
