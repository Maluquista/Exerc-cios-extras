package aula;
import java.util.Scanner;

public class whileex {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int cont = 0;
		String continua = "S";
		
		System.out.println("Ler um número? S/N");
		continua = sc.next();	
	while(continua.equalsIgnoreCase("S")) {
		
		System.out.println("Informe um número");	
		 soma = soma + sc.nextInt();
		  cont++;
		
		System.out.println("Ler um número? S/N");
		 continua = sc.next();	
	}
	System.out.println("A média é: " + (soma/cont));
}
}
