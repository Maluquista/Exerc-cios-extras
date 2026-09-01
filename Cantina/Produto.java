package Cantina;

public class Produto {

	private String nome = "";
	private Double preco = 0.0;
	private int quantidadeEstoque = 0;
	private String categoria = "";

	public void setNome(String nomeset) {
		nome = nomeset;
	}

	public void setPreco(Double precoset) {
		preco = precoset;
	}

	public void setQuantidadeEstoque(int quantidadeEstoqueset) {
		quantidadeEstoque = quantidadeEstoqueset;
	}

	public void setCategoria(String categoriaset) {
		categoria = categoriaset;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getquantidadeEstoque() {
		return quantidadeEstoque;
	}

	public String getCategoria() {
		return categoria;
	}

	public String toString() {
		return "Nome: " + getNome() + "\nPreço: " + getPreco() + "\nQuantidade de estoque: " + getquantidadeEstoque()
				+ "\nCategoria: " + getCategoria();

	}
}
