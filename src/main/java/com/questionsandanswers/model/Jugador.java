/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionsandanswers.model;

import com.google.gson.Gson;
import java.util.ArrayList;

/**
 *
 * @author 57322
 */
public class Jugador {

    /*Atributos*/
    private int id = 0;
    private String userName;
    private int score = 0;
    private ArrayList<Pregunta> correctas = new ArrayList<>();
    private ArrayList<Pregunta> incorrectas = new ArrayList<>();

    /*Constructor*/
    public Jugador(String userName) {
        this.id = (int) (Math.random() * 100);
        this.userName = userName;
    }

    /*Getters and Setters*/
    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<Pregunta> getCorrectas() {
        return correctas;
    }

    public void setCorrectas(ArrayList<Pregunta> correctas) {
        this.correctas = correctas;
    }

    public ArrayList<Pregunta> getIncorrectas() {
        return incorrectas;
    }

    public void setIncorrectas(ArrayList<Pregunta> incorrectas) {
        this.incorrectas = incorrectas;
    }

    public String jugadorToJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

}
