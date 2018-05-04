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
                        break;
                }
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
                int edad = entrada.nextInt();
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
        }

    }

}
