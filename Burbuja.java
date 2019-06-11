/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

import java.util.Arrays;

/**
 *
 * @author PC20-LAB02
 */
public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int []  a= {27,5,13,7,10};
     int tem;
      System.out.println("NUMEROS DESORDENADOS"+Arrays.toString(a));
         for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                    tem=a[j+1];
                    a[j+1]=a[j];
                    a[j]=tem;
                }
            }
         }
          
System.out.println("NUMEROS ORDENADOS"+Arrays.toString(a));
    }
}
    
    
