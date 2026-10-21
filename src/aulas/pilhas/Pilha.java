package aulas.pilhas;

import aulas.listas.ListaAPI;
import aulas.listas.VetorLista;

public class Pilha implements PilhaAPI{
    private ListaAPI elementos = new VetorLista();

    @Override
    public void inserir(Object elem) {
        elementos.adiciona(elem);
    }

    @Override
    public boolean estaVAzia() {
        return elementos.tamanho()==0;
    }

    @Override
    public Object remover() {
        if(estaVAzia()){
            throw new IllegalArgumentException("Pilha vazia");
        }
        return elementos.remove(elementos.tamanho()-1);
    }
}
