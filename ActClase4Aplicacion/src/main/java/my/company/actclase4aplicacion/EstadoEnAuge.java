/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.actclase4aplicacion;

public class EstadoEnAuge implements EstadoCancion {
    private final Cancion cancion;

    public EstadoEnAuge(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String mostrarIcono() {
        return Icono.ROCKET.texto();
    }

    @Override
    public String mostrarLeyenda() {
        return String.format("%s - %s (%s - %d)", cancion.nombreArtista, cancion.tituloCancion, cancion.nombreAlbum, 2002);
    }

    @Override
    public void reproducir() {
        cancion.reproducciones++;

        if (cancion.reproducciones > 50000 && cancion.likes > 20000) {
            cancion.setEstado(new EstadoEnTendencia(cancion));
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
