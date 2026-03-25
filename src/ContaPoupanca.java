public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular) {
        super(titular);
    }

    public void renderJuros(double taxaPercentual) {
        double juros = getSaldoFormatado().doubleValue() * taxaPercentual;
        this.depositar(juros);
    }
}
