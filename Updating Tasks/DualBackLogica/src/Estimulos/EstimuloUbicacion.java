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
public class EstimuloUbicacion {
    private int n;
    private int veces;
    private boolean tablero[] = {false,false,false,false,false,false,false,false};

    public boolean[] nuevoEstimulo(){
        for (int i = 0; i < tablero.length; i++) {
            tablero[i] = false;
        }
        int random = getRandomNumber(0, 8);
        tablero[random] = true;
        return tablero;
    }
    
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getVeces() {
        return veces;
    }

    public void setVeces(int veces) {
        if (veces < 3 && veces > 0){
            this.veces = veces;
        } else {
            System.out.println("n invalida, se esperaba 1-3");
        }
        
    }

    public boolean[] getTablero() {
        return tablero;
    }

    public void setTablero(boolean[] tablero) {
        this.tablero = tablero;
    }
    
    
}
