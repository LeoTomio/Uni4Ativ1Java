public class ContaPoupanca extends ContaBancaria{


    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldoInicial(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " da conta poupança.");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        setSaldoInicial(getSaldo() + valor);
        System.out.println("Deposito de R$" + valor + " da conta poupança.");
    }
}
