/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Cicero Henryque Pereira Rocha - 120111082
 */

import java.util.Scanner;

public class Funcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, n4;
        int cres = 0, decres = 0;

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();

        if (n1 < n2 && n2 < n3 && n3 < n4){
            cres += 1;
        }
        else if (n1 > n2 && n2 > n3 && n3 > n4){
            decres += 1;
        }

        if (cres > 0){
            System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
        }
        else if (decres > 0){
            System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
        }
        else{
            System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
        }
    }
}