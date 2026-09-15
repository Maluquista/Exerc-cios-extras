package Orientacaoaobjetos.cinema;
import Orientacaoaobjetos.cinema.Filme;
import java.util.Scanner;

public class Sistema {

    static Scanner sc = new Scanner(System.in);

    public static Filme[] informar(){



        Filme[] filmes = new Filme[1];

        for(int i = 0; i < filmes.length; i++){

            Filme filme = new Filme();

            System.out.println("Informe as informações do filme " + (i + 1) + ":\n");

            System.out.println("Código: ");
            int codigo = sc.nextInt();

            System.out.println("Título: ");
            sc.nextLine();
            String titulo = sc.nextLine();

            System.out.println("Gênero: ");
            String genero = sc.next();

            System.out.println("Duração: ");
            String duracao = sc.next();

            System.out.println("Classificação: ");
            String classificacao = sc.next();

            System.out.println("Preço do ingresso: ");
            double precoIngreso = sc.nextDouble();

            filme.setCodigo(codigo);
            filme.setTitulo(titulo);
            filme.setGenero(genero);
            filme.setDuracao(duracao);
            filme.setClassificacao(classificacao);
            filme.setPrecoIngreso(precoIngreso);

            filmes[i] = filme;
        }

        return filmes;
    }

    public static void main(String[]args){

        System.out.println()

        Filme[] filmes = informar();


    }
}
