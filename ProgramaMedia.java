package testee;

import java.util.Scanner;

public class ProgramaMedia {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome:");
			String nome = sc.nextLine();
		
		System.out.println("Informe a nota 1:");
		float n1 = sc.nextFloat();
		
		System.out.println("Informe a nota 2:");
		float n2 = sc.nextFloat();
		
		System.out.println("Informe a nota 3:");
		float n3 = sc.nextFloat();
		
		System.out.println("Informe a nota 4:");
		float n4 = sc.nextFloat();
		
		Aluno oAluno = new Aluno();
		
		oAluno.setNome(nome);
		oAluno.setNota1(n1);
		oAluno.setNota2(n2);
		oAluno.setNota3(n3);
		oAluno.setNota4(n4);
		
		System.out.println(oAluno.toString());
		
		sc.close();
	}
}
