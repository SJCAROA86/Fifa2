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
public class Masajista extends Persona {

    String num_colegiado;

    public Masajista(String num_colegiado, String nombre, String edad) {
        super(nombre, edad);
        this.num_colegiado = num_colegiado;
    }

    public String getNum_colegiado() {
        return num_colegiado;
    }

    public void setNum_colegiado(String num_colegiado) {
        this.num_colegiado = num_colegiado;
    }

    public Masajista() {
    }

}
