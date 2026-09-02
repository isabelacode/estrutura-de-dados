package aula2;

public class VetorLista {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno) {
        this.alunos[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;
    }

    public void adiciona(int posicao, Aluno aluno) {
        if (posicao<0 || posicao>totalDeAlunos) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = this.totalDeAlunos - 1; i >= posicao; i--) {
            this.alunos[i + 1] = this.alunos[i];
        }

        this.alunos[posicao] = aluno;
        this.totalDeAlunos++;
    }

    public Aluno pega(int posicao) {
        if (posicao < 0 && posicao >= this.totalDeAlunos) {
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.alunos[posicao];
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.totalDeAlunos; i++) {
            if (this.alunos[i].equals(aluno)) {
                return true;
            }
        }
        return false;
    }

    public void remove(int posicao) {
        if (posicao < 0 && posicao >= this.totalDeAlunos) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.totalDeAlunos - 1; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }

        this.totalDeAlunos--;
    }

    public int tamanho() {
        return this.totalDeAlunos;
    }

    @Override
    public String toString() {
        if (this.totalDeAlunos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();

        builder.append("[");

        for (int i = 0; i < this.totalDeAlunos - 1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");
        }

        builder.append(this.alunos[this.totalDeAlunos - 1]);
        builder.append("]");

        return builder.toString();
    }
}