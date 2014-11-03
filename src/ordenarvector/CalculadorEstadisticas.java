/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarvector;

/**
 *
 * @author usuario
 */
public class CalculadorEstadisticas {

    public CalculadorEstadisticas() {
    }
//calcula los datos estadísticos para un tamaño de vector en concreto ,hace la media  con 10 ejmplares
//oredenados aleatoriamente  y calcula los datos estadísticos para un ejmplar en orden inverso y 
// devuelve un vector con estos 2 elementos

    public static DatosEstadisticos[] estadisticaOrdenaVector(Ordenar1Vector ordenaVector, int size) {
        DatosEstadisticos datosEstadistico = new DatosEstadisticos();
        double contador = 0;
        for (int i = 0; i < 10; i++) {
            ordenaVector.ordena(GeneraCaso.generaVector(size, true), datosEstadistico);
            contador += datosEstadistico.dameTiempo();
        }

        datosEstadistico.añadeTiempo(contador / 10);
        DatosEstadisticos datosEstadisticosImpar = new DatosEstadisticos();
        ordenaVector.ordena(GeneraCaso.generaVector(size, false), datosEstadisticosImpar);
        return new DatosEstadisticos[]{datosEstadisticosImpar, datosEstadistico};
    }
 //calcula los datos estadísticos para una secuencia de vectores de distintos tamaños 
    public static DatosEstadisticos[][] estadisticasOrdenaVectores(OrdenarVector m, int[] tam_vectores) {
        DatosEstadisticos[][] datosEstadisticos = new DatosEstadisticos[2][tam_vectores.length];
        DatosEstadisticos[] tempCalculadorEstadistica;
        for (int i = 0; i < tam_vectores.length; i++) {
            tempCalculadorEstadistica = estadisticaOrdenaVector(new Ordenar1Vector(), tam_vectores[i]);
            datosEstadisticos[0][i] = tempCalculadorEstadistica[0];
            datosEstadisticos[1][i] = tempCalculadorEstadistica[1];

        }
        return datosEstadisticos;
    }
}
