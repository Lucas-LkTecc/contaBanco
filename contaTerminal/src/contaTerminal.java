import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuario
        //Obter pelo Scanner os valores digitados no terminal
        //Exibir mensagem conta criada

        var scanner  = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta !");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da sua Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome !");
        String nome = scanner.nextLine();

        double saldo = 275;

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponivel.%n", nome, agencia, numero, saldo);

        scanner.close();
    }
}
