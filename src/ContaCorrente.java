public class ContaCorrente extends Conta{

    public ContaCorrente(String titular ){
        super(titular);
    }

    @Override
    public boolean sacar(double valor){
        double valorComTaxa = valor + 0.02;

        return super.sacar(valorComTaxa);
    }
}

