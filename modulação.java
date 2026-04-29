package aula;

import java.util.Scanner;

public class modulação {

	public static int somar(int v1, int v2) {
		int resultado = v1 + v2;
		System.out.println("A soma é: " + resultado);
		return resultado;
	}
	
	public static void multiplicar(int v1, int v2) {
		int result = v1 * v2;
		System.out.println("A multiplicação é: " + result);
	}
	
	public static void finalizar() {
		
	System.out.println("Fim");
	}
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v1 = 0;
		int v2 = 0;
		int i = 0;
		
		for( i = 1; i <= 10; i++) {
		System.out.println("Informe v1: ");
		v1 = sc.nextInt();
		
		System.out.println("Informe v2: ");
		v2 = sc.nextInt();
		int result = somar(v1,v2);
		somar(v1,v2);
		multiplicar(v1,v2);
	}
		finalizar();
	}	
}
