import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2){
            System.out.println("O numeros são iguais");
        } else if (numero1 > numero2){
            System.out.println("O primeiro numero e maior");
        } else {
            System.out.println("O segundo numero e maior");
        }
    }
}
