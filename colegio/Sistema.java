package colegio;

public class Sistema {

    public static void informar(){

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.setNome("Fernando");
        estudante01.setNumeroMatricula("556644");
        estudante01.setQuantidadeCreditos(35);
        estudante02.setNome("Beth");
        estudante02.setNumeroMatricula("579035");
        estudante02.setQuantidadeCreditos(80);

        System.out.println(estudante01.toString);
        System.out.println(estudante02.toString);
    }

    public static void main(String[] args){

        informar();
    }
}

