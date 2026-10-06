package assdepher;

public class CalculaPreco {

    public double calculaNovoPreco(double valor, String modelo) {

        if (modelo.equalsIgnoreCase("FIAT")) {
            return valor * 1.50;
        }
        else if (modelo.equalsIgnoreCase("JEEP")) {
            return valor * 1.70;
        }
        else if (modelo.equalsIgnoreCase("CHEVROLET")) {
            return valor * 1.30;
        }
        else{
            return valor * 1.10;
        }
    }
}
