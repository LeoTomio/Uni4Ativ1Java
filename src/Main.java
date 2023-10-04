public class Main {
    /*
     Crie uma classe abstrata Conta Bancaria que contém como atributos o
     número da conta e o saldo, e como métodos abstratos sacar e depositar
     que recebem um parâmetro do tipo double. Depois, defina duas outras classes onde os
     métodos devem ser implementados para contas do tipo poupança e especial (limite de
     crédito). A classe Conta deve ter como atributos o número da conta, cpf do cliente e o
     saldo. Para isso, ela deve fornecer outros métodos, não abstratos para implementar a
     interface de manipulação desses atributos.
    */
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaEspecial contaEspecial = new ContaEspecial();

        //Poupança
        contaPoupanca.setNumeroConta(10);
        contaPoupanca.setSaldoInicial(1000.0);
        contaPoupanca.setCpfCliente("12345678900");

        //Especial
        contaEspecial.setNumeroConta(2);
        contaEspecial.setSaldoInicial(1500.0);
        contaEspecial.setLimiteCredito(1000.0);
        contaEspecial.setCpfCliente("98765432100");

        //Poupança
        contaPoupanca.sacar(500.0);
        contaPoupanca.depositar(300.0);

        System.out.println("");
        //Especial
        contaEspecial.sacar(3000.0); //acima do limite
        contaEspecial.depositar(500.0);

        System.out.println("");
        System.out.println("Informações da Conta Poupança:");
        System.out.println("Número da Conta: " + contaPoupanca.getNumeroConta());
        System.out.println("CPF do Cliente: " + contaPoupanca.getCpfCliente());
        System.out.println("Saldo: R$" + contaPoupanca.getSaldo());

        System.out.println("\nInformações da Conta Especial:");
        System.out.println("Número da Conta: " + contaEspecial.getNumeroConta());
        System.out.println("CPF do Cliente: " + contaEspecial.getCpfCliente());
        System.out.println("Saldo: R$" + contaEspecial.getSaldo());
        System.out.println("Limite de Crédito: R$" + contaEspecial.getLimiteCredito());
    }
}