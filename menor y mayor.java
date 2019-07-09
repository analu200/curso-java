/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;


public class Practica1 {
   
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        int n1,n2,n3;
        System.out.println("INGRESA NUM1 : ");
        n1=scanner.nextInt();
        
        System.out.println("INGRESA NUM2 : ");
        n2=scanner.nextInt();
        
        System.out.println("INGRESA NUM3 : ");
        n3=scanner.nextInt();
        
        if ( n1>n2 & n1>n3){
        System.out.println(n1);
        
        }
       else
        if(n2>n3 & n2>n1){   
        System.out.println(n2);    
        }
          
        else{
           System.out.println(n3);     
          
       
         }
    
    }
}
