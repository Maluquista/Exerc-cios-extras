package aula;
import java.util.Scanner;

public class whilebyte {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int res = 0;
		int v =  0;
		String msg = "";
		int b = 0;
		
		System.out.println("Informe um valor: ");
			v = sc.nextInt();
		
		while(res == 1 || res == 0 && v > 0) {
			
			b = v % 2;
			v = v/2;
			msg = b + msg;	
		}
		
		System.out.println("Bites: " + msg);	
}
}