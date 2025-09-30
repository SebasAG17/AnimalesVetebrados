/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Backend;

import com.interfaces.Animal;
import com.interfaces.RespirarAire;
import com.interfaces.Volar;

/**
 *
 * @author arang
 */
public class Canario implements Animal, RespirarAire, Volar {
    private String nombre;

    public Canario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void respirarAire() {
        System.out.println(nombre + " respira aire.");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " puede volar.");
    }
}
