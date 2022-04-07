/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionsandanswers.presentation;

import com.questionsandanswers.vista.GUI;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 57322
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            GUI myGui = new GUI();
            myGui.setVisible(true);
            myGui.iniciarJuego();
        } catch (InterruptedException ex) {
            System.exit(0);
        } catch (NullPointerException e) {
            System.exit(0);
        }
    }

}
