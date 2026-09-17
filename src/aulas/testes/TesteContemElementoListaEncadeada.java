package aulas.testes;

import aulas.listas.ListaEncadeada;

public class TesteContemElementoListaEncadeada {

    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("Rafael");
        lista.adiciona("Paulo");

        System.out.println(lista.contem("Rafael"));
        System.out.println(lista.contem("Camila"));
    }
}
