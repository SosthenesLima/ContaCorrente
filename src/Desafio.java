import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Sósthenes Oliveira Lima";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;


        System.out.println("************************************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n************************************************");

        String menu = """
                ** Digite a sua opção **
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Pix
                4 - Receber Valor
                5 - Sair
                                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 5) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O Saldo atualizado é: " + saldo);

            } else if (opcao == 2) {

                System.out.println("Qual é o valor que deseja transferir?: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");

                } else {
                    //saldo = saldo - valor;
                    saldo -= valor;
                    System.out.println("Novo Saldo " + saldo);
                }

            } else if (opcao == 3) {
                System.out.println("Pix recebido: ");
                double pix = leitura.nextDouble();
                saldo += pix;
                System.out.println("Novo saldo " + saldo);
            } else if (opcao == 4) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if (opcao != 5) {
                System.out.println("Opção Inválida!");
            }
        }
    }
}