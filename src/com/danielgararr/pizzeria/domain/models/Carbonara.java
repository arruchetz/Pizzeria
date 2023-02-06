package com.danielgararr.pizzeria.domain.models;

public class Carbonara extends Pizza {
    private Boolean quesoAzul;
    private Boolean quesoCabra;

    public Boolean getQuesoAzul() {
        return quesoAzul;
    }

    public void setQuesoAzul(Boolean quesoAzul) {
        this.quesoAzul = quesoAzul;
    }

    public Boolean getQuesoCabra() {
        return quesoCabra;
    }

    public void setQuesoCabra(Boolean quesoCabra) {
        this.quesoCabra = quesoCabra;
    }
}
