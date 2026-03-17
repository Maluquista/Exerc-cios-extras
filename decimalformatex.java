	package aula;
import java.text.DecimalFormat;
import java.util.Scanner;

public class decimalformatex {

	
public static void main(String[]args) {

	DecimalFormat df = new DecimalFormat("00.00");
	Scanner sc = new Scanner(System.in);
	double q = 0;
	System.out.println("Informe um número quebrado: ");
	q = sc.nextDouble();
	System.out.println(df.format(q));
	
}

}
