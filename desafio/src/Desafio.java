import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Claudimilson Bonfim";
        String tipoConta = "Corrente";
        double saldo = 3500.00;

        System.out.println("**********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("\n**********************");

        int opcao = 0;
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
               
               """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja trasferir");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado R$ " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção invalida");
            }
        }
    }
}
