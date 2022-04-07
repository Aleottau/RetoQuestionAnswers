/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionsandanswers.model;

import com.google.gson.annotations.Expose;

/**
 *
 * @author 57322
 */
public class OpcionRespuesta {

    /*Atributos*/
    private String opcion;
    private boolean esCorrecta;

    /*Constructor*/
    public OpcionRespuesta(String opcion, boolean esCorrecta) {
        this.opcion = opcion;
        this.esCorrecta = esCorrecta;
    }

    /*Getters and Setters*/
    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public boolean esCorrecta() {
        return esCorrecta;
    }

    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }

    @Override
    public String toString() {
        return this.opcion;
    }
}
