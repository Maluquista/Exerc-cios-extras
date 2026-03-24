package exercícios;
import java.util.Scanner;
import java.text.DecimalFormat;
public class repetição {

public static void main(String[]args) {
 DecimalFormat df = new DecimalFormat("##0.00");
  Scanner sc = new Scanner(System.in);	

int i = 0;
int lmt = 0;
double valor = 0;
double soma = 0;
double media = 0;
double mrvalor = Integer.MIN_VALUE;

//Informe o número de repetições e depois o maior número informado.

System.out.println("Quantas repetições o senhor gostaria de fazer?");
 lmt = sc.nextInt();

 for(i = 1; i <=lmt; i++) {
  System.out.println("Informe um valor " + i + ":");
   valor = sc.nextInt(); 
    soma = soma + valor;
   
  if(valor > mrvalor) {
    mrvalor = valor;
}
}

media = (soma)/lmt;
 System.out.println("A média é: " + df.format(media));
  System.out.println("Maior número é: " + mrvalor);
}	
}
