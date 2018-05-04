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

public class notas {

    private String alumno;
    private String clase;
    private String Calificacion;

    public notas(String alumno, String clase, String Calificacion) {
        this.alumno = alumno;
        this.clase = clase;
        this.Calificacion = Calificacion;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(String Calificacion) {
        this.Calificacion = Calificacion;
    }
}
