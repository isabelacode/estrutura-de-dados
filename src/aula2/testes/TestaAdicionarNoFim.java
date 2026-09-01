package aula2.testes;

import aula2.Aluno;
import aula2.VetorLista;

public class TestaAdicionarNoFim {
    static void main() {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        a1.setNome("João");
        a2.setNome("José");
        VetorLista lista = new VetorLista();
        lista.adiciona(a1);
        lista.adiciona(a2);
        System.out.println(lista);
    }
}
