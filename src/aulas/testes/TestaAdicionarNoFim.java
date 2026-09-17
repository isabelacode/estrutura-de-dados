package aulas.testes;

import aulas.listas.Aluno;
import aulas.listas.VetorLista;

public class TestaAdicionarNoFim {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("João");
        a2.setNome("José");

        VetorLista<Aluno> lista = new VetorLista<>();

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista);
    }
}
