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
public class Equipo {

    String nombre;
    String anoFundacion;

    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    Entrenador entrenador;
    Masajista masajista;

    public Equipo(String nombre, String anoFundacion, Entrenador entrenador, Masajista masajista, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.anoFundacion = anoFundacion;
        this.entrenador = entrenador;
        this.masajista = masajista;
        this.jugadores = jugadores;
    }

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnoFundacion() {
        return anoFundacion;
    }

    public void setAnoFundacion(String anoFundacion) {
        this.anoFundacion = anoFundacion;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Masajista getMasajista() {
        return masajista;
    }

    public void setMasajista(Masajista masajista) {
        this.masajista = masajista;
    }

    public void anadirJugador(Jugador jugador) {
        this.jugadores.add(jugador);

    }
    public void borrarJugador(Jugador jugador){
        this.jugadores.remove(jugador);
    }
}
