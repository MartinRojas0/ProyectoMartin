/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class controladorAutor {

    public void agregarPublicacion(Autor autor, Publicacion publicacionNueva) {
        try {
            autor.agregarPublicacion(publicacionNueva);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Autor crearAutor(String filiacion, String lineaInvestigacion, String nacionalidad, String nombre, int tamañoArreglo) {
        return new Autor(filiacion, lineaInvestigacion, nacionalidad, nombre, tamañoArreglo);
    }

    public Publicacion crearPublicacion(int año, String nombreRevista, String titulo) {
        return new Publicacion(año, nombreRevista, titulo);
    }

    public String imprimirAutor(Autor autor) {
        return autor.toString();
    }
}