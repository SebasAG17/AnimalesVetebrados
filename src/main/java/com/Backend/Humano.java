/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Backend;

import com.interfaces.Animal;
import com.interfaces.Caminar;
import com.interfaces.Hablar;
import com.interfaces.RespirarAire;

/**
 *
 * @author arang
 */
public class Humano implements Animal, RespirarAire, Caminar, Hablar {
    private String nombre;

    public Humano(String nombre) {
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
    public void caminar() {
        System.out.println(nombre + " puede caminar.");
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " puede hablar.");
    }
}
