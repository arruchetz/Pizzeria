package com.danielgararr.pizzeria.presentation;

import com.danielgararr.pizzeria.domain.models.Barbacoa;
import com.danielgararr.pizzeria.domain.models.Campera;
import com.danielgararr.pizzeria.domain.models.Carbonara;
import com.danielgararr.pizzeria.domain.models.Pizza;

public class Main {
    public static void main(String[] args) {

        //Crear Pizza Barbacoa
        Barbacoa barbacoa = new Barbacoa();
        barbacoa.getId(1);
        barbacoa.getNombre("Pizza Barbacoa");
        barbacoa.getSalsa("Barbacoa");
        barbacoa.getExtras("Pollo");
        barbacoa.getPicante(true);

        //Crear Pizza Carbonara
        Carbonara carbonara = new Carbonara();
        carbonara.getId(2);
        carbonara.getNombre("Pizza Carbonara");
        carbonara.getSalsa("Queso");
        carbonara.getExtras("Cebolla");
        carbonara.getQuesoAzul(true);
        carbonara.getQuesoCabra(false);

        //Crear Pizza Campera
        Campera campera = new Campera();
        campera.getId(3);
        campera.getNombre("Pizza Campera");
        campera.getSalsa("Tomate");
        campera.getExtras("Aceituna");
        campera.getCarne(true);
    }
}