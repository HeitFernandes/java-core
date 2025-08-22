package Begginer.Desafio1;

public class Ninja {

    private String nome;
    private short idade;
    private String missao;
    private String dificuldade;

    public Ninja() {
    }

    public Ninja(String nome, short idade, String missao, String dificuldade) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.dificuldade = dificuldade;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Missao: " + getMissao());
        System.out.println("Dificuldade: " + getDificuldade());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    @Override
    public String toString() {
        return "nome: " + getNome() + ", Idade: " + getIdade() + ", Missao: " + getMissao() + ", Dificuldade: " + dificuldade;
    }
}
