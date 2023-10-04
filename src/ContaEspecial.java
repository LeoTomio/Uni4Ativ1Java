public class ContaEspecial extends ContaBancaria{
    private double limiteCredito;
    public double getLimiteCredito() {
        return limiteCredito;
    }
    public void setLimiteCredito(double limite) {
        limiteCredito = limite;
    }

    @Override
    public void sacar(double valor) {
        double saldoDisponivel = getSaldo() + getLimiteCredito();

        if (valor <= saldoDisponivel) {
            if(valor <= getSaldo()){
                setSaldoInicial(getSaldo() - valor);
                System.out.println("Saque de R$" + valor + " da conta especial");
            } else {
                double limiteUsado = valor - getSaldo();
                setSaldoInicial(0);
                setLimiteCredito(getLimiteCredito() - limiteUsado);
            }
        } else {
            System.out.println("Sem saldo para realizar o saque");
        }
    }

    @Override
    public void depositar(double valor) {
        setSaldoInicial(getSaldo() + valor);
        System.out.println("Deposito de R$" + valor + " da conta especial");
    }
}
