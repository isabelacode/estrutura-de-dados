package aulas.aula1;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int c = 0; c < casos; c++) {
            int n = sc.nextInt();

            double soma = 0;
            ArrayList<Integer> notas = new ArrayList<Integer>();

            for (int i = 0; i < n; i++) {
                int nota = sc.nextInt();
                notas.add(nota);
                soma += nota;
            }

            double media = soma / n;
            int qtd = 0;

            for (Integer nota : notas) {
                if (nota > media) {
                    qtd++;
                }
            }

            BigDecimal porcentagem = BigDecimal.valueOf(qtd)
                    .multiply(BigDecimal.valueOf(100))
                    .divide(BigDecimal.valueOf(n), 3, RoundingMode.HALF_EVEN);

            System.out.println(porcentagem.toPlainString() + "%");
        }

        sc.close();
    }
}