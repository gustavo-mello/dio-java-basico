public class Conta implements InterfaceConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numeroConta;
    private double saldo;
    private Cliente cliente;

    
    

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        
    }

    @Override
    public void transferir(double valor, InterfaceConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Titular: " + this.getCliente().getNome());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Numero da Conta: " + this.getNumeroConta());
        System.out.println("Saldo: " + this.getSaldo());
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Conta [agencia=" + agencia + ", numeroConta=" + numeroConta + ", saldo=" + saldo + ", cliente="
                + cliente + "]";
    }

    
    
}
