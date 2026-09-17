package aulas.listas;

public class VetorLista<T> implements ListaAPI<T> {
    private T[] elementos = (T[]) new Object[100];
    private int total = 0;

    @Override
    public void adiciona(T elemento) {
        this.elementos[this.total] = elemento;
        this.total++;
    }

    @Override
    public void adiciona(T elemento, int pos) {
        if (pos<0 || pos>total) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = this.total - 1; i >= pos; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[pos] = elemento;
        this.total++;
    }

    @Override
    public T pega(int pos) {
        if (pos < 0 || pos >= total){
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[pos];
    }

    @Override
    public T remove(int pos) {
        if (pos < 0 || pos >= this.total) {
            throw new IllegalArgumentException("Posição inválida");
        }

        T elementoRemovido = this.elementos[pos];

        for (int i = pos; i < this.total - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.total--;

        return elementoRemovido;
    }

    @Override
    public boolean contem(T elemento) {
        for (int i = 0; i < this.total; i++) {
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int tamanho() {
        return this.total;
    }
}