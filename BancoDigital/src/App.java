public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("Rafael");
        Conta contaC = new ContaCorrente(c1);
        Conta contaP = new ContaPoupanca(c1);

        contaC.depositar(12000);
        contaC.sacar(5000);
        
        contaC.transferir(5000, contaP);
        contaC.extrato();       

        contaP.depositar(12000);
        contaP.sacar(5000);       
        contaP.extrato();

    }
}
