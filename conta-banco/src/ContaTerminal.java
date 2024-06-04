import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criação do Scanner para ler os dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Consumir a quebra de linha deixada pelo nextInt()
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Formatação da mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        // Exibição da mensagem final
        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}
