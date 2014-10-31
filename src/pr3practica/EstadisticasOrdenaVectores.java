/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3practica;

/**
 *
 * @author ENTRAR
 */
public class EstadisticasOrdenaVectores {

    public static DatosEstadisticos[][] estadisticasOrdenaVectores(OrdenarVector m, int[] tam_vectores) {
        DatosEstadisticos[][] datosEstadisticos = new DatosEstadisticos[2][tam_vectores.length];
        CalculadorEstadisticas calculadorEstadisticas = new CalculadorEstadisticas();
        DatosEstadisticos[]tempCalculadorEstadistica;
        for (int i = 0; i < tam_vectores.length; i++) {
               tempCalculadorEstadistica=calculadorEstadisticas.estadisticaOrdenaVector(new OrdenaVector(),tam_vectores[i]);
               datosEstadisticos[0][i]=tempCalculadorEstadistica[0];
               datosEstadisticos[1][i]=tempCalculadorEstadistica[1];
                       
        }
        return datosEstadisticos;
    }
}
