package ContaBancaria;

public class ContaBancaria {
    @SuppressWarnings("unused")
    private String numeroConta;
    private double saldo;
    @SuppressWarnings("unused")
    private Pessoa titular;

    public ContaBancaria(String numeroConta, double saldoInicial, Pessoa titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar a operação.");
        } else if (valor > 5000) {
            System.out.println("Valor do saque acima do permitido.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
