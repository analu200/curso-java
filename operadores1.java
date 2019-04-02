/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author PC20-LAB02
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("operadores aritmeticos");
         int a = 1+2;
         int b = a*4;
         int c = b/2;
         int d = c-a;
         int e = -d;
         System.out.println("a="+a);
         System.out.println("b="+b);
         System.out.println("c="+c);
         System.out.println("d="+d);
         System.out.println("e="+e);
         
         System.out.println("\nOperador Modulo (residuo):");
         System.out.println("x mod 10="+a%2);
         
         System.out.println("\nOperador Comkpuesto:");
         //a=a+4
         a+=2;
         b-=4;
         c*=a;
         System.out.println("a="+a);
         System.out.println("b="+b);
         System.out.println("c="+c);
         
         System.out.println("\nOperador Incremento:");
         //int a=a+1
         //puede reescribirse como
         a++;
         System.out.println("a="+a);
               
                         
        
       }
    
}
