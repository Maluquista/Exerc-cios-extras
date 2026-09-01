package telefonia;

import java.util.Scanner;

public class Sistema {

	static Conta conta = new Conta();
	static Scanner sc = new Scanner(System.in);

	public static void informar() {

		System.out.println("Informe o cliente: ");
		String cliente = sc.next();

		System.out.println("Informe o tipo de conta, Residencial(R) ou Comercial(C):");
		char tipoConta = sc.next().charAt(0);
		Double quantidadeImpulso = 0.0;
		while (true) {

			if (tipoConta == 'R' || tipoConta == 'r') {
				quantidadeImpulso = 0.45;
				break;
			}
			if (tipoConta == 'C' || tipoConta == 'c') {
				quantidadeImpulso = 0.35;
				break;
			}
			System.out.println("Caractere inválido.\n Informe o tipo de conta, Residencial(R) ou Comercial(C):");
			tipoConta = sc.next().charAt(0);
		}
		System.out.println("Numero de telefone:");
		String numeroTelefone = sc.next();
		System.out.println("Informe o Mes/Ano: ");
		String mesano = sc.next();
		sc.next();

		System.out.println("Informe a quantidade de impulso:\n 0.45 ou 0.35");
		quantidadeImpulso = quantidadeImpulso * sc.nextDouble();

		double valorTotalConta = 0.0;
		if (tipoConta == 'r') {
			valorTotalConta = quantidadeImpulso * 55;
			
		}
		else {
			valorTotalConta = quantidadeImpulso * 70;
		}
		
		
		conta.setCliente(cliente);
		conta.setTipoConta(tipoConta);
		conta.setNumeroTelefone(numeroTelefone);
		conta.setMesAno(mesano);
		conta.setQuantidadeImpulso(quantidadeImpulso);
		conta.setValorTotalConta(valorTotalConta);
	}

	public static void main(String[] args) {

		informar();
		System.out.println(conta.toString());
	}
}
