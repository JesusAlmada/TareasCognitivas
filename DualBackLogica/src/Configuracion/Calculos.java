/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

/**
 *
 * @author Joshua
 */
public class Calculos {
    
 
//    /**
//     * este metodo calcula si es correcto
//     * @return un boolean
//     */
//    public boolean Correcto(){
//        
//    }
//    /**
//     * este metodo calcula las falsas alarmas
//     */
//    public void FalsAlarma(){
//        
//    }
    /**
     * este metodo es para la deteccion de señal
     *
     * @param TAciertos
     * @param TFalsAlarma
     * @return deteccion de señal
     */
    public double DeteccionSeñal(double TAciertos, double TFalsAlarma) {
        double d = TAciertos - TFalsAlarma;
        return d;
    }
//    /**
//     * este metodo calcula los fallos
//     */
//    public void Fallos(){
//        
//    }


}
