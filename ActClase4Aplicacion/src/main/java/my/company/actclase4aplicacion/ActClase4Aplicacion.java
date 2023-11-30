/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package my.company.actclase4aplicacion;

/**
 *
 * @author Irma
 */
public class ActClase4Aplicacion {

    public static void main(String[] args) {
         Cancion theScientist = new Cancion("Coldplay", "A Rush of Blood to the head", "The Scientist");

        System.out.println("Caso de prueba 1:");
        System.out.println("Icono: " + theScientist.mostrarIcono());
        System.out.println("Leyenda: " + theScientist.mostrarLeyenda());

        System.out.println("\nCaso de prueba 2:");
        theScientist.reproducir(); // Aumenta reproducciones a más de 1000
        System.out.println("Icono: " + theScientist.mostrarIcono());
        System.out.println("Leyenda: " + theScientist.mostrarLeyenda());

        System.out.println("\nCaso de prueba 3:");
        theScientist.darDislike(); // Aumenta dislikes a más de 5000
        System.out.println("Icono: " + theScientist.mostrarIcono());
        System.out.println("Leyenda: " + theScientist.mostrarLeyenda());

        System.out.println("\nCaso de prueba 4:");
        theScientist.darLike(); // Aumenta likes a más de 20000
        theScientist.reproducir(); // Aumenta reproducciones a más de 50000
        System.out.println("Icono: " + theScientist.mostrarIcono());
        System.out.println("Leyenda: " + theScientist.mostrarLeyenda());

        System.out.println("\nCaso de prueba 5:");
        theScientist.resetearEstado(); // Vuelve a estado Normal
        System.out.println("Icono: " + theScientist.mostrarIcono());
        System.out.println("Leyenda: " + theScientist.mostrarLeyenda());
    }
}
