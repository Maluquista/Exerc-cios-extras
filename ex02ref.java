
package aula;
import java.util.Scanner;

public class ex02ref {
public static void main(String[]args) {

Scanner sc = new Scanner(System.in);	

//Elabore um programa que leia 5 valores inteiros positivos e ao final responda quantos destes valores são números primos.

int i = 0;
int x = 0;
int v = 0;
int p = 0;
int np = 0;
int pr = 0;
boolean primo = v >= 2;
double mr = Integer.MIN_VALUE;
double mnr = Integer.MAX_VALUE;


	System.out.println("Informe 5 números positivos:");


	for(i = 1; i <= 10; i ++) {	
		System.out.println("\nInforme número " + i + ":");
		
		v = sc.nextInt();
		primo = v >= 2;
	
		for(x = 2; x < v; x++) {
		 if( v % x == 0) {
			primo = false;
			np = np +v;
			break;
	 }
     }
		if(primo == true) {
			p++;	
			pr = pr + v;
		if(primo == true && v >= mr);
		mr = v;
	
}	
		if(primo == false && v <= mnr) {
		mnr = v;
}
}	

	System.out.println(p + " valores são primos de 5 números.");	
	System.out.println("Soma dos valores não primos:" + np);
	System.out.println("Soma dos valores primos:" + pr);
	System.out.println("Maior número primo: " + mr);
	System.out.println("Menor número não primo: " + mnr);
}
}

