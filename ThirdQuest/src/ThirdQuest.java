/* 3) Fazer um programa para ler os valores de quatro números N1, N2, N3 e N4. Calcule e imprima o valor da média aritmética dos mesmos. */ 

import java.util.Scanner;

public class ThirdQuest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		float n1 = scan.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		float n2 = scan.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		float n3 = scan.nextFloat();
		
		System.out.println("Digite o quarto número: ");
		float n4 = scan.nextFloat();
		
		float media = ((n1+n2+n3+n4)/4);
		System.out.println("A média aritimética da soma dos números é: " + media);
		
		
	}

}
