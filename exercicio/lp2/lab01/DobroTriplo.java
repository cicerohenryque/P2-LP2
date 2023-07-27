/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Cicero Henryque Pereira Rocha - 120111082
 */

import java.util.Scanner;

public class DobroTriplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
	int numero;
        int dobro, triplo;

        numero = sc.nextInt();

        dobro = 2 * numero;
        triplo = 3 * numero;

        System.out.printf("dobro: %d, triplo: %d\n", dobro, triplo);

        sc.close();
    }
}
