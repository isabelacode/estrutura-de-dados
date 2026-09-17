package aulas.testes;

import aulas.listas.ListaEncadeada;

public class TesteAdicionaPorPosicaoListaEncadeada {

    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("Rafael");
        lista.adiciona("Paulo", 0);
        lista.adiciona("Camila", 1);

        System.out.println(lista);
    }
}
