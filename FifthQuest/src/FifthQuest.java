/* 5) Fazer um programa para ler um n�mero inteiro e dizer se o mesmo � par ou �mpar. */

import java.util.Scanner;

public class FifthQuest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1;
		System.out.println("Digite um n�mero: ");
		n1 = scan.nextInt();
		
		if(n1 % 2 == 0) {
			System.out.println("O n�mero � par!");
		}else if(n1 % 2 == 1) {
			System.out.println("O n�mero � �mpar!");
		}

	}

}
