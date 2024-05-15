import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Guarda as informações recebidas via terminal
        Scanner ler = new Scanner(System.in);

        //Define o saldo do usuario. *obs foi definido assim pois não faz sentido o usuario digitar seu proprio saldo
        double saldo = 237.80;

        System.out.println("Por favor, digite o nome do cliente"); //Pergunta o usuario seu nome 
        String nome = ler.nextLine();//Recebe o nome do usuario
        System.out.println("Por favor, digite o número da Agência");//Pergunta o usuario sua agencia 
        String agencia = ler.next();//Recebe a agencia do usuario
        System.out.println("Por favor, digite o número da conta");//Pergunta o usuario sua conta 
        int num = ler.nextInt();//Recebe o numero da conta do usuario
        

        //Mostra na tela algumas das informações da conta do mesmo
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + num + " e seu saldo " + saldo + " já está disponível para saque");


    }
}
