/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajas;

/**
 *
 * @author PC20-LAB02
 */
public class PruevaCaja {
    public static void main(String[] args)
    {
        Caja v=new Caja(3,2,6);
        int resultado = v.volumen();
        System.out.println("El volumen de la caja es:"+resultado);
        
    }
}
