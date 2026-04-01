package aula;
import java.util.Scanner;

public class whilebyte {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int res = 0;
		int v =  0;
		String msg = "";
		int b = 0;
		int soma = 0;
		int cont = 0;
		String continua = "S";
		
		
		System.out.println("Ler um número? S/N");
		 continua = sc.next();	
	while(continua.equalsIgnoreCase("S")) {
				System.out.println("Informe o número: ");
				v = sc.nextInt();
		while(res == 1 || res == 0 && v > 0) {
			
			b = v % 2;
			v = v/2;
			msg = b + msg;	
		    }
		 if(b == 0) {
			msg = b + msg;	
		  }
		 System.out.println("Bytes: " + msg);
		 msg = "";
		 System.out.println("\nLer um número? S/N");
		  continua = sc.next();		

}				 
}
}