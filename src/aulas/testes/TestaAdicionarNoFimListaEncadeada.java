package aulas.testes;

import aulas.listas.ListaEncadeadaDupla;

public class TestaAdicionarNoFimListaEncadeada {

    public static void main(String[] args) {
        ListaEncadeadaDupla<String> lista = new ListaEncadeadaDupla<>();

        lista.adiciona("Rafael");
        lista.adiciona("Paulo");

        System.out.println(lista);
    }
}
