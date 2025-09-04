package Exercicio3;

public class Motoboy extends Funcionario{
    private String carteiraDeHabilitacao;

    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao(){
        return carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "carteiraDeHabilitacao='" + carteiraDeHabilitacao + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo.getTexto() +
                ", setor=" + setor.getTexto() +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + this.getSalairoFinal() +
                '}';
    }

    @Override
    public double getSalairoFinal() {
        return super.salarioBase;
    }
}
