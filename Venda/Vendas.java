package Venda;
import java.text.DecimalFormat;
public class Vendas {

	private int codigovendas = 0;
	private String nomeclientes = "";
	private String telefonecliente = "";
	private String descricaoproduto = "";
	private int quantidade = 0;
	private float precounitario = 0;
	DecimalFormat df = new DecimalFormat("00.");
	
	public void setCodigovendas(int codigovendas) {
		this.codigovendas = codigovendas;
	}
	public void setNomeclientes(String nomeclientes) {
		this.nomeclientes = nomeclientes;
	}
	public void setTelefonecliente(String telefonecliente) {
		this.telefonecliente = telefonecliente;
	}
	public void setDescricaoproduto(String descricaoproduto) {
		this.descricaoproduto = descricaoproduto;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void setPrecounitario(float precounitario) {
		this.precounitario = precounitario;
	}
	
	public int getCodigovendas() {
		return codigovendas;
	}
	public String getNomeclientes() {
		return nomeclientes;
	}
	public String getTelefoneCliente() {
		return telefonecliente;
	}
	public String getDescricaoproduto() {
		return descricaoproduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public float getPrecounitario() {
		return precounitario;
	}
	public float Valortotalvenda() {
		return (quantidade * precounitario);
	}
	public String toString(){
		return "\nCódigo de vendas:" + getCodigovendas() + 
			   "\nNome do cliente: " + getNomeclientes() +
			   "\nTelefone do cliente: " + getTelefoneCliente() +
			   "\nDescrição do produto: " + getDescricaoproduto() +
			   "\nQuantidade: " + getQuantidade() +
			   "\nPreço unitário: " + getPrecounitario() +
			   "\nValor total: " + Valortotalvenda();
		
				
		
	}
}
