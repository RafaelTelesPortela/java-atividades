/* 6) Fazer um programa para ler dois números reais e depois imprimi-los em ordem  crescente na tela. */

import java.util.Scanner;

public class SixthQuest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float n1, n2;
		
		System.out.println("Digite o primeiro número: ");
		n1 = scan.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		n2 = scan.nextFloat();
		
		System.out.println("Em ordem crescente:");
		
		if(n1 < n2) {
			System.out.println(n1 + "\n" + n2);
		}else {
			System.out.println(n2 + "\n" + n1);
		}

	}

}
