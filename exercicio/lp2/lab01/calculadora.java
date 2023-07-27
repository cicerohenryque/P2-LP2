/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Cicero Henryque Pereira Rocha - 120111082
 */

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operador = sc.nextLine();

        if (!operador.equals("+") && !operador.equals("-") && !operador.equals("*") && !operador.equals("/")) {
            System.out.println("ENTRADA INVALIDA");
        }
        else{

            float n1 = sc.nextFloat();
            float n2 = sc.nextFloat();

            if (operador.equals("+")) {
                float soma = n1 + n2;
                System.out.println("RESULTADO: " + soma);
            } else if (operador.equals("-")) {
                float dif = n1 - n2;
                System.out.println("RESULTADO: " + dif);
            } else if (operador.equals("*")) {
                float mult = n1 * n2;
                System.out.println("RESULTADO: " + mult);

            } else if (operador.equals("/")) {
                if (n2 == 0) {
                    System.out.println("ERRO");
                } else {
                    float div = n1 / n2;
                    System.out.println("RESULTADO: " + div);
                }
            }
        }
    }
}
