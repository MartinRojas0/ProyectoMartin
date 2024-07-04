/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;
///
/**
 *
 * @author LAB-USR-LNORTE
 */
public class Autor {
    private int cantidadPublicaciones;
    private String filiacion;
    private String lineaInvestigacion;
    private String nacionalidad;
    private String nombre;
    private Publicacion[] publicaciones;
    
    public Autor(String filiacion, String lineaInvestigacion, String nacionalidad, String nombre, int tamañoArreglo) {
        this.filiacion = filiacion;
        this.lineaInvestigacion = lineaInvestigacion;
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        this.publicaciones = new Publicacion[tamañoArreglo];
        this.cantidadPublicaciones = 0;
    }

    public void agregarPublicacion(Publicacion publicacionNueva) throws Exception {
        if (cantidadPublicaciones < publicaciones.length) {
            publicaciones[cantidadPublicaciones++] = publicacionNueva;
        } else {
            throw new Exception("No se pueden agregar más publicaciones.");
        }
    }

    public int getCantidadPublicaciones() {
        return cantidadPublicaciones;
    }

    public String getFiliacion() {
        return filiacion;
    }

    public String getLineaInvestigacion() {
        return lineaInvestigacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Publicacion[] getPublicaciones() {
        return publicaciones;
    }

    public void setCantidadPublicaciones(int cantidadPublicaciones) throws Exception {
        if (cantidadPublicaciones > publicaciones.length) {
            throw new Exception("La cantidad de publicaciones excede el tamaño del arreglo.");
        }
        this.cantidadPublicaciones = cantidadPublicaciones;
    }

    public void setFiliacion(String filiacion) {
        this.filiacion = filiacion;
    }

    public void setLineaInvestigacion(String lineaInvestigacion) {
        this.lineaInvestigacion = lineaInvestigacion;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPublicaciones(Publicacion[] publicaciones) {
        this.publicaciones = publicaciones;
    }

    @Override
    public String toString() {
        StringBuilder publicacionesStr = new StringBuilder();
        for (Publicacion pub : publicaciones) {
            if (pub != null) {
                publicacionesStr.append(pub.toString()).append("\n");
            }
        }
        return "Autor: " + nombre + " Publicaciones:\n" + publicacionesStr.toString();
    }
}