public class Conta {

    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }
    // ---MÉTODOS GETTERS

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // ---MÉTODOS DE UTILIDADE---

    public void depositar(double valor) {
        if (valor > 0) this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
