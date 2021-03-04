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
public class ManejadorEstimulos {

    private int n, tamanio;
    private EstimuloUbicacion nuevoEstimulo = new EstimuloUbicacion();
    private EstimuloUbicacion viejoEstimulo = new EstimuloUbicacion();

    public void inicializarEstimulo() {
        nuevoEstimulo.setVeces(8);
        nuevoEstimulo.setN(2);
        nuevoEstimulo.nuevoEstimulo();
    }

    public void iterar(int n) {
        this.n = n;
        int diff = 0;
        inicializarEstimulo();
        diff++;

        for (int i = 0; i <= tamanio; i++) {

        }
    }

    public EstimuloUbicacion getNuevoEstimulo() {
        return nuevoEstimulo;
    }

    public void setNuevoEstimulo(EstimuloUbicacion nuevoEstimulo) {
        this.nuevoEstimulo = nuevoEstimulo;
    }

    public EstimuloUbicacion getViejoEstimulo() {
        return viejoEstimulo;
    }

    public void setViejoEstimulo(EstimuloUbicacion viejoEstimulo) {
        this.viejoEstimulo = viejoEstimulo;
    }
}
