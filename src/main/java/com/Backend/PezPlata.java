/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Backend;

import com.interfaces.Animal;
import com.interfaces.Nadar;
import com.interfaces.RespirarAgua;

/**
 *
 * @author arang
 */
public class PezPlata implements Animal, RespirarAgua, Nadar {
    private String nombre;

    public PezPlata(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void respirarAgua() {
        System.out.println(nombre + " respira bajo el agua.");
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " puede nadar.");
    }
}
