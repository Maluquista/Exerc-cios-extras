package Cantina;

import java.util.Scanner;
import Cantina.Produto;

public class Sistema {

	static Produto produto = new Produto();

	public static void informar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome do produto:");
		String nome = sc.next();
		System.out.println("Informe o preco do produto:");
		double preco = sc.nextDouble();
		System.out.println("Informe a quantidade do produto:");
		int quantidadeEstoque = sc.nextInt();
		System.out.println("Informe a categoria do produto:");
		String categoria = sc.next();

		produto.setNome(nome);
		produto.setPreco(preco);
		produto.setQuantidadeEstoque(quantidadeEstoque);
		produto.setCategoria(categoria);

	}

	public static void main(String[] args) {

		informar();

		System.out.println(produto.toString());

	}
}
