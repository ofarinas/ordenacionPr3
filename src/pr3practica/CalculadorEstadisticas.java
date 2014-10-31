/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3practica;

/**
 *
 * @author usuario
 */
public class CalculadorEstadisticas {


    public CalculadorEstadisticas() {
    }

    public DatosEstadisticos[] estadisticaOrdenaVector(OrdenaVector ordenaVector, int size) {
        DatosEstadisticos datosEstadistico = new DatosEstadisticos();
        double contador = 0;
        for (int i = 0; i < 10; i++) {
            ordenaVector.ordena(GeneraCaso.generaVector(size, true), datosEstadistico);
            contador+=datosEstadistico.dameTiempo();
        }
        
        datosEstadistico.añadeTiempo(contador/10);
        DatosEstadisticos datosEstadisticosImpar=new DatosEstadisticos();
         ordenaVector.ordena(GeneraCaso.generaVector(size, false), datosEstadisticosImpar);
        return new DatosEstadisticos[]{ datosEstadisticosImpar,datosEstadistico};
    }

}
