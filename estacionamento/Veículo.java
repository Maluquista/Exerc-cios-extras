package Orientacaoaobjetos.estacionamento;

public class Veículo {

	/*
	 * Placa: ABC1234 Modelo: Civic Marca: Honda Cor: Preto Ano: 2022
	 */

	private String placa = "";
	private String modelo = "";
	private String cor = "";
	private int ano = 0;

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}

	public int getAno() {
		return ano;
	}

	public String toString() {
		return "Placa: " + getPlaca() + "\nModelo: " + getModelo() + "\nCor: " + getCor() + "\nAno: " + getAno();

	}
}
