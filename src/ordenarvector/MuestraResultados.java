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
        int[] vector = {1123, 1212, 1331, 1123, 1312, 1456};
        System.out.printf("%36s %10s\n","Vector en orden inversoTiempo   ","Vector en orden aleatorioTiempo");
        System.out.println("--------------------------------------------------------------------");
        DatosEstadisticos[][] datosEstadisticos = CalculadorEstadisticas.estadisticasOrdenaVectores(new Ordenar1Vector(), vector);
                for (int j = 0; j < vector.length; j++) {
            System.out.printf(" %1d %7.3f %25s %20.2f\n", vector[j], datosEstadisticos[0][j].dameTiempo(),"|", datosEstadisticos[1][j].dameTiempo());
        }
        // System.out.printf("%.2f%n",f);

    }
}
