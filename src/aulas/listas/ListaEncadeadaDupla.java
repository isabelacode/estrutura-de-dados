package aulas.listas;

import java.util.Objects;

public class ListaEncadeadaDupla<T> implements ListaAPI<T> {

    private Celula<T> primeira;
    private Celula<T> ultima;
    private int total = 0;

    @Override
    public void adiciona(T elemento) {
        Celula<T> nova = new Celula<>(elemento);

        if (total == 0) {
            primeira = nova;
            ultima = nova;
        } else {
            nova.setAnterior(ultima);
            ultima.setProxima(nova);
            ultima = nova;
        }

        total++;
    }

    @Override
    public void adiciona(T elemento, int pos) {
        if (pos < 0 || pos > total) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        Celula<T> nova = new Celula<>(elemento);

        if (total == 0) {
            primeira = nova;
            ultima = nova;
        } else if (pos == 0) {
            nova.setProxima(primeira);
            primeira.setAnterior(nova);
            primeira = nova;
        } else if (pos == total) {
            nova.setAnterior(ultima);
            ultima.setProxima(nova);
            ultima = nova;
        } else {
            Celula<T> atual = primeira;

            for (int i = 0; i < pos; i++) {
                atual = atual.getProxima();
            }

            Celula<T> anterior = atual.getAnterior();

            nova.setAnterior(anterior);
            nova.setProxima(atual);

            anterior.setProxima(nova);
            atual.setAnterior(nova);
        }

        total++;
    }

    @Override
    public T pega(int pos) {
        if (pos < 0 || pos >= total) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        Celula<T> atual;

        if (pos < total / 2) {
            atual = primeira;

            for (int i = 0; i < pos; i++) {
                atual = atual.getProxima();
            }
        } else {
            atual = ultima;

            for (int i = total - 1; i > pos; i--) {
                atual = atual.getAnterior();
            }
        }

        return atual.getElemento();
    }

    @Override
    public T remove(int pos) {
        if (pos < 0 || pos >= total) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        Celula<T> removida;

        if (pos == 0) {
            removida = primeira;
            primeira = primeira.getProxima();

            if (primeira != null) {
                primeira.setAnterior(null);
            } else {
                ultima = null;
            }
        } else if (pos == total - 1) {
            removida = ultima;
            ultima = ultima.getAnterior();
            ultima.setProxima(null);
        } else {
            removida = primeira;

            for (int i = 0; i < pos; i++) {
                removida = removida.getProxima();
            }

            Celula<T> anterior = removida.getAnterior();
            Celula<T> proxima = removida.getProxima();

            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
        }

        total--;
        return removida.getElemento();
    }

    @Override
    public boolean contem(T elemento) {
        Celula<T> atual = primeira;

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
        return total;
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder("[");
        Celula<T> atual = primeira;

        while (atual != null) {
            saida.append(atual.getElemento());

            if (atual.getProxima() != null) {
                saida.append(", ");
            }

            atual = atual.getProxima();
        }

        saida.append("]");
        return saida.toString();
    }
}
