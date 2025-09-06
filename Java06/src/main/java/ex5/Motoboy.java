package ex5;

public class Motoboy extends Funcionario{
    private String placaDeMoto;

    public Motoboy(String nome, String cpf, String dataNascimento, double salarioBase, String dataAdmissao, Sexo sexo, String placaDeMoto) {
        super(nome, cpf, dataNascimento, salarioBase, dataAdmissao, sexo);
        this.placaDeMoto = placaDeMoto;
    }

    public String getPlacaDeMoto() {
        return placaDeMoto;
    }

    public void setPlacaDeMoto(String placaDeMoto) {
        this.placaDeMoto = placaDeMoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placaDeMoto='" + placaDeMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioFinal=" + this.getSalarioFinal() +
                '}';
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }
}
