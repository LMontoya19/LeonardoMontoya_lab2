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

public class Lab2_LeonardoMontoya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<alumno> alumnos = new ArrayList<>();
        ArrayList<notas> notas = new ArrayList<>();
        ArrayList<examen> examenes = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        char r = 's';
        while (r == 's') {
            System.out.println("1) Administracion");
            System.out.println("2) Crear cuenta");
            System.out.println("3) Log in");
            System.out.println("Ingrese su opcion");
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Crear examen");
                    System.out.println("Revisar examenes");
                    System.out.println("Ver notas");
                    System.out.println("Modificar notas");
                    System.out.println("Ingrese su opcion");
                    int opadmin = entrada.nextInt();
                    switch (opadmin) {
                        case 1:
                            ArrayList<String> preguntas = new ArrayList<>();
                            ArrayList<String> respuestas = new ArrayList<>();
                            System.out.println("Ingrese la clase de la cual es el examen");
                            String clase = entrada.next();
                            char resp = 's';
                            while (resp == 's') {
                                System.out.println("Ingrese la pregunta");
                                String pregunta = entrada.nextLine();
                                preguntas.add(pregunta);
                                entrada.next();
                                System.out.println("Desea ingresar otra pregunta?s/n");
                                resp = entrada.next().toLowerCase().charAt(0);

                            }
                            examenes.add(new examen(clase, preguntas, respuestas));
                            for (alumno t : alumnos) {
                                if (t.getExamenes().contains(new examen(clase, preguntas, respuestas))) {

                                } else {
                                    alumnos.get(alumnos.indexOf(t)).getExamenes().add(new examen(clase, preguntas, respuestas));
                                }
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre");
                    String nombre = entrada.nextLine();
                    entrada.next();
                    System.out.println("Ingrese el numero de cuenta");
                    String cuenta = entrada.next();
                    System.out.println("Ingrese año de nacimiento");
                    int año = entrada.nextInt();
                    System.out.println("Ingrese mes de nacimiento(numeros)");
                    int mes = entrada.nextInt();
                    System.out.println("Ingrese dia de nacimiento");
                    int dia = entrada.nextInt();
                    Date n = new Date();

                    n.setYear(año);
                    n.setMonth(mes);
                    n.setDate(dia);
                    System.out.println("Ingrese edad");
                    String edad = entrada.next();
                    System.out.println("Ingrese ciudad de residencia");
                    String ciudad = entrada.nextLine();
                    entrada.next();
                    System.out.println("Ingrese nacionalidad");
                    String nacionalidad = entrada.nextLine();
                    entrada.next();
                    System.out.println("Ingrese id");
                    String id = entrada.next();
                    System.out.println("Ingrese usuario");
                    String usuario = entrada.next();
                    System.out.println("Ingrese password");
                    String password = entrada.next();
                    alumnos.add(new alumno(nombre, cuenta, n, edad, ciudad, nacionalidad, id, usuario, password, notas, examenes));
                    break;
                case 3:
                    boolean log = false;
                    int aactual = 1;
                    System.out.println("Ingrese usuario");
                    String user = entrada.next();
                    System.out.println("Ingrese contraseña");
                    String pass = entrada.next();
                    for (alumno t : alumnos) {
                        if (user.equals(t.getUser()) && pass.equals(t.getPassword())) {
                            log = true;
                            aactual = alumnos.indexOf(t);
                        }
                    }
                    if (log == true) {
                        System.out.println("Bienvenido" + alumnos.get(aactual).getNombre());
                        System.out.println("1) Ver datos");
                        System.out.println("2) Modificar datos");
                        System.out.println("3)Realizar examenes");
                        System.out.println("4) Ver notas");
                        System.out.println("Ingrese su opcion");
                        int opalumno = entrada.nextInt();
                        switch (opalumno) {
                            case 1:
                                System.out.println(alumnos.get(aactual));
                                break;
                            case 3:
                                for (examen t : alumnos.get(aactual).getExamenes()) {
                                    for (int i = 0; i < t.getPreguntas().size(); i++) {
                                        System.out.println("Tiene examen de" + t.getClase() + "Desea realizarlo s/n");
                                        char resp = entrada.next().toLowerCase().charAt(0);
                                        if (resp == 's') {
                                            System.out.println(t.getPreguntas().get(i));
                                            
                                            String respuesta = entrada.nextLine();
                                            entrada.next();
                                            t.getRespuestas().add(respuesta);
                                        }
                                    }
                                }
                        }
                    } else {
                        System.out.println("Usuario o contraseña incorrecta");

                    }
            }
        }
    }

}
