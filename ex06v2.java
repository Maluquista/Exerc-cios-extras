package arquivo;
import java.util.Scanner;

public class ex06v2 {
public static void main(String[]args) {

//Elabore um programa que, dado um valor inteiro positivo, calcule o fatorial deste número e escreva o resultado.
	
Scanner sc = new Scanner(System.in);

int i = 0;
int v = 0;	
int v2 = 0;
int f = 1;

System.out.println( "Informe um número para calcular seu fatorial: ");
v = sc.nextInt();
 
for(i = v; i > 0; i--) {
	f =  f * i;
	
 System.out.println(f);	
}	
}
}
