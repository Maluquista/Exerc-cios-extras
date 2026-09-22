package associacao;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

import associacao.Proprietario;

public class Programa {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Proprietario> proprietarios = new ArrayList();

    public static void informar() {

        char r;
        int contador = 0;
        while (true) {

            contador++;

            System.out.println("Informe os dados do proprietário " + contador + " =\n");

            System.out.println("Nome: ");
            String nome = sc.next();
            sc.nextLine();
            System.out.println("Fone: ");
            String fone = sc.next();
            sc.nextLine();

            System.out.println("Rua: ");
            String rua = sc.next();
            sc.nextLine();
            System.out.println("Bairro: ");
            String bairro = sc.next();
            System.out.println("CEP: ");
            String cep = sc.next();
            System.out.println("Cidade: ");
            String cidade = sc.next();
            sc.nextLine();
            System.out.println("UF: ");
            String uf = sc.next();


            Endereco endereco = new Endereco(rua, bairro, cep, cidade, uf);
            Proprietario proprietario = new Proprietario(nome, fone, endereco);
            proprietarios.add(proprietario);

            System.out.println("Deseja informar mais um proprietário? S/N");
            r = sc.next().charAt(0);

            if (r != ('S') && r != ('s')) {
                break;
            }
        }
    }

    public static void mostrar() {
        for (int i = 0; i < proprietarios.size(); i++) {

            System.out.println(proprietarios.get(i).toString());
        }
    }

    public static void main(String[] args) {

        informar();
        mostrar();
    }
}
