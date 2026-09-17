package aulas.aula1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] recordes = {50, 20, 80, 10, 40, 70, 30, 90, 60, 100};
        int quantidade = 10;
        int acao;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Entrar recorde");
            System.out.println("2 - Ver todos os recordes");
            System.out.println("3 - Ordenar por score");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            acao = sc.nextInt();
            switch (acao) {
                case 1:
                    System.out.print("Digite o novo recorde: ");
                    int novoRecorde = sc.nextInt();
                    if (quantidade == recordes.length) {
                        for (int i = 0; i < recordes.length - 1; i++) {
                            recordes[i] = recordes[i + 1];
                        }

                        recordes[recordes.length - 1] = novoRecorde;
                    } else {
                        recordes[quantidade] = novoRecorde;
                        quantidade++;
                    }
                    System.out.println("Recorde inserido!");
                    break;
                case 2:
                    System.out.println("\n--- RECORDES ---");
                    for (int i = 0; i < quantidade; i++) {
                        System.out.println((i + 1) + "º: " + recordes[i]);
                    }
                    break;

                case 3:
                    for (int i = 0; i < recordes.length - 1; i++) {
                        int menor = i;
                        for (int j = i + 1; j < recordes.length; j++) {
                            if (recordes[j] < recordes[menor]) {
                                menor = j;
                            }
                        }
                        int temp = recordes[i];
                        recordes[i] = recordes[menor];
                        recordes[menor] = temp;
                    }
                    System.out.println("Recordes ordenados!");
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (acao != 4);
        sc.close();
    }
}