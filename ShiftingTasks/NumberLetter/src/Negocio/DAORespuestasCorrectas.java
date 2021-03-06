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
public class DAORespuestasCorrectas implements IDAO, ITiempoReaccion {

    /**
     * este metodo calcula el tiempo total de las respuestass correctas en toda
     * la tarea
     *
     * @param x tiempo de reaccion de las respuestas correctas en el bloque de
     * solo letras
     * @param y tiempo de reaccion de las repsuestas correctas en el bloque de
     * solo numeros
     * @param z tiempo de reaccion de las respuestas correctas en el bloque
     * alternado
     * @return tct tiempo total de las respuestas correctas en toda la tarea
    *
     */
    @Override
    public double Total(double x, double y, double z) {
        return x + y + z;
        
    }

    /**
     * este metodo calcula el costo del shifting global con el tiempo total de
     * las respuestas correctas
     *
     * @param x tiempo de reaccion de las respuestas correctas en el bloque de
     * solo letras
     * @param y tiempo de reaccion de las repsuestas correctas en el bloque de
     * solo numeros
     * @param z tiempo de reaccion de las respuestas correctas en el bloque
     * alternado
     * @return cgc costo del shifting global con el tiempo total de las
     * respuestas correctas
     *
     */
    @Override
    public double CostoShiftingGlobal(double x, double y, double z) {
        return(z - ((x + y) / 2));
        
    }

    /**
     * este metodo calcula el costo del shifting local con el tiempo total de
     * las respuestas correctas
     *
     * @param x tiempo total en los cuadrantes impares del bloque alternado con
     * shifting
     * @param y tiempo total en los cuadrantes pares del bloque alternado sin
     * shifting
     * @return clc costo del shifting local con el tiempo total de las
     * respuestas correctas
     *
     */
    @Override
    public double CostoShiftingLocal(double x, double y) {
        return x - y;
        
    }

    /**
    *este metodo calcula las respuestas correctas en toda la tarea
    *@param x respuestas correctas en el bloque de solo letras
    *@param y respuestas correctas en el bloque de solo numeros
    *@param z respestas correctas en el bloque alternado
    *@return rct respuestas correctas en toda la tarea
     **/
    @Override
    public double RespuestasTotalTarea(double x, double y, double z) {
        return x + y + z;
        
    }

    /**
     * este metodo calcula el tiempo de reaccion promedio de las respuestas
     * correctas del bloque de solo letras
     *
     * @param x tiempo de reaccion de las respuestas correctas en el bloque de
     * solo letras
     * @param y respuestas correctas en el bloque de solo letras
     * @return tpl tiempo de reaccion promedio de las respuestas correctas del
     * bloque de solo letras
     *
     */
    @Override
    public double TiempoReaccionPromedioBloqueLetras(double x, double y) {
        return  (x / y);
        
    }

    /**
     * este metodo calcula el tiempo de reaccion promedio de las respuestas
     * correctas del bloque de solo numeros
     *
     * @param x tiempo de reaccion de las respuestas correctas en el bloque de
     * solo numeros
     * @param y respuestas correctas en el bloque de solo numeros
     * @return tpn tiempo de reaccion promedio de las respuestas correctas del
     * bloque de solo numeros
    *
     */
    @Override
    public double TiempoReaccionPromedioBloqueNumeros(double x, double y) {
        return (x / y);
        
    }

    /**
     * este metodo calcula tiempo de reaccion promedio de las respuestas
     * correctas del bloque alternado
     *
     * @param x tiempo de reaccion de las respuestas correctas en el bloque
     * alternado
     * @param y respuestas correctas en el bloque alternado
     * @return TPa tiempo de reaccion promedio de las respuestas correctas del
     * bloque alternado
     *
     */
    @Override
    public double TiempoReaccionPromedioBloqueAlterno(double x, double y) {
        return (x / y);
    }

    /**
     * este metodo calcula el tiempo de reaccion promedio de las respuestas
     * correctas de toda la tarea
     *
     * @param x tiempo total de las respuestas correctas en toda la tarea
     * @param y respuestas correctas en toda la tarea
     * @return tpt tiempo de reaccion promedio de las respuestas correctas de
     * toda la tarea
     *
     */
    @Override
    public double TiempoReaccionPromedioTodaTarea(double x, double y) {
        return  (x / y);
    }

