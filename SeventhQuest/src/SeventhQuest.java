/* 7) Fazer um programa para ler um valor num�rico qualquer x e dois valores a e b tais que  a < b, teste se x est� no intervalo fechado [a,b]. */

import java.util.Scanner;

public class SeventhQuest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x, a, b;
		
		System.out.println("Informe o valor de A: ");
		a = scan.nextInt();
		
		System.out.println("Informe o valor de B: ");
		b = scan.nextInt();
		
		System.out.println("Informe o valor de X: ");
		x = scan.nextInt();
		
		if (x < b && x > a) {
			System.out.println("O valor de X est� entre A e B ");
		}else if(a < b) {
			System.out.println("A � menor que B ");
		}
	}	
}
			

