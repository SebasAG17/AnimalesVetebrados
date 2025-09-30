/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animalesvertebrados;

import com.Backend.Canario;
import com.Backend.Humano;
import com.Backend.Lagarto;
import com.Backend.Perro;
import com.Backend.PezPlata;
import com.Backend.Rana;
import com.Controlador.AnimalControlador;

/**
 *
 * @author arang
 */
public class AnimalesVertebrados {

    public static void main(String[] args) {
        AnimalControlador controlador = new AnimalControlador();

        Perro perro = new Perro("Perro");
        Humano humano = new Humano("Humano");
        Canario canario = new Canario("Canario");
        PezPlata pezPlata = new PezPlata("Pez Plata");
        Lagarto lagarto = new Lagarto("Lagarto");
        Rana rana = new Rana("Rana");

        controlador.GetHacer(perro);
        perro.respirarAire();
        perro.caminar();

        controlador.GetHacer(humano);
        humano.respirarAire();
        humano.caminar();
        humano.hablar();

        controlador.GetHacer(canario);
        canario.respirarAire();
        canario.volar();

        controlador.GetHacer(pezPlata);
        pezPlata.respirarAgua();
        pezPlata.nadar();

        controlador.GetHacer(lagarto);
        lagarto.respirarAire();
        lagarto.caminar();
        lagarto.nadar();

        controlador.GetHacer(rana);
        rana.respirarAire();
        rana.respirarAgua();
        rana.caminar();
        rana.nadar();
    }
}
