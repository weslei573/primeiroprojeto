import java.util.Scanner;

public class DESAFIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Nome = "Augusto";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        String mensagem = """
                **********************************
                Dados iniciais do cliente:
                
                Nome:           %s
                Tipo conta:     %s
                Saldo inicial:  %.2f
                **********************************
                """.formatted(Nome, tipoConta, saldoInicial);
        System.out.println(mensagem);

        int operacoes = 0;
        while (operacoes != 4) {
            String menu = """
                    Operações
                    
                    1. Consultar saldos
                    2. Receber valor
                    3. Transferir valor
                    4. Sair
                    """;
            System.out.println(menu);
            System.out.println("Digite a opção desejada: ");
            operacoes = scanner.nextInt();
            switch (operacoes) {
                case 1:
                    System.out.println("O saldo atual é R$ " + saldoInicial);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    double receber = scanner.nextDouble();
                    saldoInicial += receber;
                    System.out.println("Saldo atualizando R$ " + saldoInicial);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    double transferir = scanner.nextDouble();
                    if (transferir <= saldoInicial) {
                        saldoInicial -= transferir;
                        System.out.println("Saldo atualizando R$ " + saldoInicial);

                    } else {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    }
                    break;
                case 4:
                    System.out.println("Operação Finalizada");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
        }
    }
}
