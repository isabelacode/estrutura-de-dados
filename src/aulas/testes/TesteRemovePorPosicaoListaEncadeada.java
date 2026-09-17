package aulas.testes;

import aulas.listas.ListaEncadeada;

public class TesteRemovePorPosicaoListaEncadeada {

    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        lista.adiciona("Camila");

        lista.remove(1);

        System.out.println(lista);
    }
}