    /**
    este metodo calcula el costo de shifting global con el tiempo de reaccion promedio de las respuestas correctas
    @param z tiempo de reaccion promedio de las respuestas correctas del bloque alternado
    @param x tiempo de reaccion promedio de las respuestas correctas del bloque de solo letras
    @param y  tiempo de reaccion promedio de las respuestas correctas del bloque de solo numeros
    @return cgp costo del shifting global con el tiempo de reaccion promedio de las respuestas correctas
     */
    @Override
    public double CostoShiftingGlobalTiempoReaccion(double x, double y, double z) {
        return  (z - ((x + y) / 2));
       
    }

    /**
     * este metodo calcula el tiempo de reaccion promedio de las respuestas
     * correctas en los cuadrantes impares del bloque alternado
     *
     * @param x tiempo de reaccion de las respuestas correctas en los cuadrantes
     * impares del bloque alternado
     * @param y respuestas correctas en los cuadrantes impares del bloque
     * alternado
     * @return tpi tiempo de reaccion promedio de las respuestas correctas en
     * los cuadrantes impares del bloque alternado
     *
     */
    @Override
    public double TiempoReaccionPromedioCuadranteImparAlternado(double x, double y) {
        return (x / y);
    }

    /**
     * este metodo calcula el tiempo de reaccion promedio de las respuestas
     * correctas en los cuadrantes pares del bloque alternado
     *
     * @param x tiempo de reaccion total de las respuestas correctas en los
     * cuadrantes pares del bloque alternado
     * @param y cantidad de respuestas correctas en los cuadrantes pares del
     * bloque alternado
     * @return tpp tiempo de reaccion promedio de las respuestas correctas en
     * los cuadrantes del bloque alternado
     */
    @Override
    public double TiempoReaccionPromedioCuadranteParAlternado(double x, double y) {
         return(x / y);
    }

    /**
     * este metodo calcula el costo del shifting local con el tiempo de reaccion
     * promedio de las respuestas correctas
     *
     * @param x tiempo de reaccion promedio de las respuestas correctas en los
     * cuadrantes impares del bloque alternado
     * @param y tiempo de reaccion de las respuestas correctas en los cuadrantes
     * pares del bloque alternado
     * @return clp costo del shifting local con el tiempo de reaccion promedio
     * de las respuestas correctas
     *
     */
    @Override
    public double CostoShiftingLocalTiempoReaccion(double x, double y) {
        return (x - y);
    }

    // con todas las respuestas sin distincion entre errores y aciertos descartando aquellas superiores e 
    /**
     * este metodo permite calcular el tiempo total de las respuestas correctas
     * en toda la tarea
     *
     * @param tcal tiempo de reaccion de las respuestas correctas en el bloque
     * de solo letras
     * @param tcan tiempo de reaccion de las respuestas correctas en el bloque
     * de solo numeros
     * @param tcaa tiempo de reaccion de las respuestas correctas en el bloque
     * alternado
     * @return tcat tiempo total de las respuestas correctas en toda la tarea
     *
     */
    public double TieTotResCorrTodTar(double tcal, double tcan, double tcaa) {
        return tcal + tcan + tcaa;
    }

    /**
     * este metodo permite calcular el costo del shifting global con el tiempo
     * total de las respuestas correctas
     *
     * @param tcaa tiempo de reaccion de las respuestas correctas en el bloque
     * alternado
     * @param tcal tiempo de reaccion de las respuestas correctas en el bloque
     * solo letras
     * @param tcan tiempo de reaccion de las respuestas correctas en el bloque
     * solo numeros
     * @return cgac costo del shifting global con el tiempo total de las
     * respuestas correctas
     *
     */
    public double CosShiftGlobTieTotResCorr(double tcaa, double tcal, double tcan) {
        return ( tcaa - ((tcal + tcan) / 2));
    }

    /**
     * este metodo permite calcular el costo de shifting local con el tiempo
     * total de las respuestas correctas
     *
     * @param tai tiempo total en los cuadrantes impares del bloque alternado
     * @param tap tiempo total en los cuadrantes pares del bloque alternado
     * @return clac costo del shifting local con el tiempo total de las
     * respuestas correctas
     *
     */
    public double CosShiftLocTieTotResCorr(double tai, double tap) {
        return tai - tap;
    }

