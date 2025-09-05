package ex5;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Hugo", "80509563320", "11/11/1999", 1500, "15/05/2000", Sexo.MASCULINO);
        Motoboy motoboy = new Motoboy("Francisco", "91875633251", "12/10/1998", 600, "25/02/2024", Sexo.MASCULINO, "PJE568T56");
        Diretor diretor = new Diretor("Kauan", "50462059815", "22/03/1989", 2500, "23/06/2020", Sexo.MASCULINO, 30);

        System.out.println(gerente.toString());
        System.out.println(motoboy.toString());
        System.out.println(diretor.toString());
    }
}
