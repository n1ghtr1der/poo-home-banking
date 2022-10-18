package homeBanking.models;

public class ContaBancaria {
    private int numeroDaConta;
    private Cliente titular;
    private double saldo;

    public ContaBancaria(int numeroDaConta, Cliente titular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBancaria(int numeroDaConta, Cliente titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saque(double valorSaque) {
        if (valorSaque < this.saldo) {
            this.saldo -= (valorSaque + 10);
        }
    }

    public void deposito(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    @Override
    public String toString() {
        return "\nConta bancária \nNúmero: " + numeroDaConta + " \nTitular: " + titular + " \nSaldo " + saldo;
    }
}
