/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Cicero Henryque Pereira Rocha - 120111082
 */

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
	float numero1;
        numero1 = sc.nextFloat();
	float numero2;
	numero2 = sc.nextFloat();
	float media;
	media = (numero1 + numero2) / 2;

	if (media >= 7) {
		System.out.printf("pass: True!");
	}
	else {
		System.out.printf("pass: False!");
	}
	sc.close();
    }
}
