package grupo15_introprog;
import java.util.Scanner;
public class MejorEgresado_AxelRoman {
    public static void main(String[] args) {
        //Resuelto por Axel Roman Torres
        String nomEstudiante, estudianteEgresado = "", estudianteEgresado2 = "";
        int numEstudiantes, cont = 1, contCiclos, numCiclos;
        double promFinalEstudiante = 0, promEgresado = 0, promCiclo, promCiclos;
        boolean egresadosIguales = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("=================================== MEJOR EGRESADO UTPL ===================================");
        System.out.println("-Ingresar la Cantidad de Estudiantes");
        numEstudiantes = teclado.nextInt();
        while (cont <= numEstudiantes) {
            System.out.println("-Ingresar los Nombres y Apellidos del Estudiante");
            teclado.nextLine();
            nomEstudiante = teclado.nextLine();
            System.out.println("-Ingresar el Numero de Ciclos de la Carrera del Estudiante");
            numCiclos = teclado.nextInt();
            contCiclos = 1;
            promCiclos = 0;
            while (contCiclos <= numCiclos) {
                System.out.println("-Ingresar el Promedio Final del Ciclo "+contCiclos);
                promCiclo = teclado.nextDouble();
                promCiclos = (promCiclos + promCiclo);
                promFinalEstudiante = (promCiclos / numCiclos);
                contCiclos++;
            }
            if (promFinalEstudiante > promEgresado) {
                estudianteEgresado = nomEstudiante;
                promEgresado = promFinalEstudiante;
                egresadosIguales = false;
            }
            else if (promFinalEstudiante == promEgresado) {
                estudianteEgresado2 = nomEstudiante;
                egresadosIguales = true;
            }
            cont++;
        }
        System.out.println("=================================== MEJOR EGRESADO UTPL ===================================");
        if (egresadosIguales == true) {
            System.out.println("Los Mejores Egresados UTPL son: ");
            System.out.println("El estudiante "+estudianteEgresado+" por tener un Promedio Final de "+promEgresado);
            System.out.println("El estudiante "+estudianteEgresado2+" por tener un Promedio FInal de "+promEgresado);
        }
        else {
            System.out.println("El Mejor Egresado UTPL es: ");
            System.out.println("El estudiante "+estudianteEgresado+" por tener un Promedio Final de "+promEgresado);
        }
        System.out.println("===========================================================================================");
    }
}