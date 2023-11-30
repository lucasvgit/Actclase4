/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.actclase4aplicacion;

/**
 *
 * 
 */
public class Cancion {
    String nombreArtista;
    String nombreAlbum;
    String tituloCancion;
    int reproducciones;
    int likes;
    int dislikes;
    private boolean enAuge;
    private boolean enTendencia;
    private EstadoNormal estado;

    public Cancion(String nombreArtista, String nombreAlbum, String tituloCancion) {
        this.nombreArtista = nombreArtista;
        this.nombreAlbum = nombreAlbum;
        this.tituloCancion = tituloCancion;
        this.estado = new EstadoNormal(this);
    }

    public void reproducir() {
        reproducciones++;

        if (reproducciones > 1000 && !enAuge) {
            enAuge = true;
        }

        if (enAuge && (reproducciones > 50000 && likes > 20000)) {
            enTendencia = true;
        }
    }

    public void darLike() {
        likes++;
    }

    public void darDislike() {
        dislikes++;

        if (enAuge && dislikes >= 5000) {
            resetearEstado();
        }
    }

    public void resetearEstado() {
        enAuge = false;
        enTendencia = false;
        reproducciones = 0;
        likes = 0;
        dislikes = 0;

        // Asegúrate de que estado sea de tipo EstadoNormal antes de llamar al método específico
        if (estado instanceof EstadoNormal) {
            ((EstadoNormal) estado).resetearEstado();
        }
    }

    public String mostrarIcono() {
        if (enTendencia) {
            return Icono.FIRE.texto();
        } else if (enAuge) {
            return Icono.ROCKET.texto();
        } else {
            return Icono.MUSICAL_NOTE.texto();
        }
    }

    public String mostrarLeyenda() {
        if (enTendencia) {
            return String.format("%s - %s (%s - %d)", tituloCancion, nombreArtista, nombreAlbum, 2002);
        } else if (enAuge) {
            return String.format("%s - %s (%s - %d)", nombreArtista, tituloCancion, nombreAlbum, 2002);
        } else {
            return String.format("%s - %s - %s", nombreArtista, nombreAlbum, tituloCancion);
        }
    }

    public void setEstado(EstadoCancion nuevoEstado) {
        this.estado = (EstadoNormal) nuevoEstado;
    }

    boolean fueReproducidaRecientemente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
