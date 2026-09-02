package colegio;

public class Estudante {

    private String nome = "";
    private String numeroMatricula = "";
    private int quantidadeCreditos = 0;


    public void setNome(String nomeset) {
        nome = nomeset;
    }

    public void setNumeroMatricula(String numeroMatriculaset) {
        numeroMatricula = numeroMatriculaset;
    }

    public void setQuantidadeCreditos(int quantidadeCreditosset) {
        quantidadeCreditosset = quantidadeCreditos;
    }

    public String getNome(){
        return nome;
    }
    public String getNumeroMatricula(){
        return numeroMatricula;
    }
    public int getQuantidadeCreditos(){
        return quantidadeCreditos;
    }

    public String toString(){
        return "Nome: " + getNome() +
                "Número de matrícula: " + getNumeroMatricula() +
                "Quantidade de créditos: " + getQuantidadeCreditos() +
                "Login: " + getNome() + getNumeroMatricula();

    }



}
