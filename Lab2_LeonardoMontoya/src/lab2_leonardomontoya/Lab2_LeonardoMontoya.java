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

    static ArrayList<examen> examenes = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<alumno> alumnos = new ArrayList<>();
        ArrayList<notas> nota = new ArrayList<>();
        //ArrayList<examen> examenes = new ArrayList<>();
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
                    System.out.println("1)Crear examen");
                    System.out.println("2)Revisar examenes");
                    System.out.println("3)Ver notas");
                    System.out.println("4)Modificar notas");
                    System.out.println("Ingrese su opcion");
                    int opadmin = entrada.nextInt();
                    switch (opadmin) {
                        case 1:
                            ArrayList<String> preguntas = new ArrayList<>();
                            ArrayList<String> respuestas = new ArrayList<>();
                            System.out.println("Ingrese la clase de la cual es el examen");
                            String clase = entrada.nextLine();
                            entrada.nextLine();
                            char resp = 's';
                            while (resp == 's') {
                                System.out.println("Ingrese la pregunta");
                                String pregunta = entrada.nextLine();

                                preguntas.add(pregunta);
                                System.out.println("Desea ingresar otra pregunta?s/n");
                                resp = entrada.next().toLowerCase().charAt(0);

                            }
                            examenes.add(new examen(clase, preguntas, respuestas, ""));
                            for (alumno t : alumnos) {
                                if (t.getExamenes().contains(new examen(clase, preguntas, respuestas, ""))) {

                                } else {
                                    alumnos.get(alumnos.indexOf(t)).getExamenes().add(new examen(clase, preguntas, respuestas, ""));
                                }
                            }
                            break;

                        case 2:
                            int j = 0;
                            for (examen e : examenes) {
                                j = examenes.indexOf(e);
                                for (int i = 0; i < e.getPreguntas().size(); i++) {

                                    System.out.println(e.getPreguntas().get(i));
                                    System.out.println(e.getRespuestas().get(i));

                                }
                            }
                            System.out.println("Ingrese notas");
                            String notad = entrada.next();
                            nota.add(new notas(examenes.get(j).getNombre(), examenes.get(j).getClase(), notad));
                            break;
                        case 3:
                            for (notas n : nota) {
                                System.out.print(n.getAlumno());
                                System.out.print("   " + n.getClase());
                                System.out.print("  " + n.getCalificacion());
                            }
                            break;

                        case 4:
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el nombre");
                    String nombre = entrada.nextLine();
                    entrada.nextLine();
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
                    entrada.nextLine();
                    System.out.println("Ingrese nacionalidad");
                    String nacionalidad = entrada.nextLine();
                    entrada.nextLine();
                    System.out.println("Ingrese id");
                    String id = entrada.next();
                    System.out.println("Ingrese usuario");
                    String usuario = entrada.next();
                    System.out.println("Ingrese password");
                    String password = entrada.next();
                    alumnos.add(new alumno(nombre, cuenta, n, edad, ciudad, nacionalidad, id, usuario, password, nota, examenes));
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
                                    System.out.println("Tiene examen de" + t.getClase() + "Desea realizarlo s/n");
                                    char resp = entrada.next().toLowerCase().charAt(0);
                                    if (resp == 's') {
                                        for (int i = 0; i < t.getPreguntas().size(); i++) {

                                            System.out.println(examenes.get(i).getPreguntas().get(i));
                                            String respuesta = entrada.nextLine();
                                            entrada.nextLine();
                                            t.getRespuestas().add(respuesta);

                                        }

                                    }
                                    alumnos.get(aactual).getExamenes().remove(t);
                                    t.setNombre(alumnos.get(aactual).getNombre());
                                    examenes.add(t);
                                }
                            case 4:
                                for (notas no : nota) {
                                    if (no.getAlumno().equals(alumnos.get(aactual).getNotas())) {
                                        System.out.print(no.getClase());
                                        System.out.println(no.getCalificacion());
                                    }
                                }
                                break;
                        }
                    } else {
                        System.out.println("Usuario o contraseña incorrecta");

                    }
            }
        }
    }

}
