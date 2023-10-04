public abstract class ContaBancaria {
   private int numeroConta;
   private double saldoInicial;
   private String cpfCliente;
   public int getNumeroConta() {
       return numeroConta;
   }
   public double getSaldo() {
       return saldoInicial;
   }
   public String getCpfCliente() {
       return cpfCliente;
   }
   public void setNumeroConta(int numero) {
       numeroConta = numero;
   }
   public void setSaldoInicial(double saldo) {
       saldoInicial = saldo;
   }
   public void setCpfCliente(String cpf) {
       cpfCliente = cpf;
   }
   public abstract void sacar(double valor);
   public abstract void depositar(double valor);


}
