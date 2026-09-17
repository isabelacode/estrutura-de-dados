package aula2;

public class ListaEncadeada implements ListaAPI {
    private Celula primeira;
    private Celula ultima;
    private int totalDeElementos;

    @Override
    public void adiciona(Aluno aluno) {

    }

    @Override
    public void adiciona(Aluno aluno, int pos) {

    }

    @Override
    public Aluno pega(int pos) {
        return null;
    }

    @Override
    public Aluno remove(int pos) {
        return null;
    }

    @Override
    public boolean contem(Aluno aluno) {
        return false;
    }

    @Override
    public int tamanho() {
        return 0;
    }
    public String toString(){
        StringBuilder saida = new StringBuilder();
        saida.append("[");
        Celula atual = primeira;
        for (int i = 0; i<totalDeElementos; i++){
            saida.append(atual.getElemento().toString());
        }

        return saida +"]";
    }
}
