/* 5) Fazer um programa para ler um número inteiro e dizer se o mesmo é par ou ímpar. */

import java.util.Scanner;

public class FifthQuest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1;
		System.out.println("Digite um número: ");
		n1 = scan.nextInt();
		
		if(n1 % 2 == 0) {
			System.out.println("O número é par!");
		}else if(n1 % 2 == 1) {
			System.out.println("O número é ímpar!");
		}

	}

}
