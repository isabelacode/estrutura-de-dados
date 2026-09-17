package aulas.listas;

import java.util.Objects;

public class Aluno {
    private String nome;
    private Integer pontuacao;

    public Aluno() {
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, Integer pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(nome, aluno.nome) && Objects.equals(pontuacao, aluno.pontuacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, pontuacao);
    }

    @Override
    public String toString() {
        return nome;
    }
}
