/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifa2;

/**
 *
 * @author usuario
 */
public class Jugador extends Persona {

    String altura;
    String peso;

    public Jugador(String altura, String peso, String nombre, String edad) {
        super(nombre, edad);
        this.altura = altura;
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Jugador() {
    }


}
