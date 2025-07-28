package exceptions;
public class Ex14ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) throws Ex14SaldoInsuficienteException {
        // TODO: lançar exceção se saldo < valor
    }
}