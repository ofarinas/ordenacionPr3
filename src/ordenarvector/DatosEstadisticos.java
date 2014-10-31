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
class DatosEstadisticos {

    private double tiempo;

    public DatosEstadisticos() {
    }

    public void añadeTiempo(double tiempoTemp) {
        tiempo += tiempoTemp;
    }

    public double dameTiempo() {
        return tiempo;
    }

    public void estableceTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

}
