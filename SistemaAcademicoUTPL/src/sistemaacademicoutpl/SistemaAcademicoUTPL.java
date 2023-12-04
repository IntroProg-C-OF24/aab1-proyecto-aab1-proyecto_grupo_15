package sistemaacademicoutpl;
import java.util.Scanner;
import java.util.Random;
public class SistemaAcademicoUTPL {
   public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner teclado= new Scanner(System.in);
        double notaACD, notaAPE, notaAA,total,porcentApp,porcentRep;
        String nombre,condicion;
        int ced,contApp=0,contRep=0;
        do {
            System.out.println("Ingresar el nombre del estudiante");
            nombre=teclado.next();
            System.out.println("Ingresar numero de cedula del estudiante");
            ced=teclado.nextInt();
            System.out.println("Notas del Bimestre");
            notaACD=random.nextInt(10)+1;
            notaAPE=random.nextInt(10)+1;
            notaAA=random.nextInt(10)+1;
            total=(notaACD+notaAPE+notaAA)/3;
            System.out.println("Nota Total: "+total);
            System.out.println("--------//REPORTE//--------");
            System.out.println("--NOTA DEL BIMESTRE--");
            System.out.println("Nota ACD: "+notaACD);
            System.out.println("Nota APE: "+notaAPE);
            System.out.println("Nota AA: "+notaAA);
            if (total>=7) {
                System.out.println("Nombre del estudiante: "+ nombre + " cedula: "+ced +"Aprovado");
                contApp++;
            }else{
                System.out.println("Nombre del estudiante: "+ nombre + " cedula: "+ced +"Reprovado");
                contRep++;
            }
            System.out.println("______________________________________");
            System.out.println("Desea ingresar mas estudiantes?");
            condicion=teclado.next().toLowerCase();
        } while (("s").equals(condicion));
        porcentApp=((contApp*100)/(contRep+contApp));
        porcentRep=((contRep*100)/(contRep+contApp));
        System.out.println("______________________________________________");
        System.out.println("El porcentaje de estudiantes aprovados es: "+porcentApp+"%");
        System.out.println("El porcentaje de estudiantes reprovados es: "+porcentRep+"%");
   }
}
