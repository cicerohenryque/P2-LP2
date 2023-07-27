/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Cicero Henryque Pereira Rocha - 120111082
 */

import java.util.Scanner;

public class Wally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome[] = sc.nextLine();
        String ultimonome = "";

        while (nome[0] != "wally") {
            for (int i = 0; i < nome.length; i++) {
                if (nome[i].length() == 5) {
                    ultimonome = nome[i];
                } else if (nome[i].length() < 5 || nome[i].length() > 5){
                    System.out.println("?");
                }
            }
            System.out.println(ultimonome);

        }
    }
}