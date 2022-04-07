/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionsandanswers.infra;

import com.questionsandanswers.repository.PlayRepositoryImp;
import com.questionsandanswers.repository.IPlayRepository;
import com.google.gson.Gson;
import com.questionsandanswers.model.Categoria;
import com.questionsandanswers.model.NivelEnum;
import com.questionsandanswers.model.Pregunta;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 57322
 */
public class Utils {

    /*Categorías*/
    Categoria novato = new Categoria(NivelEnum.NOVATO, "Categoria novato");
    Categoria facil = new Categoria(NivelEnum.FACIL, "Categoria facil");
    Categoria medio = new Categoria(NivelEnum.MEDIO, "Categoria medio");
    Categoria dificil = new Categoria(NivelEnum.DIFICIL, "Categoria dificil");
    Categoria epico = new Categoria(NivelEnum.EPICO, "Categoria épico");
    /*Reporte*/
    IPlayRepository reporte = new PlayRepositoryImp();

    public void iniciarPreguntas() {
        /*Preguntas novato*/
        Pregunta P1N = new Pregunta("¿Que es un lenguaje de programación?");
        P1N.crearOpcion("Es un programa que sirve para configurar el hardware en un ordenador.", false);
        P1N.crearOpcion("Son codigos con los que se genera  la interacción en una pagina web.", false);
        P1N.crearOpcion("Es un conjunto de instrucciones mediante el cual se diseñan programas.", true);
        P1N.crearOpcion("Es un algoritmo con el que puedo resolver ejercios matematicos.", false);
        Pregunta P2N = new Pregunta("¿Cuál de estas intrucciones no es un ciclo iterativo?");
        P2N.crearOpcion("SELECT * FROM users ", false);
        P2N.crearOpcion("if (a<=b && b!=0) => (a/b)+b*a", false);
        P2N.crearOpcion("console.log(result)", false);
        P2N.crearOpcion("for (let i=0 ; i<10 ; i++)", true);
        Pregunta P3N = new Pregunta("¿Se usa para mostrar un mensaje por consola en JS?");
        P3N.crearOpcion("System.out.println()", false);
        P3N.crearOpcion("Console.WriteLine()", false);
        P3N.crearOpcion("console.log()", true);
        P3N.crearOpcion("dbms_output.put_line()", false);
        Pregunta P4N = new Pregunta("¿Cuál es el río más largo del mundo?");
        P4N.crearOpcion("Río Nilo", false);
        P4N.crearOpcion("Río Amazonas", true);
        P4N.crearOpcion("Río Misisipi", false);
        P4N.crearOpcion("Río Magdalena", false);
        Pregunta P5N = new Pregunta("¿Cuál es el planeta más grande del Sistema Solar?");
        P5N.crearOpcion("Saturno", false);
        P5N.crearOpcion("Neptuno", false);
        P5N.crearOpcion("Jupiter", true);
        P5N.crearOpcion("Mercurio", false);

        /*Se agregan las preguntas a la categoría correspondiente*/
        novato.agregarPregunta(P1N);
        novato.agregarPregunta(P2N);
        novato.agregarPregunta(P3N);
        novato.agregarPregunta(P4N);
        novato.agregarPregunta(P5N);

        /*Preguntas fáciles*/
        Pregunta P1F = new Pregunta("¿Cuál de los siguientes NO es un lenguaje de programación?");
        P1F.crearOpcion("Java", false);
        P1F.crearOpcion("Python", false);
        P1F.crearOpcion("C#", false);
        P1F.crearOpcion("HTML", true);

        Pregunta P2F = new Pregunta("¿Cuál de los siguientes SI es un lenguaje de programación?");
        P2F.crearOpcion("HTML", false);
        P2F.crearOpcion("CSS3", false);
        P2F.crearOpcion("SQL", false);
        P2F.crearOpcion("Javascript", true);

        Pregunta P3F = new Pregunta("¿Cuál de los siguientes es un motor de base de datos?");
        P3F.crearOpcion("HTML", false);
        P3F.crearOpcion("CSS3", false);
        P3F.crearOpcion("SQL", false);
        P3F.crearOpcion("Oracle", true);

        Pregunta P4F = new Pregunta("¿Dónde originaron los juegos olímpicos?");
        P4F.crearOpcion("Grecia", true);
        P4F.crearOpcion("Reino unido", false);
        P4F.crearOpcion("Egipto", false);
        P4F.crearOpcion("Colombia", false);

        Pregunta P5F = new Pregunta("¿Qué cantidad de huesos en el cuerpo humano?");
        P5F.crearOpcion("200", false);
        P5F.crearOpcion("203", false);
        P5F.crearOpcion("208", false);
        P5F.crearOpcion("206", true);

        facil.agregarPregunta(P1F);
        facil.agregarPregunta(P2F);
        facil.agregarPregunta(P3F);
        facil.agregarPregunta(P4F);
        facil.agregarPregunta(P5F);

        /*Preguntas Medio*/
        Pregunta P1M = new Pregunta("¿Que es GIT?");
        P1M.crearOpcion("Es un lenguaje de programación", false);
        P1M.crearOpcion("Es un  IDE", false);
        P1M.crearOpcion("es un software de control de versiones ", true);
        P1M.crearOpcion("Es una serie de Netflix", false);

        Pregunta P2M = new Pregunta("¿Cuántas estrellas hay en la bandera estadounidense?");
        P2M.crearOpcion("35", false);
        P2M.crearOpcion("80", false);
        P2M.crearOpcion("54 ", false);
        P2M.crearOpcion("50", true);

        Pregunta P3M = new Pregunta("¿Cual de las siguientes es un IDE?");
        P3M.crearOpcion("Visual studio code", false);
        P3M.crearOpcion("Netbeans", true);
        P3M.crearOpcion("Block de notas ", false);
        P3M.crearOpcion("sublime text", false);

        Pregunta P4M = new Pregunta("¿Cuál es el planeta más alejado del Sol en el sistema solar?");
        P4M.crearOpcion("Neptuno", true);
        P4M.crearOpcion("Venus", false);
        P4M.crearOpcion("Tierra", false);
        P4M.crearOpcion("Ninguna de las anteriores", false);

        Pregunta P5M = new Pregunta("En la mitología griega, ¿quién mató a Aquiles?");
        P5M.crearOpcion("Paris", true);
        P5M.crearOpcion("Hector", false);
        P5M.crearOpcion("Odiseo", false);
        P5M.crearOpcion("Agamenon", false);

        medio.agregarPregunta(P1M);
        medio.agregarPregunta(P2M);
        medio.agregarPregunta(P3M);
        medio.agregarPregunta(P4M);
        medio.agregarPregunta(P5M);

        /*Preguntas difícil*/
        Pregunta P1D = new Pregunta("¿Qué dos países separa el estrecho de Bering?");
        P1D.crearOpcion("Rusia y Estados unidos", true);
        P1D.crearOpcion("China y Canada", false);
        P1D.crearOpcion("Rusia y Canada", false);
        P1D.crearOpcion("China y Alaska", false);

        Pregunta P2D = new Pregunta("¿Qué pasos debo hacer para cambiar a una rama y subir cambios a un repositorio git a la rama principal?");
        P2D.crearOpcion("git checkout main, git push", false);
        P2D.crearOpcion("git change main, git push main", false);
        P2D.crearOpcion("git checkout main, git push origin main", true);
        P2D.crearOpcion("git change main, git push origin main", false);

        Pregunta P3D = new Pregunta("¿Cuál es el océano más grande del mundo?");
        P3D.crearOpcion("El océano Ártico", false);
        P3D.crearOpcion("El océano Índico", false);
        P3D.crearOpcion("El océano Atlántico", false);
        P3D.crearOpcion("El océano Pacífico", true);

        Pregunta P4D = new Pregunta("¿Cuántos corazones tiene un pulpo?");
        P4D.crearOpcion("3", true);
        P4D.crearOpcion("1", false);
        P4D.crearOpcion("10", false);
        P4D.crearOpcion("5", false);

        Pregunta P5D = new Pregunta("¿Qué lenguaje  de programación no es compilado?");
        P5D.crearOpcion("Java", false);
        P5D.crearOpcion("C++", false);
        P5D.crearOpcion("Python", true);
        P5D.crearOpcion("Go", false);

        dificil.agregarPregunta(P1D);
        dificil.agregarPregunta(P2D);
        dificil.agregarPregunta(P3D);
        dificil.agregarPregunta(P4D);
        dificil.agregarPregunta(P5D);

        /*Preguntas épicas*/
        Pregunta P1E = new Pregunta("¿Cuál de estos sistemas esta basado en Unix?");
        P1E.crearOpcion("windows", false);
        P1E.crearOpcion("Android", false);
        P1E.crearOpcion("Mac OS", true);
        P1E.crearOpcion("Ubuntu", false);

        Pregunta P2E = new Pregunta("¿Cuál no es un pilar de la programación orientada a objetos?");
        P2E.crearOpcion("Herencia", false);
        P2E.crearOpcion("Encapsulamiento", false);
        P2E.crearOpcion("Polimorfismo", false);
        P2E.crearOpcion("objetos", true);

        Pregunta P3E = new Pregunta("¿Cuál es la videoconsola más vendida de la historia?");
        P3E.crearOpcion("Nintendo Nes", false);
        P3E.crearOpcion("PlayStation 2", true);
        P3E.crearOpcion("Nintendo 64", false);
        P3E.crearOpcion("PlayStation 1", false);

        Pregunta P4E = new Pregunta("¿Quién fue el último faraón de Egipto?");
        P4E.crearOpcion("Ramsés I", false);
        P4E.crearOpcion("Cleopatra VII", false);
        P4E.crearOpcion("Ramsés III", true);
        P4E.crearOpcion("Amenemhat I", false);

        Pregunta P5E = new Pregunta("¿Qué es una clase final?");
        P5E.crearOpcion("Es la última clase del árbol de herencia y no puede tener subclases", true);
        P5E.crearOpcion("Es una clase en la que podemos acceder a sus componentes estáticos", false);
        P5E.crearOpcion("Es una clase que deriva de una Clase padre", false);
        P5E.crearOpcion("nignuna de las anteriores", false);

        epico.agregarPregunta(P1E);
        epico.agregarPregunta(P2E);
        epico.agregarPregunta(P3E);
        epico.agregarPregunta(P4E);
        epico.agregarPregunta(P5E);
    }

    public Pregunta elegirPregunta(NivelEnum nivel) {

        int indiceRandom = 0;
        switch (nivel) {
            case NOVATO -> {
                indiceRandom = (int) (Math.random() * (novato.getPreguntas().size()));
                return novato.getPreguntas().get(indiceRandom);
            }
            case FACIL -> {
                indiceRandom = (int) (Math.random() * (facil.getPreguntas().size()));
                return facil.getPreguntas().get(indiceRandom);
            }
            case MEDIO -> {
                indiceRandom = (int) (Math.random() * (medio.getPreguntas().size()));
                return medio.getPreguntas().get(indiceRandom);
            }
            case DIFICIL -> {
                indiceRandom = (int) (Math.random() * (dificil.getPreguntas().size()));
                return dificil.getPreguntas().get(indiceRandom);
            }

            case EPICO -> {
                indiceRandom = (int) (Math.random() * (epico.getPreguntas().size()));
                return epico.getPreguntas().get(indiceRandom);
            }
        }

        return null;
    }

    public String solicitarUsuario() {
        return JOptionPane.showInputDialog("¿Nombre de Usuario?");
    }

    public boolean guardarReporte(String jugadorJson) {
        return reporte.save(jugadorJson);
    }
}
