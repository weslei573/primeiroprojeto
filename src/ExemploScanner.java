import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite o valor que pretente investir esse mês: ");
        double valor = scanner.nextDouble();

        System.out.println(nome + " que tem "+ idade+" anos, irá investir R$ "+valor+" esse mês");

        scanner.close();
    }
}
