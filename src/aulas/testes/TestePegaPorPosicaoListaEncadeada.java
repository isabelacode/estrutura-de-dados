package aulas.testes;

import aulas.listas.ListaEncadeada;

public class TestePegaPorPosicaoListaEncadeada {

    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("Rafael");
        lista.adiciona("Paulo");

        System.out.println(lista.pega(0));
        System.out.println(lista.pega(1));
    }
}
