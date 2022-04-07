/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionsandanswers.repository;

import com.questionsandanswers.repository.IPlayRepository;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 57322
 */
public class PlayRepositoryImp implements IPlayRepository {

    /*Manejo de Archivo*/
    private File fichero;
    private BufferedWriter bw;
    private PrintWriter wr;
    private FileWriter f;

    public PlayRepositoryImp() {
        initFileReport();
    }

    @Override
    public boolean save(String jugadorJson) {
        
        try {
            f = new FileWriter("./reporte.json", true);
            bw = new BufferedWriter(f);
            bw.write(jugadorJson);
            bw.newLine();
        } catch (IOException ex) {
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
            }
        }
        return true;
    }

    public void initFileReport() {
        fichero = new File("./reporte.json");
        try {
            fichero.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(PlayRepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
