package aulas.testes;

import aulas.listas.Aluno;
import aulas.listas.VetorLista;

public class TesteContemAluno {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");

        VetorLista<Aluno> lista = new VetorLista<>();

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista.contem(a1));
        System.out.println(lista.contem(a2));

        Aluno aluno = new Aluno();
        aluno.setNome("Ana");

        System.out.println(lista.contem(aluno));
    }
}
