public abstract class Conta implements IConta {
    
    private int agencia;
    private int numConta;
    private double saldo;
    private int agenciaPadrao = 114;
    private static int seq = 1;
    private Cliente cliente;


    

    public Conta(Cliente cliente) {
        this.agencia = agenciaPadrao;
        this.numConta = seq++;
        this.saldo = 0;
        this.cliente = cliente;
    }

    public int getAgenciaPadrao() {
        return agenciaPadrao;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {
        if(valor <= saldo){
            this.saldo -= valor;
            System.out.println("Valor restante é de " + saldo);
        }else{
            System.out.println("Você não possui saldo suficiente");
        }
        
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Novo saldo é de " + saldo);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
            if(valor <= saldo){
                this.sacar(valor);
                contaDestino.depositar(valor);
            }else{
                System.out.println("você não possui saldo suficiente, realize o deposite e tente novamente!");
            }            
    }

    public void imprimirExtrato(){
        System.out.println("O numero da sua agencia é " + getAgencia() + ", numero da conta " + getNumConta() + " e o saldo de " + saldo + " nome do dono da conta " + cliente.getNome());
    }
}
