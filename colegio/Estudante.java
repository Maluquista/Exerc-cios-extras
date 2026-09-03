package colegio;

public class Estudante {

    private String nome = "";
    private int numeroMatricula = 0;
    private int quantidadeCreditos = 0;


    public void setNome(String nomeset) {
        nome = nomeset;
    }

    public void setNumeroMatricula(int numeroMatriculaset) {
        numeroMatricula = numeroMatriculaset;
    }

    public void setQuantidadeCreditos(int quantidadeCreditosset) {
        quantidadeCreditosset = quantidadeCreditos;
    }

    public String getNome(){
        return nome;
    }
    public int getNumeroMatricula(){
        return numeroMatricula;
    }
    public int getQuantidadeCreditos(){
        return quantidadeCreditos;
    }

    public String toString(){
        return "\nNome: " + getNome() +
                "\nNúmero de matrícula: " + getNumeroMatricula() +
                "\nQuantidade de créditos: " + getQuantidadeCreditos() +
                "\nLogin: " + getNome() + (getNumeroMatricula()%1000);

    }



}
