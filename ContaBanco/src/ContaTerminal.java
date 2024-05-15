import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner ler = new Scanner(System.in);

        double saldo = 237.80;

        System.out.println("Por favor, digite o nome do cliente");
        String nome = ler.nextLine();
        System.out.println("Por favor, digite o número da Agência");
        String agencia = ler.next();
        System.out.println("Por favor, digite o número da conta");
        int num = ler.nextInt();
        

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + num + " e seu saldo " + saldo + " já está disponível para saque");


    }
}
