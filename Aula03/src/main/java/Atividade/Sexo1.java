package Atividade;

public enum Sexo1 {
    MASCULINO ("Masculino", 'M'),
    FEMININO ("Feminino", 'F');

    private String texto;
    private char caractere;

    Sexo1(String texto, char caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }

    public String getTexto() {
        return texto;
    }

    public char getCaractere() {
        return caractere;
    }

}
