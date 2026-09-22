package associacao;

public class Proprietario {

    private String nome = "";
    private String fone = "";
    private Endereco endereco = new Endereco();

    public Proprietario() {
        nome = "";
        fone = "";
        endereco = null;
    }

    public Proprietario(String nomeset, String foneset, Endereco enderecoset) {
        nome = nomeset;
        fone = foneset;
        endereco = enderecoset;
    }

    public void setNome(String nomeset){
        nome = nomeset;
    }
    public void setFone(String foneset){
        fone = foneset;
    }
    public void setEndereco(Endereco enderecoset){
        endereco = enderecoset;
    }

    public String getNome(){
        return nome;
    }
    public String getFone(){
        return fone;
    }
    public Endereco getEndereco(){
        return endereco;
    }

    public String toString(){
        return "\nNome: " + getNome() +
                "\nFone: " + getFone() +
                "\nEndereço: " + getEndereco();
    }
}
