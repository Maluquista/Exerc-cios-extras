    package Orientacaoaobjetos.Banco;
    import Orientacaoaobjetos.Banco.Conta;
    import jdk.swing.interop.SwingInterOpUtils;

    import java.sql.SQLOutput;
    import java.util.Scanner;

    public class Sistema {

        static Scanner sc = new Scanner(System.in);

        public static void retirar(Conta[] contas){

            int p = 0;

            System.out.println("Qual conta você deseja retirar?\n Digite seu número: (00000)");
            int n = sc.nextInt();

            System.out.println("Informe a quantia a ser retirada: ");
            double q = sc.nextDouble();

            for(int i = 0; i < contas.length; i++){

                if(contas[i].getNumero() == n && contas[i].getSaldo() - q > 0){
                    contas[i].setSaldo(contas[i].getSaldo() - q);
                    p = i;
                    break;
                }
                else{
                    System.out.println("Quantia impossível de retirar!!!");
                }
            }
            System.out.println("Saldo atualizado da conta com o valor retirado:\n" + contas[p].toString());





        }

        public static void depositar(Conta[] contas){

            int p = 0;

            System.out.println("Qual conta você deseja depositar?\n Digite seu número: (00000)");
            int n = sc.nextInt();

            System.out.println("Informe a quantia a ser depositada: ");
            double q = sc.nextDouble();

            for(int i = 0; i < contas.length; i++){

                if(contas[i].getNumero() == n){
                    contas[i].setSaldo(contas[i].getSaldo() + q);
                    p = i;
                    break;
                }
            }
            System.out.println("Saldo atualizado da conta com o valor depositado:\n" + contas[p].toString());

        }

        public static Conta[] informar(){

            System.out.println("Quantas contas bancárias deseja informar?");
            int n = sc.nextInt();

            Conta[] contas = new Conta[n];

            for(int i = 0; i < contas.length; i++){

                Conta conta = new Conta();

                System.out.println("Informe as informações da conta " + (i + 1) + ":\n");

                System.out.println("Número(00000):");
                int numero = sc.nextInt();
                System.out.println("Titular: ");
                String titular = sc.next();
                sc.nextLine();
                System.out.println("CPF: ");
                String cpf = sc.next();
                System.out.println("Tipo de conta Corrente(C) ou Poupança(P): ");
                char esc = sc.next().charAt(0);
                String tipoConta = "";
                if(esc == 'C' || esc == 'c' ){
                    tipoConta = "Corrente";
                }
                else{
                    tipoConta = "Poupança";
                }
                System.out.println("Saldo atual: ");
                double saldo = sc.nextDouble();

                conta.setNumero(numero);
                conta.setTitular(titular);
                conta.setCpf(cpf);
                conta.setTipoConta(tipoConta);
                conta.setSaldo(saldo);

                contas[i] = conta;
                }

            return contas;
        }

        public static void main(String[]args){

            Conta[] contas = informar();

            for(int i = 0; i < contas.length; i++){
                System.out.println(contas[i].toString());
            }

            System.out.println("\nDeseja depositar(DEP) ou retirar(RET) de uma conta?\n Se sim digite o respecitvo caractere da ação. \n Se não digite outra coisa.");
            String r = sc.next();

            while(true) {

                if (r.equalsIgnoreCase("dep")) {
                    depositar(contas);
                }
                else if (r.equalsIgnoreCase("ret")) {
                    retirar(contas);
                }
                else{
                    break;
                }
                System.out.println("\nDeseja depositar(DEP) ou retirar(RET) de uma conta novamente?\n Se sim digite o respecitvo caractere da ação. \n Se não digite outra coisa.");
                r = sc.next();

                if(!r.equalsIgnoreCase("dep") && !r.equalsIgnoreCase("ret")){
                    break;
                }
            }
        }
    }
