/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionsandanswers.repository;

import com.google.gson.Gson;

/**
 *
 * @author 57322
 */
public interface IPlayRepository {

    boolean save(String jugadorJson);
}
