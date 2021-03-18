/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estimulos;

/**
 *
 * @author based-bulio
 */
public class tests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstimuloUbicacion au =  new EstimuloUbicacion();
        System.out.println(au.nuevoEstimulo());
        
        for (int i = 0; i < au.getTablero().length; i++) {
            boolean[] a = au.getTablero();
            System.out.println(a[i]);
        }
    }

}
