/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifa2;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class EquipoPrimera extends Equipo {
    
    String nombreEstadio;

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    public int getCapacidadEstadio() {
        return capacidadEstadio;
    }

    public void setCapacidadEstadio(int capacidadEstadio) {
        this.capacidadEstadio = capacidadEstadio;
    }
    int capacidadEstadio;

    public EquipoPrimera() {
    }

    public EquipoPrimera(String nombreEstadio, int capacidadEstadio, String nombre, String anoFundacion, Entrenador entrenador, Masajista masajista, ArrayList<Jugador> jugadores) {
        super(nombre, anoFundacion, entrenador, masajista, jugadores);
        this.nombreEstadio = nombreEstadio;
        this.capacidadEstadio = capacidadEstadio;
    }

   
    
    
}
