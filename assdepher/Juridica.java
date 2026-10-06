package assdepher;

public class Juridica extends Proprietario{


    private String cpnj = "";
    private String insoEst = "";

    public Juridica() {
        super();
        cpnj = "";
        insoEst = "";
    }

    public Juridica(String nomeset, String foneset, Endereco enderecoset,String cpnjset, String insoEstset) {
        super(nomeset, foneset, enderecoset);
        cpnj = cpnjset;
        insoEst = insoEstset;
    }

    public void setCpnj(String cpnjset) {
        cpnj = cpnjset;
    }

    public void setInsoEst(String insoEstset) {
        insoEst = insoEstset;
    }

    public String getCpnj() {
        return cpnj;
    }
    public String getInsoEst() {
        return insoEst;
    }

    public String toString() {
        return "CNPJ: " + cpnj +
                "Inscrição estadual: " + insoEst;
    }

}
