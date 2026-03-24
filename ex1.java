package exercícios;
import java.util.Scanner;
public class ex1 {
public static void main(String[]args) {
 Scanner sc = new Scanner(System.in);
  
 int n = 0;
 int i = 0;
 int tab = 0;
 
 
 System.out.println("Informe o número para a tabuada: ");
  n = sc.nextInt();
  
 for(i = 1; i <= 10; i++) {
  tab = n * i;	 
System.out.println(n + " x " + i + " = " + tab);
 }	
}
}
