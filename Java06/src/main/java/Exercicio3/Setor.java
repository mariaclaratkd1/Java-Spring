package Exercicio3;

public enum Setor {
    RECURSOS_HUMANOS ("Recursos_Humanos"),
    FINANCEIRO ("Financeiro"),
    OPERACOES ("Operacoes");

    private String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
