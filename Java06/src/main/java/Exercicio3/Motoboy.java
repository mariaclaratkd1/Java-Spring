package Exercicio3;

public class Motoboy extends Funcionario{
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao){
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
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
