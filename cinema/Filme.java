package Orientacaoaobjetos.cinema;

public class Filme {

    private int codigo = 0;
    private String titulo = "";
    private String genero = "";
    private String duracao = "";
    private String classificacao = "";
    private double precoIngreso = 0;
    private double valorArrecadado = 0;

    public void setCodigo(int codigoset) {
        codigo = codigoset;
    }

    public void setTitulo(String tituloset) {
        titulo = tituloset;
    }

    public void setGenero(String generoset) {
        genero = generoset;
    }

    public void setDuracao(String duracaoset) {
        duracao = duracaoset;
    }

    public void setClassificacao(String classificacaoset) {
        classificacao = classificacaoset;
    }

    public void setPrecoIngreso(double precoIngresoset) {
        precoIngreso = precoIngresoset;
    }
    public void setValorArrecadado(double valorArrecadadoSet) {
        valorArrecadado = valorArrecadadoSet;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public double getPrecoIngreso() {
        return precoIngreso;
    }

    public double getValorArrecadado(){
        return valorArrecadado;
    }

    public String toString() {
        return "\nCódigo: " + getCodigo() +
                "\nTítulo: " + getTitulo() +
                "\nGênero: " + getGenero() +
                "\nDuração: " + getDuracao() +
                "\nClassificação: " + getClassificacao() +
                "\nPreço do ingresso: " + getPrecoIngreso();
    }
}
