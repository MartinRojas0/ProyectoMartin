/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Publicacion {
    private final int año;
    private final String nombreRevista;
    private final String titulo;

    public Publicacion(int año, String nombreRevista, String titulo) {
        this.año = año;
        this.nombreRevista = nombreRevista;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "año=" + año +
                ", nombreRevista='" + nombreRevista + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
