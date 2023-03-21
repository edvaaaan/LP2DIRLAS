
/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Edvan Monteiro de Oliveira Filho - 121210590
 */

import java.util.Scanner;

public class wally {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String nomes = sc.nextLine();
            if (nomes.equals("wally")) {
                break;
            }

            String[] listaNomes = nomes.split(" ");
            int contador = 0;
            String tela = null;

            for (int i = 0; i < listaNomes.length; i++) {
                contador = 0;
                for (int j = 0; j < listaNomes[i].length(); j++) {
                    contador += 1;
                }

                if (contador == 5) {
                    tela = listaNomes[i];
                }
            }

            if (tela == null) {
                System.out.printf("?%n");
            } else {
                System.out.printf("%s%n", tela);
            }
        }

        sc.close();
    }

}