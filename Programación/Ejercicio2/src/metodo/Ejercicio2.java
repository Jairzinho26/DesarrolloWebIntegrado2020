package metodo;
//metodo for
import java.util.Scanner; 
public class Ejercicio2 { 
 Scanner dato=new Scanner(System.in); 
 public void multiplicar(int n1){
System.out.println("Ingrese el numero");
  n1 = dato.nextInt(); 
 for(int a=1;a<=12;a++){ 
 int resul=a*n1;  
System.out.println(" º "+ a + " x " +n1+ " = " +resul); 
 } 
 } 
public static void main(String[]args){
 Ejercicio2 tabla = new Ejercicio2();
 tabla.multiplicar(0); 
} 
}
