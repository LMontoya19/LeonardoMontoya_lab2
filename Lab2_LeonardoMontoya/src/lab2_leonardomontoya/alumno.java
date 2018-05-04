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

public class alumno {

    private String nombre;
    private String cuenta;
    private Date nacimiento;
    private String edad;
    private String ciudad;
    private String nacionalidad;
    private String id;
    private String user;
    private String password;
    private ArrayList<notas> notas;
    private ArrayList<examen> examenes;

    alumno(String nombre, String ncuenta, Date nacimiento, String edad, String ciudad, String nacionalidad, String id, String user, String password, ArrayList<notas> notas, ArrayList<examen> examenes) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.nacimiento = nacimiento;
        this.edad = edad;
        this.ciudad= ciudad;
        this.nacionalidad= nacionalidad;
        this.id = id ;
        this.user = user;
        this.password = password;
        this.notas = notas;
        this.examenes = examenes;
            
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<notas> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<notas> notas) {
        this.notas = notas;
    }

    public ArrayList<examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(ArrayList<examen> examenes) {
        this.examenes = examenes;
    }

}
