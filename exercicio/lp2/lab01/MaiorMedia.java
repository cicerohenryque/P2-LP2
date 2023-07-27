/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Cicero Henryque Pereira Rocha - 120111082
 */
import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] maior = num.split(" ");
        int somador = 0;

        for (int i = 0; i < maior.length; i++) {
            somador += Integer.parseInt(maior[i]);
        }

        int media = somador / maior.length;
        String saida = "";

        for (int j = 0; j < maior.length; j++) {
            if (Integer.parseInt(maior[j]) > media) {
                saida += maior[j] + " ";
            }
        }
        System.out.println(saida.trim());
    }
}
