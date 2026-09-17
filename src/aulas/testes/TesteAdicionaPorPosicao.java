package aulas.testes;

import aulas.listas.Aluno;
import aulas.listas.VetorLista;

public class TesteAdicionaPorPosicao {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");
        a3.setNome("Ana");

        VetorLista<Aluno> lista = new VetorLista<>();

        lista.adiciona(a1);
        lista.adiciona(a2, 0);
        lista.adiciona(a3, 1);

        System.out.println(lista);
    }
}
