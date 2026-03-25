package arquivo;
import java.util.Scanner;

public class ex05 {
public static void main(String[]args) {

Scanner sc = new Scanner(System.in);	

//Elabore um programa que leia 5 valores inteiros positivos e ao final responda quantos destes valores são números primos.

int i = 0;
int v = 0;
int p = 0;


System.out.println("Informe 5 números positivos:");


for(i = 1; i <= 	5; i ++) {
 System.out.println("\nInforme número " + i + ":");
  v = sc.nextInt();
  if( v > 0) {}
  
  if( v % v == 0 && v % 1 == 0 && v != 1) {
   p = p + 1;
   
  if(v < 0 )
   i = i - 1;	  
}
}
	
System.out.println(p + " valores são primos de 5 números.");
	
	
	
	
	
}	
}
