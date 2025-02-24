
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // Objeto Scanner para captura entrada do usuário.
        System.out.println("Por favor, Digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        String nomecliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        while (!scanner.hasNextDouble()) { // Garante que um número válido seja inserido
            System.out.println("Entrada inválida! Digite um número válido para o saldo:");
            scanner.next();
        }
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomecliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saldo. ");

        scanner.close();
    }
}