package aulas.aula1;

import java.util.Scanner;

public class Exercicio1 {
    static void main(String[] args) {
        int[] A = new int[5];
        int[] B = new int[5];

        Scanner scan = new Scanner(System.in);
        System.out.println("A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor da posição "+ i+":");
            A[i] = scan.nextInt();
        }
        System.out.println("B:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor da posição "+ i+":");
            B[i] = scan.nextInt();
        }

        int prodEscalar = calculaProdEscalar(A,B);
        System.out.println(prodEscalar);
    }
    public static int calculaProdEscalar(int[]v1, int[]v2){
        int soma = 0;
        for (int i = 0; i < v1.length; i++) {
            soma+=v1[i]*v2[i];
        }
        return soma;
    }
}
