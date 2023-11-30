/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.actclase4aplicacion;


public class EstadoNormal implements EstadoCancion {
    private Cancion cancion;

    public EstadoNormal(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String mostrarIcono() {
        return Icono.MUSICAL_NOTE.texto();
    }

    @Override
    public String mostrarLeyenda() {
        return String.format("%s - %s - %s", cancion.nombreArtista, cancion.nombreAlbum, cancion.tituloCancion);
    }

    @Override
    public void reproducir() {
        cancion.reproducciones++;

        if (cancion.reproducciones > 1000) {
            cancion.setEstado(new EstadoEnAuge(cancion));
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
