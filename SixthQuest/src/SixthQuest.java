/* 6) Fazer um programa para ler dois n�meros reais e depois imprimi-los em ordem  crescente na tela. */

import java.util.Scanner;

public class SixthQuest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float n1, n2;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = scan.nextFloat();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = scan.nextFloat();
		
		System.out.println("Em ordem crescente:");
		
		if(n1 < n2) {
			System.out.println(n1 + "\n" + n2);
		}else {
			System.out.println(n2 + "\n" + n1);
		}

	}

}