    /**
     * este metodo permite calcular las respuestas correctas en toda la tarea
     *
     * @param rcal respuestas correctas en el bloque de solo letras
     * @param rcan respuestas correctas en el bloque de solo numeros
     * @param rcaa respuestas correctas en el bloque alternado
     * @return rcat respuestas correctas en toda la tarea
     *
     */
    public double RespCorrTodTar(double rcal, double rcan, double rcaa) {
        return rcal + rcan + rcaa;
    }

    /**
     * este metodo permite calcular el tiempo de reaccion promedio de las
     * respuestas correctas del bloque de solo letras
     *
     * @param tcal tiempo de reaccion total de las respuestas correctas en el
     * bloque de solo letras
     * @param rcal respuestas correctas en el bloque de solo letras
     * @return tpal tiempo de reaccion promedio de las respestas correctas del
     * bloque de solo letras
     *
     */
    public double tieReacPromResCorrBloqLet(double tcal, double rcal) {
        return tcal / rcal;
    }

    /**
     * este metodo permite calcular el tiempo de reaccion promedio de las
     * respuestas corrects del bloque de solo numeros
     *
     * @param tcan tiempo de reaccion total de las respuestas correctas en el
     * bloque de numeros
     * @param rcan respuestas correctas en el bloque de solo numeros
     * @return tpan tiempo de reaccion promedio de las respuestas correctas del
     * bloque de solo numeros
    *
     */
    public double TieReacPromResCorrBloqNum(double tcan, double rcan) {
        return tcan / rcan;
    }

    /**
     * este metodo permite calcular el tiempo de reaccion promedio de las
     * respuestas correctas del bloque alternado
     *
     * @param tcaa tiempo de reaccion total de las respuestas correctas en el
     * bloque alternado
     * @param rcaa respuestas correctas en el bloque alternado
     * @return tpaa tiempo de reaccion promedio de las respuestas correctas del
     * bloque alternado
     *
     */
    public double TieReacPomResCorrBloqAlt(double tcaa, double rcaa) {
        return tcaa / rcaa;
    }

    /**
     * este metodo permite calcular el tiempo de reaccion promedio de las
     * respuestas correctas de toda la tarea
     *
     * @param tcat tiempo de reaccion total de las respuestas correctas en los 3
     * bloques
     * @param rcat cantidad total de respuestas correctas en los 3 bloques
     * @return tpat tiempo de reaccion rpomedio de las respuestas correctas de
     * toda la tarea
     *
     */
    public double TieReacPromResCorrTodTar(double tcat, double rcat) {
        return tcat / rcat;
        
    }

    /**
     * este metodo permite calcular el costo del shifting global con el tiempo
     * de reaccion promedio de las respuestas correctas
     *
     * @param tpaa tiempo de reaccion promedio de las respuestas correctas del
     * bloque alternado
     * @param tpal tiempo de reaccion promedio de als respuestas correctas del
     * bloque de solo letras
     * @param tpan tiempo de reaccion promedio de las respuestas correctas del
     * bloque de solo numeros
     * @return CGap costo del shifting global con el tiempo de reaccion promedio
     * de las respuestas correctas
     *
     */
    public double CosShiftGlobTieReaPromResCorr(double tpaa, double tpal, double tpan) {
        return tpaa - ((tpal + tpan) / 2);
        
    }

    /**
     * este metodo permite calcular el tiempo de reaccion promedio de las
     * respuestas correctas en los cuadrantes impares del bloque alternado
     *
     * @param tcai tiempo de reaccion total de las respuestas correctas en los
     * cuadrantes impares del bloque alternado
     * @param rcai cantidad de respuestas correctas en los cuadrantes impares
     * del bloque alternado
     * @return tpai tiempo de reaccion rpomedio de las respuestsa correctas en
     * lso cuadrantes impares del bloque alternado
     *
     */
    public double TieReaPromResCorrCuadImpBloqAlt(double tcai, double rcai) {
        return tcai / rcai;
        
    }

    /**
     * este metodo permite calcular el costo del shifting local con el tiempo de
     * reaccion promedio de las respuestas correctas
     *
     * @param tpai tiempo de reaccion promedio de las respuestas dorrectas en
     * los cuadrantes impares del bloque alternado
     * @param tpap tiempo de reaccion promedio de las respuestas correctas en
     * los cuadrantes pares del bloque alternado
     * @return clap costo del shifting local con el tiempo de reaccion promedio
     * de las respuestas correctas
     *
     */
    public double CosShiftLocTieReaPromResCorr(double tpai, double tpap) {
        return tpai - tpap;
        
    }

}
