import java.util.Scanner;
//metodo if y else
public class metodo1 {
	public static void main(String args[]) {
Scanner entrada= new Scanner(System.in);

String nombre;
int nota1;
int nota2;
int nota3;
int nota4;


System.out.print("ingrese nombre :");
nombre=entrada.nextLine();
System.out.print("ingrese nota1 :");
nota1=entrada.nextInt();
System.out.print("ingrese nota2 :");
nota2=entrada.nextInt();
System.out.print("ingrese nota3 :");
nota3=entrada.nextInt();
System.out.print("ingrese nota4 :");
nota4=entrada.nextInt();

double promedio;
promedio=(nota1+nota2+nota3+nota4)/4;
System.out.println("promedio de notas :"+promedio);

	if ( promedio >=11) {
		System.out.println("El estudiante esta aprobado");
	}
	else
		System.out.println("El estudiante esta desaprobado");

	
	}
	}
	
