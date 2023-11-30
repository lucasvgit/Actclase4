/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.actclase4aplicacion;

/**
 *
 * @author Irma
 */
public class Icono {
    public static Icono MUSICAL_NOTE = new Icono(new int[]{0xD83C, 0xDFB5});
    public static Icono ROCKET = new Icono(new int[]{0xD83D, 0xDE80});
    public static Icono FIRE = new Icono(new int[]{0xD83D, 0xDD25});

    private final int[] internalEncoding;

    Icono(int[] internalEncoding) {
        this.internalEncoding = internalEncoding;
    }

    public String texto() {
        return new String(internalEncoding, 0, internalEncoding.length);
    }
}