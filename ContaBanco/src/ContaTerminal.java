import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //ToDO: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        // Exibir a mensagem conta criada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor digite o número da agência");
        String numeroAgencia = teclado.nextLine();
        // ler o numero da agencia digitado pelo usuario
        System.out.println("Digite o número de sua conta");
        int numeroConta = teclado.nextInt();
        // ler o numero da conta digitado pelo usuario
        teclado.nextLine();
        //para não bugar o Scanner
        System.out.println("Digite seu nome completo");
        String nome = teclado.nextLine();
        //ler o nome digitado pelo usuario
        System.out.println("Digite seu saldo");
        double saldo = teclado.nextDouble();
        //ler o saldo digitado pelo usuario
        System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco sua  "+ numeroAgencia + " , conta "+ numeroConta + " e seu saldo "+ saldo + " já está disponível para saque");
        // resultado final    
        teclado.close();

    }
}
