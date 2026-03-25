

public class Main {


    public static void main(String[] args) {
        System.out.print("Insira o nome do titular : ");
        Conta conta = new Conta(GerenciadorScanner.getScanner().nextLine());
        realizarDeposito(conta);
        System.out.println(conta.getSaldo());
        realizarSaque(conta);
        System.out.println(conta.getSaldo());
    }


    // ---MÉTODOS-AUXILIARES---

    public static double receberValor(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return GerenciadorScanner.getScanner().nextDouble();
            } catch (Exception e) {
                System.out.println("Erro, por favor digite um número válido. ");
                GerenciadorScanner.getScanner().nextLine();

            }
        }
    }

    public static void realizarDeposito(Conta conta) {


        while (true) {
            double valorDigitadoDeposito = receberValor("Insira um valor para realizar o deposito : ");
            if (valorDigitadoDeposito > 0) {
                System.out.println("Deposito feito com sucesso. ");
                conta.depositar(valorDigitadoDeposito);
                break;
            }
            System.out.println("Número invalido, o deposito deve ser maior que 0. ");
        }
    }

    public static void realizarSaque(Conta conta) {
        if (conta.getSaldo() <= 0) {
            System.out.println("Saldo insuficiente para um saque, faça um deposito antes");
            return;
        }
        while (true) {
            double valorDigitadoSaque = receberValor("Insira um valor para realizar o saque : ");
            if (conta.sacar(valorDigitadoSaque)) {
                System.out.println("Saque feito com sucesso. ");
                conta.sacar(valorDigitadoSaque);
                break;
            }
            System.out.println("Número invalido, o saque deve ser maior que 0 ou igual ao saldo da conta. ");

        }
    }
}
