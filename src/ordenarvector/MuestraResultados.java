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
public class MuestraResultados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = {1000, 2000,4000,8000, 16000, 32000};
        System.out.printf("%40s %10s\n","Vector en orden inversoTiempo   ","Vector en orden aleatorioTiempo");
        System.out.println("--------------------------------------------------------------------");
        DatosEstadisticos[][] datosEstadisticos = CalculadorEstadisticas.estadisticasOrdenaVectores(new Ordenar1Vector(), vector);
                for (int j = 0; j < vector.length; j++) {
            System.out.printf(" %1d %17.1f  %23.2f\n", vector[j], datosEstadisticos[0][j].dameTiempo(), datosEstadisticos[1][j].dameTiempo());
        }
        // System.out.printf("%.2f%n",f);

    }
}
