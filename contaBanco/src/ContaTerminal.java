import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e armazena o número da conta
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt

        // Solicita e armazena o número da agência
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        // Solicita e armazena o nome do cliente
        System.out.println("Por favor, digite o seu Nome!");
        String nomeCliente = scanner.nextLine();

        // Solicita e armazena o saldo da conta
        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem final com os dados fornecidos
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        // Fecha o scanner
        scanner.close();
    }
}