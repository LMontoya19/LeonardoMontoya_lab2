/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_leonardomontoya;

/**
 *
 * @author Inspiron
 */
import java.util.*;

public class examen {
private String clase;
private ArrayList<String> preguntas;
private ArrayList<String> Respuestas;
    public examen(String clase, ArrayList<String> preguntas, ArrayList<String> Respuestas) {
    this.clase = clase;
    this.preguntas = preguntas;
    this.Respuestas = Respuestas;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public ArrayList<String> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<String> preguntas) {
        this.preguntas = preguntas;
    }

    public ArrayList<String> getRespuestas() {
        return Respuestas;
    }

    public void setRespuestas(ArrayList<String> Respuestas) {
        this.Respuestas = Respuestas;
    }
}
