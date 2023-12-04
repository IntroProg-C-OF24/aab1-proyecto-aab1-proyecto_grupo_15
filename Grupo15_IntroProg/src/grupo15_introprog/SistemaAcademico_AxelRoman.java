package grupo15_introprog;
import java.util.Random;
import java.util.Scanner;
public class SistemaAcademico_AxelRoman { 
    public static void main(String[] args) {
        //Resuelto por Axel Roman Torres
        Scanner teclado = new Scanner(System.in);
        Random rdm = new Random();
        String[] nombre = {"Carlos", "Carmen", "María", "Pedro", "Juan", "Camila", "Felipe", "Marta", "Ana", "Eduardo"};
        String[] apellido = {"Alvarado", "Palacios", "Rodriguez", "García", "Hidalgo", "Jaramillo", "Armijos"};
        double notaACD, notaAPE, notaAA, sumatoria, promedioAlumno, promedioCurso;
        int cont, digito, alumnos, aprobados, reprobados;
        cont=1;
        alumnos=10;  
        sumatoria=1;
        promedioCurso=1;
        aprobados=0;
        reprobados=0;
        digito=1;   
        while (cont <= alumnos){
            notaACD = (double)Math.random()*((10-1+1)+1)*0.35;
	    notaAPE = (double)Math.random()*((10-1+1)+1)*0.35;
            notaAA = (double)Math.random()*((10-1+1)+1)*0.30;
            int random = (int)(Math.random()*nombre.length);
            int random1 = (int)(Math.random()*apellido.length);
            System.out.print("Cédula: 11");
            for (int i = 0; i < 8; i++) {
                digito = rdm.nextInt(8);
                System.out.print("" + digito);
            }
            System.out.println(" | "+ " " + nombre[random] + " " + apellido[random1] + " | ");
            System.out.println("|" + "notaACD: " + notaACD + " |" + "notaAPE: " + notaAPE + " |" + "notaAA: " + notaAA + "|"); 
	    sumatoria = sumatoria + (notaACD + notaAPE + notaAA);
            promedioAlumno = (notaACD + notaAPE + notaAA);
	    System.out.println("Su promedio es: " + promedioAlumno);
            if (promedioAlumno < 7){
                System.out.println("Debe rendir un examen de recuperación sobre 3.5/10 pts");
                reprobados=reprobados+1;
            }else{
                System.out.println("Aprobado");
                aprobados=aprobados+1;
            }
            System.out.println("------------------------------------");
        cont = cont +1;
        }
        promedioCurso=(promedioCurso + sumatoria)/10;
        System.out.println("El promedio del curso es: " + promedioCurso); 
        System.out.println("Cantidad de alumnos aprobados: " + aprobados);
        System.out.println("Cantidad de alumnos reprobados: " + reprobados);
    }  
}