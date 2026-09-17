package aulas.listas;

import java.util.Objects;

public class ListaEncadeada<T> implements ListaAPI<T> {
    private Celula<T> primeira;
    private Celula<T> ultima;
    private int total = 0;

    @Override
    public void adiciona(T elemento) {
        Celula<T> nova = new Celula<>(elemento);
        if(this.total == 0){
            this.primeira = nova;
            this.ultima = nova;
        } else{
            this.ultima.setProxima(nova);
            ultima = nova;
        }
        total++;
    }

    @Override
    public void adiciona(T elemento, int pos) {
        if (pos < 0 || pos > this.total) {
            throw new IllegalArgumentException("Posição inválida");
        }

        if (pos == 0) {
            Celula<T> nova = new Celula<>(this.primeira, elemento);
            this.primeira = nova;
            if (this.total == 0) {
                this.ultima = nova;
            }
        } else {
            Celula<T> anterior = this.primeira;

            for (int i = 0; i < pos - 1; i++) {
                anterior = anterior.getProxima();
            }

            Celula<T> nova = new Celula<>(anterior.getProxima(), elemento);

            anterior.setProxima(nova);

            if (pos == this.total) {
                this.ultima = nova;
            }
        }

        this.total++;
    }

    @Override
    public T pega(int pos) {
        if (pos < 0 || pos >= this.total) {
            throw new IllegalArgumentException("Posição inválida");
        }

        Celula<T> atual = this.primeira;

        for (int i = 0; i < pos; i++) {
            atual = atual.getProxima();
        }

        return atual.getElemento();
    }

    @Override
    public T remove(int pos) {
        if (pos < 0 || pos >= this.total) {
            throw new IllegalArgumentException("Posição inválida");
        }

        T elementoRemovido;

        if (pos == 0) {
            elementoRemovido = this.primeira.getElemento();

            this.primeira = this.primeira.getProxima();
            this.total--;

            if (this.total == 0) {
                this.ultima = null;
            }

            return elementoRemovido;
        }

        Celula<T> anterior = this.primeira;

        for (int i = 0; i < pos - 1; i++) {
            anterior = anterior.getProxima();
        }

        Celula<T> removida = anterior.getProxima();

        elementoRemovido = removida.getElemento();

        anterior.setProxima(removida.getProxima());

        if (removida == this.ultima) {
            this.ultima = anterior;
        }

        this.total--;

        return elementoRemovido;
    }

    @Override
    public boolean contem(T elemento) {
        Celula<T> atual = this.primeira;
        while (atual != null) {
            if (Objects.equals(atual.getElemento(), elemento)) {
                return true;
            }
            atual = atual.getProxima();
        }

        return false;
    }

    @Override
    public int tamanho() {
        return this.total;
    }

    @Override
    public String toString() {

        StringBuilder resultado = new StringBuilder("[");
        Celula<T> atual = this.primeira;

        while (atual != null) {

            resultado.append(atual.getElemento());

            if (atual.getProxima() != null) {
                resultado.append(", ");
            }

            atual = atual.getProxima();
        }

        resultado.append("]");

        return resultado.toString();
    }
}
