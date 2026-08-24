package Orientacaoaobjetos.estacionamento;

import java.util.Scanner;

public class Sistema {

	static Scanner sc = new Scanner(System.in);
	static Veículo veiculo = new Veículo();

	public static void informar() {

		System.out.println("Informe a placa: ");
		String placa = sc.next();
		System.out.println("Informe o modelo: ");
		String modelo = sc.next();
		System.out.println("Informe a cor: ");
		String cor = sc.next();
		System.out.println("Informe o ano: ");
		int ano = sc.nextInt();

		veiculo.setPlaca(placa);
		veiculo.setModelo(modelo);
		veiculo.setCor(cor);
		veiculo.setAno(ano);
	}

	public static void main(String[] args) {
		informar();

		System.out.println(veiculo.toString());
	}
}
