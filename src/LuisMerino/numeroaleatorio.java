/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuisMerino;

import java.util.Random;

/**
 *
 * @author Leonor
 */
public class numeroaleatorio {
 public static void main(String arg[]) {

            int a, b, c;

            Random rnd = new Random();

            a = (rnd.nextInt(26) + 65);

            b = (rnd.nextInt(26) + 65);

            c = (rnd.nextInt(26) + 65);

            System.out.println(a);        

            System.out.println(b);        

            System.out.println(c);        

      }

 }