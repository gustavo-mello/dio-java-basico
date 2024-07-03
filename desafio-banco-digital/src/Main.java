public class Main {
    public static void main(String[] args) {

        Banco banco1 = new Banco();
        banco1.setNome("Nubanck");

        Cliente cliente1 = new Cliente("Gustavo");

        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente1);

        contaCorrente.depositar(100);
        contaCorrente.transferir(50, contaPoupanca);

        banco1.adicionarConta(contaCorrente);
        banco1.adicionarConta(contaPoupanca);


        for (Conta conta : banco1.getContas()) {
            conta.imprimirExtrato();
            
        }

    }
}
