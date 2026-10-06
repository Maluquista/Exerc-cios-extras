package assdepher;

public class Fisica extends Proprietario {

    private String cpf = "";
    private String identidade = "";
    private String sexo = "";

    public Fisica() {
        super();
        cpf = "";
        identidade = "";
        sexo = "";
    }

    public Fisica(String nomeset, String foneset, Endereco enderecoset, String cpfset, String identidadeset, String sexoset) {
        super(nomeset,foneset,enderecoset);
        cpf = cpfset;
        identidade = identidadeset;
        sexo = sexoset;
    }

    public void setcpf(String cpfset) {
        cpf = cpfset;
    }
    public void setidentidade(String identidadeset) {
        identidade = identidadeset;
    }
    public void setsexo(String sexoset) {
        sexo = sexoset;
    }

    public String getcpf() {
        return cpf;
    }
    public String getidentidade() {
        return identidade;
    }
    public String getsexo() {
        return sexo;
    }

    public String toString() {
        return "CPF: " + cpf +
                "Identidade: " + identidade +
                "Sexo: " + sexo;
    }
}
