package Exercício4;

public enum Bonificacao {
    GERENTE (1.3),
    DIRETOR (1.2);

    private final double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
