package aula2;

public interface ListaAPI {
    public void adiciona(Aluno aluno);
    public void adiciona(Aluno aluno, int pos);
    public Aluno pega(int pos);
    public Aluno remove(int pos);
    public boolean contem(Aluno aluno);
    public int tamanho();
}
