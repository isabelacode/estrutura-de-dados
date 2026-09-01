package aula2.testes;

import aula2.Aluno;
import aula2.VetorLista;

public class TesteRemovePorPosicao {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");

        VetorLista lista = new VetorLista();

        lista.adiciona(a1);
        lista.adiciona(a2);

        lista.remove(0);

        System.out.println(lista);
    }
}