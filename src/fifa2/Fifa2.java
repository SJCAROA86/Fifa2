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
public class Fifa2 {

    public static void rellenarDatos() {

        ArrayList<Equipo> equipos = new ArrayList<>();
        ArrayList<Jugador> jugadores;
        for (int i = 0; i < 40; i++) {
            jugadores = new ArrayList<>();

            for (int j = 0; j < 22; j++) {
                jugadores.add(new Jugador("1,85 m" + j, "80 Kg" + j, "ISCO" + j, "25"));

            }
            if (i < 20) {
                equipos.add(new EquipoPrimera("SANTIAGO BERANABEU" + i, 80000, "REAL MADRID" + i, "1901", new Entrenador("FRANCESA", "ZINEDINE ZIDANE" + i, "45 años"), new Masajista("098565", "PEDRO LÓPEZ"+i, "50 años"), jugadores));

            } else {
                equipos.add(new EquipoSegunda("ANOETA" + i, "1920", new Entrenador("ESPAÑOLA", "CAMACHO"+i, "55 años"),new Masajista("765498", "ALGONSO GIL"+i, "35 años"), jugadores));
            }

        }
    }
    
    public static void traspasar(Equipo origen, Equipo destino, Jugador j){
        destino.anadirJugador(j);
        origen.borrarJugador(j);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rellenarDatos();

    }
}
