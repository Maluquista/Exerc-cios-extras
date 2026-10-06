package assdepher;
import java.util.ArrayList;
import java.util.Scanner;
public class Sistemaa {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Veiculo> veiculos = new ArrayList();
    static Veiculo veiculo = new Veiculo();

    public static void informar(){

        System.out.println("Deseja informar um veículo? S/N");
        String r = sc.nextLine();
        while(("s").equalsIgnoreCase(r)){

            System.out.println("Informe o Chassi: ");
            String chassi = sc.nextLine();
            System.out.println("Informe a placa: ");
            String placa = sc.nextLine();
            System.out.println("Informe o ano de fabricação: ");
            String ano = sc.nextLine();
            System.out.println("Informe o modelo: ");
            String modelo = sc.nextLine();
            System.out.println("Informe o valor: ");
            Double valor = sc.nextDouble();

            System.out.println("Informe o proprietario: ");
            String proprietario = sc.nextLine();
            System.out.println("Informe o Telefone: ");
            String telefone = sc.nextLine();

            while(true) {
                System.out.println("Informe o tipo de proprietario 1(Físico) 2(Jurídico): ");
                int n = sc.nextInt();
                if (n == 1){
                    System.out.println("Informe o CPF: ");
                    String cpf = sc.nextLine();
                    System.out.println("Informe a identidade: ");
                    String identidade = sc.nextLine();
                    System.out.println("Informe o sexo: ");
                    String sexo = sc.nextLine();
                    Fisica fisica = new Fisica();
                    break;
                }
                if(n == 2){
                    System.out.println("Informe o CNPJ: ");
                    String cnpj = sc.nextLine();
                    System.out.println("Informe a inscrição estadual: ");
                    String insoEst = sc.nextLine();
                    Juridica juridica = new Juridica();


                    break;

                }
            }

            System.out.println("Informe a rua ");
            String rua = sc.nextLine();
            System.out.println("Informe o bairro: ");
            String bairro = sc.nextLine();
            System.out.println("Informe o CEP: ");
            String cep = sc.nextLine();
            System.out.println("Informe a cidade: ");
            String cidade = sc.nextLine();
            System.out.println("Informe o estado: ");
            String estado = sc.nextLine();

            Endereco endereco = new Endereco(rua, bairro, cep, cidade, estado);











        }

    }


}
