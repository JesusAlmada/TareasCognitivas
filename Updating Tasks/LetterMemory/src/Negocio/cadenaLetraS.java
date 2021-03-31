/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Joshua
 */
public class cadenaLetraS {
    public String Cadena(){
        String let []={"B","C","D","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W","X","Y","Z"};
        int LetRandom=(int)Math.floor(Math.random()*21);
        
        return let[LetRandom];
    }
}
