package com.danielgararr.pizzeria.presentation;

import com.danielgararr.pizzeria.domain.models.*;

public class Main {
    public static void main(String[] args) {

        //Crear Pizza Barbacoa
        Barbacoa barbacoa = new Barbacoa();
        barbacoa.setId(1);
        barbacoa.setNombre("Pizza Barbacoa");
        barbacoa.setSalsa("Barbacoa");
        barbacoa.setExtras("Pollo");
        barbacoa.setPicante(true);

        //Crear Pizza Carbonara
        Carbonara carbonara = new Carbonara();
        carbonara.setId(2);
        carbonara.setNombre("Pizza Carbonara");
        carbonara.setSalsa("Queso");
        carbonara.setExtras("Cebolla");
        carbonara.setQuesoAzul(true);
        carbonara.setQuesoCabra(false);

        //Crear Pizza Campera
        Campera campera = new Campera();
        campera.setId(3);
        campera.setNombre("Pizza Campera");
        campera.setSalsa("Tomate");
        campera.setExtras("Aceituna");
        campera.setCarne(true);

        //Crear Horno
        Horno horno = new Horno();
        horno.setId(1);
        horno.setNombre("Horno A");
        horno.setMarca("Philips");
        horno.setTemperatura("200 Grados");
    }
}