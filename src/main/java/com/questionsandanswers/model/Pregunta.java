/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionsandanswers.model;

import com.google.gson.annotations.Expose;
import java.util.ArrayList;

/**
 *
 * @author 57322
 */
public class Pregunta {

    /*Atributos*/
    private String pregunta;
    private ArrayList<OpcionRespuesta> opciones;

    /*Constructor*/
    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
        this.opciones = new ArrayList<>();
    }


    /*Getters and Setters*/
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public ArrayList<OpcionRespuesta> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<OpcionRespuesta> opciones) {
        this.opciones = opciones;
    }

    /*Métodos*/
    /**
     * Agrega las opciones a cada pregunta
     *
     * @param opcion
     * @param esCorrecta
     */
    public void crearOpcion(String opcion, boolean esCorrecta) {
        this.opciones.add(new OpcionRespuesta(opcion, esCorrecta));
    }

    @Override
    public String toString() {
        return "<html><body>" + "¡Pregunta! <br>" + this.pregunta + "<br> A. " + this.opciones.get(0) + "<br> B. " + this.opciones.get(1) + "<br> C. " + this.opciones.get(2) + "<br> D. " + this.opciones.get(3) + "</body></html>";
    }

}
