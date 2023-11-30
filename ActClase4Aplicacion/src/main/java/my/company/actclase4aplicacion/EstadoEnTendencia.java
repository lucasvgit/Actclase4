/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.actclase4aplicacion;

public class EstadoEnTendencia implements EstadoCancion {
    private final Cancion cancion;

    public EstadoEnTendencia(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String mostrarIcono() {
        return Icono.FIRE.texto();
    }

    @Override
    public String mostrarLeyenda() {
        return String.format("%s - %s (%s - %d)", cancion.tituloCancion, cancion.nombreArtista, cancion.nombreAlbum, 2002);
    }

    @Override
    public void reproducir() {
        cancion.reproducciones++;

        if (!cancion.fueReproducidaRecientemente()) {
            cancion.resetearEstado();
        }
    }

    @Override
    public void darLike() {
        cancion.likes++;
    }

    @Override
    public void darDislike() {
        cancion.dislikes++;

        if (cancion.dislikes >= 5000) {
            cancion.resetearEstado();
        }
    }

    @Override
    public void resetearEstado() {
        cancion.setEstado(new EstadoNormal(cancion));
    }
}

