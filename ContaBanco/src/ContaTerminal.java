import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem-vindo ao Banco do Java!");
        System.out.println("Por favor, digite os dados a seguir para criar sua conta: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = sc.next();

        sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = sc.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
