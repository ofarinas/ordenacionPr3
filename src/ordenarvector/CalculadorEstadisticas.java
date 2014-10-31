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

    public DatosEstadisticos[] estadisticaOrdenaVector(Ordenar1Vector ordenaVector, int size) {
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
