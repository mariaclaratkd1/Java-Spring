package Exercicio;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Gato gato1 = new Gato();
        Galo galo1 = new Galo();
        Pato pato1 = new Pato();

        System.out.println(cachorro1.emitirSom());
        System.out.println(cachorro1.comer());

        System.out.println(gato1.emitirSom());
        System.out.println(gato1.comer());

        System.out.println(galo1.emitirSom());
        System.out.println(galo1.comer());

        System.out.println(pato1.emitirSom());
        System.out.println(pato1.comer());
    }
}
