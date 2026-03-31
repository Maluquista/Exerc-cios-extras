package aula;

import java .util.Scanner;
import java.text.DecimalFormat;
public class ex01ref {

public static void main(String[]args) {	
	
Scanner sc = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("#0.##");

/*Elabore um programa que leia 10 valores inteiros e ao final escreva como resultado:
a media dos valores positivos lidos
quantos valores são menores que zero
quantos valores estão no intervalo 5..50, incluindo os valores dos limites

REFATORAR:  todo valor no intervalo entre 5 .. 50 deve ser testado, 
pois no final o programa deve ser capaz de dizer qual o maior e o menor valor informados neste intervalo.
*/

int i = 0;
int n = 0;
int s = 0;
int sn = 0;
int v = 0;
int m = 0;
int med = 0;
int mr = 0;
int mnr = 0;
double mrvalor = Integer.MIN_VALUE;
double mnrvalor = Integer.MAX_VALUE;

System.out.println("Informe 10 valores: ");
 for(i = 1; i <= 10; i++) {
  System.out.println("Valor " + i + ":");
   n = sc.nextInt();
  
   
   
 if(n > 0) {
  s = s + n;
  m = m + 1;
} 
 if(n < 0) {
  sn = sn + 1;
}	 
 if(n >= 5 && n <=50){
	 v = v + 1; 
 }
 if(n >= 5 && n <=50 && n >= mrvalor) {
	 mrvalor = n;
}
 if(n >= 5 && n <= 50 && n <= mnrvalor) {
	 mnrvalor = n;
 }
 }
med = s/m;
System.out.println("A média dos valores positivos é: " + med + ".");
 System.out.println("Foi informado " + sn + " abaixo de zero.");
  System.out.println(v  + " valores estão no intervalo de 5-50.");
   System.out.println("Maior valor: " + df.format(mrvalor));
    System.out.println("Menor valor: " + df.format(mnrvalor));
}
}	
