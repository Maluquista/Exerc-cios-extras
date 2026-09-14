package Orientacaoaobjetos.Banco;
import java.text.DecimalFormat;
public class Conta {

    DecimalFormat df = new DecimalFormat("R$00.00");

    private int numero = 0;
    private String titular = "";
    private String cpf = "";
    private String tipoConta = "";
    private double saldo = 0;

    public void setNumero(int numeroset){
        numero = numeroset;
    }
    public void setTitular(String titularset){
        titular = titularset;
    }
    public void setCpf(String cpfset){
        cpf = cpfset;
    }
    public void setTipoConta(String tipoContaset){
        tipoConta = tipoContaset;
    }
    public void setSaldo(double saldoset){
        saldo = saldoset;
    }


    public int getNumero(){
        return numero;
    }
    public String getTitular(){
        return titular;
    }
    public String getCpf(){
        return cpf;
    }
    public String getTipoConta(){
        return tipoConta;
    }
    public double getSaldo(){
        return saldo;
    }

    public String toString(){
        return "\nConta = \n" +
                "\nNúmero: " + getNumero() +
                "\nTitular: " + getTitular() +
                "\nCPF: " + getCpf() +
                "\nTipo de conta: " + getTipoConta() +
                "\nSaldo: " + df.format(getSaldo());
    }

}
