package Venda;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Sistema {

	static Scanner sc = new Scanner(System.in);
	static Vendas vendas = new Vendas();
	static DecimalFormat df = new DecimalFormat("00.");
		
		public static void informar() {
		System.out.println("Informe o código de vendas: ");
		int codigo = sc.nextInt();
		sc.nextLine();
		System.out.println("Informe o nome: ");
		String nome = sc.nextLine();
		System.out.println("Informe o telefone: ");
		String telefone = sc.nextLine();
		System.out.println("Descreva o produto:");
		String descricao = sc.nextLine();
		System.out.println("Informe a Quantidade:");
		int quantidade = sc.nextInt();
		System.out.println("Informe o preço unitário:");
		int precounitario = sc.nextInt();
		
		vendas.setCodigovendas(codigo);
		vendas.setNomeclientes(nome);
		vendas.setTelefonecliente(telefone);
		vendas.setDescricaoproduto(descricao);
		vendas.setQuantidade(quantidade);
		vendas.setPrecounitario(precounitario);
		}
		
		public static void main(String[]args) {
			informar();
			
			System.out.println(vendas.toString());
		}
		
	
}
