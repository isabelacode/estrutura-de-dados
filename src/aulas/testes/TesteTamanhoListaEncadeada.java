package aulas.testes;

import aulas.listas.ListaEncadeada;

public class TesteTamanhoListaEncadeada {

    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("Rafael");
        lista.adiciona("Paulo");

        System.out.println(lista.tamanho());

        lista.adiciona("Camila");

        System.out.println(lista.tamanho());
    }
}
