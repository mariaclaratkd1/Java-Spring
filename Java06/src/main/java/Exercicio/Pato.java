package Exercicio;

public class Pato implements Animal{
    @Override
    public String emitirSom() {
        return "Grasnar";
    }

    @Override
    public String comer() {
        return "Mato";
    }
}
