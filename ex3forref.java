package aula;

import java.util.Scanner;

public class ex3forref {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Em uma escola os alunos aprovados ao final do ano letivo recebem citações de
		 * honra ao mérito pelo seu desempenho escolar. Somente recebe a citação o aluno
		 * cuja media anual for igual ou superior a 7,0. Esta media anual é obtida com
		 * base na media aritmética simples das medias bimestrais do aluno. Esta citação
		 * é concedida com base em algumas regras, a saber: O aluno recebe a citação
		 * ‘honras pelo bom aproveitamento’ quando sua media anual estiver entre 7,0 e
		 * 7,9 O aluno recebe a citação ‘honras pelo ótimo aproveitamento’ quando sua
		 * media anual estiver entre 8,0 e 8,9 O aluno recebe a citação ‘honras pelo
		 * excelente aproveitamento’ quando sua media anual estiver entre 9,0 e 10,0 O
		 * aluno recebe a citação ‘aluno exemplar’ quando sua media anual estiver entre
		 * 9,0 e 10,0 e tiver pelo menos duas medias bimestrais iguais a 10,0
		 * 
		 * Elabore um programa que leia as medias bimestrais de 5 alunos e para cada um
		 * calcule sua media anual de aproveitamento e sua citação de honra ao mérito.
		 * Ao final este programa deverá escrever: Quantos alunos obtiveram ‘honras pelo
		 * bom aproveitamento’ Qual o percentual de alunos que obtiveram o conceito
		 * ‘aluno exemplar’
		 Refatorar: pegue o grupo de alunos com média entre 9.0 e 10.0 (excelentes e exemplares). 
		 O programa deve ser capaz de dizer se no cômputo geral estas médias tenderam mais para o 9.0 ou para o 10.0.
		  Considere a nota 9.5 como ponto de corte entre os dois limiares 
		 */

		int i = 0;
		int f = 0;
		float a = 0;
		float n = 0;
		int hp = (int) 0;
		int ae = 0;
		int ae2 = 0;
		int porc = 0;
		int nv = 0;
		int nv2 = 0;
		String rt = "";
		String s = "";
		
		System.out.println("Informe as médias bimestrais dos 5 alunos.");

		for (f = 1; f <= 5; f++) {
			System.out.println("\nAluno " + f + " =\n");

			for (i = 1; i <= 4; i++) {
				System.out.println("Nota " + i + ":");
				n = sc.nextFloat();
				a = a + n;

				if (n == 10) {
					ae2 = ae2 + 1;
				}
			}
			a = a / 4;
			if (a >= 7 && a <= 7.9) {
				System.out.println("Aluno " + f + " recebeu: honras pelo bom aproveitamento");
				System.out.println("Média: " + a);
				hp = hp + 1;
			}
			if (a >= 8 && a <= 8.9) {
				System.out.println("Aluno " + f + " recebeu: honras pelo ótimo aproveitamento.");
				System.out.println("Média: " + a);
			}
			if (a >= 9 && a <= 10 && ae2 < 2) {
				System.out.println("Aluno " + f + " recebeu: honras pelo excelente aproveitamento.");
				System.out.println("Média: " + a);
			}
			if (a >= 9 && a <= 10 && ae2 >= 2) {
				System.out.println("Aluno " + f + " recebeu: aluno exemplar.");
				System.out.println("Média: " + a);
				ae = ae + 1;
				porc = ae * 20;
			}
				if (a >= 9 && a <= 10 && ae2 < 2 || ae2 >= 2 && a <= 9.5) {
				nv++;
			}
				if (a >= 9 && a <= 10 && ae2 < 2 || ae2 >= 2 && a <= 9.5) {
				nv2++;
					
				}
			
			a = 0;
			ae2 = 0;
		}
			if(nv > nv2)
				rt = rt + nv;
			if(nv < nv2)
				rt = rt + nv2;
			if(nv >=2 && nv2 >=2) {
			s = "s";
			}
			if(nv == nv2) {
				rt = "Os dois possuem " + nv + " média" + s + " tanto para cima de 9.5 tanto para baixo.";
			}
			
			
		System.out.println(hp + " obtiveram honra pelo aproveitamento.");
		System.out.println(porc + " % dos alunos obtiveram aluno exemplar.");
		System.out.println(rt);
	}
}