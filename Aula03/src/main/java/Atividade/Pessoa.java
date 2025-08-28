package Atividade;
import org.example.Setor;
import org.example.Sexo;

public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private String telefone;
    private String email;
    private Endereco endereco;
    private Sexo1 sexo1;

    public Pessoa(int id, String nome, int idade, String telefone, String email, Endereco endereco, Sexo1 sexo1) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.sexo1 = sexo1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Sexo1 getSexo1() {
        return sexo1;
    }

    public void setSexo1(Sexo1 sexo1) {
        this.sexo1 = sexo1;
    }
}
