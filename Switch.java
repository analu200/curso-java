/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author PC20-LAB02
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes=15;
        String estacion;
        switch(mes){
            case 1: case 2: case 12:
              System.out.println(estacion="invierno");
                            break;
            case 3: case 4: case 5:
              System.out.println(estacion="primavera");
                            break; 
            case 6: case 7: case 8:                
              System.out.println(estacion="verano");
                            break;
            case 9: case 10: case 11:
              System.out.println(estacion="otoño");
                            break; 
            default:
              System.out.println("mes incorrecto"); 
        }
        
         
    }
    
}
