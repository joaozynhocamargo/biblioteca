package leitor;

public class Leitor {
    private String nome;
    private int idade;
    private String numeroIdentificacao;

    public Leitor(String nome, int idade, String numeroIdentificacao) {
        this.nome = nome;
        this.idade = idade;
        this.numeroIdentificacao = numeroIdentificacao;
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

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }
}