package assdepher;

public class Veiculo {

    private String chassi = "";
    private String placa = "";
    private String modelo = "";
    private int anoFabricacao = 0;
    private double valor = 0;
    private Proprietario proprietario = null;

    public Veiculo() {
        String chassi = "";
        String placa = "";
        String modelo = "";
        int anoFabricacao = 0;
        double valor = 0;
        Proprietario proprietario = null;
    }
    public Veiculo(String chassiset, String placaset, String modeloset, int anoFabricacaoset,double valorset, Proprietario proprietarioset) {
        chassi = chassiset;
        placa = placaset;
        modelo = modeloset;
        anoFabricacao = anoFabricacaoset;
        valor = valorset;
        proprietario = proprietarioset;
    }

    public void setChassi(String chassiset) {
        chassi = chassiset;
    }
    public void setPlaca(String placaset) {
        placa = placaset;
    }
    public void setModelo(String modeloset) {
        modelo = modeloset;
    }
    public void setAnoFabricacao(int anoFabricacaoset) {
        anoFabricacao = anoFabricacaoset;
    }
    public void setValor(double valorset) {
        valor = valorset;
    }
    public void setProprietario(Proprietario proprietarioset) {
        proprietario = proprietarioset;
    }

    public String getChassi() {
        return chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public Proprietario getProprietario() {
        return proprietario;
    }
    public double getValor() {
        CalculaPreco calculaPreco = new CalculaPreco();
        return calculaPreco.calculaNovoPreco(getValor(),getModelo());
    }
    public String toString(){
        return "Chassi: " + getChassi() +
                "Placa: " + getPlaca() +
                "Modelo: " + getModelo() +
                "Fabricação: " + getAnoFabricacao() +
                "Proprietário: " + getProprietario();
    }

}
