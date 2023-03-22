
/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Edvan Monteiro de Oliveira Filho - 121210590
 */

import java.util.Scanner;

public class Alunos {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[1001];
        int contador = 0;

        while (true) {
            String entrada = sc.nextLine();
            if (entrada.equals("-")) {
                break;
            } else {
                String[] numero = entrada.split(" ");
                valores[contador] = Integer.parseInt(numero[1]);
                contador += 1;
            }
        }

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int numalunosacima = 0;
        int numalunosabaixo = 0;
        int media = 0;

        for (int i = 0; i < contador; i++) {

            if (valores[i] > maior) {
                maior = valores[i];
            }

            if (menor > valores[i]) {
                menor = valores[i];
            }

            if (valores[i] >= 700) {
                numalunosacima += 1;
            }

            if (valores[i] < 700) {
                numalunosabaixo += 1;
            }

            media += valores[i];

        }

        media = (int) media / contador;

        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + media);
        System.out.println("acima: " + numalunosacima);
        System.out.println("abaixo: " + numalunosabaixo);

    }
}