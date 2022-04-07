/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionsandanswers.model;

import java.util.ArrayList;

/**
 *
 * @author 57322
 */
public class Categoria {

    /*Atributos*/
    private NivelEnum nivel;
    private String descripcion;
    private ArrayList<Pregunta> preguntas;

    /*Constructor*/
    public Categoria(NivelEnum nivel, String descripcion) {
        this.nivel = nivel;
        this.descripcion = descripcion;
        this.preguntas = new ArrayList<>();
    }

    /*Getters and Setters*/
    public NivelEnum getNivel() {
        return nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNivel(NivelEnum nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    /*Métodos*/
    /**
     * Agrega una pregunta a la lista
     *
     * @param p
     */
    public void agregarPregunta(Pregunta p) {
        this.preguntas.add(p);
    }

}
