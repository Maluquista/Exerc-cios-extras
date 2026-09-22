package associacao;

public class Endereco {

    private String rua = "";
    private String bairro = "";
    private String cep = "";
    private String cidade = "";
    private String uf = "";

    public Endereco() {

        rua = "";
        bairro = "";
        cep = "";
        cidade = "";
        uf = "";
    }

    public Endereco(String ruaset, String bairroset, String cepset, String cidadeset, String ufset) {

        rua = ruaset;
        bairro = bairroset;
        cep = cepset;
        cidade = cidadeset;
        uf = ufset;


    }

    public void setRua(String ruaset) {
        rua = ruaset;
    }

    public void setBairro(String bairroset) {
        bairro = bairroset;
    }

    public void setCep(String cepset) {
        cep = cepset;
    }

    public void setCidade(String cidadeset) {
        cidade = cidadeset;
    }

    public void setUf(String ufset) {
        uf = ufset;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String toString() {
        return "Rua: " + getRua() +
                "\nBairro: " + getBairro() +
                "\nCEP: " + getCep() +
                "\nCidade: " + getCidade() +
                "\nUF: " + getUf();
    }
}

