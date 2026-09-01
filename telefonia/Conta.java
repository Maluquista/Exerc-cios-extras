package telefonia;
import java.text.DecimalFormat;

public class Conta {		
	
	private String cliente = "";
	private char tipoConta = ' ';
	private String numeroTelefone = "";
	private String mesAno = "";
	private Double quantidadeImpulso = 0.0;
	private Double valorTotalConta = 0.0;
	static DecimalFormat df= new DecimalFormat("00.0");
	
	public void setCliente(String clienteset) {
		cliente = clienteset;
	}
	public void setTipoConta(char tipoContaset) {
		tipoConta = tipoContaset;
	}
	public void setNumeroTelefone(String numeroTelefoneset) {
		numeroTelefone = numeroTelefoneset;
	}
	public void setMesAno(String mesAnoset) {
		mesAno = mesAnoset;
	}
	public void setQuantidadeImpulso(Double quantidadeImpulsoset) {
	quantidadeImpulso = quantidadeImpulsoset;	
	}
	public void setValorTotalConta(Double valorTotalContaset) {
		valorTotalConta = valorTotalContaset;
	}
	
	public String getCliente() {
		return cliente;
	}
	public char getTipoConta() {
		return tipoConta;
	}
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	public String getMesAno() {
		return mesAno;
	}
	public Double getQuantidadeImpulso() {
		return quantidadeImpulso;
	}
	public Double getValorTotalConta() {
		return valorTotalConta;
	}
	
	public String toString() {
		return "Cliente:" + getCliente() +
				"\nTipo de conta: " + getTipoConta() +
				"\nNúmero de telefone: " + getNumeroTelefone() +
				"\nMês/Ano: " + getMesAno() + 
				"\nQuantidade de impulso: " + getQuantidadeImpulso() + 
				"\nValor total da conta: " + df.format(getValorTotalConta());
	}
	
	
	
}
