/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;
/**
 *
 * @author LAB-USR-LNORTE
 */
public class vistaAutor {

    public static void main(String[] args) {
        controladorAutor controlador = new controladorAutor();

        // Crear autores
        Autor autor1 = controlador.crearAutor("Universidad ABC", "Investigación XYZ", "Peruana", "Juan Perez", 10);
        Autor autor2 = controlador.crearAutor("Instituto DEF", "Investigación LMN", "Colombiana", "Maria Lopez", 5);

        // Crear publicaciones para autor1
        Publicacion publicacion1 = controlador.crearPublicacion(2023, "Revista de Ciencia", "Investigación en IA");
        Publicacion publicacion2 = controlador.crearPublicacion(2024, "Revista de Tecnología", "Avances en Robótica");
        Publicacion publicacion3 = controlador.crearPublicacion(2025, "Revista de Biología", "Estudios Genéticos");

        // Crear publicaciones para autor2
        Publicacion publicacion4 = controlador.crearPublicacion(2022, "Revista de Física", "Teoría Cuántica");
        Publicacion publicacion5 = controlador.crearPublicacion(2021, "Revista de Química", "Reacciones Orgánicas");
        Publicacion publicacion6 = controlador.crearPublicacion(2020, "Revista de Astronomía", "Descubrimientos Espaciales");

        // Agregar publicaciones a autor1
        controlador.agregarPublicacion(autor1, publicacion1);
        controlador.agregarPublicacion(autor1, publicacion2);
        controlador.agregarPublicacion(autor1, publicacion3);

        // Agregar publicaciones a autor2
        controlador.agregarPublicacion(autor2, publicacion4);
        controlador.agregarPublicacion(autor2, publicacion5);
        controlador.agregarPublicacion(autor2, publicacion6);

        // Imprimir información de los autores
        System.out.println(controlador.imprimirAutor(autor1));
        System.out.println(controlador.imprimirAutor(autor2));
    }
}
