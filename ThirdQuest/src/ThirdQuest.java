/* 3) Fazer um programa para ler os valores de quatro n�meros N1, N2, N3 e N4. Calcule e imprima o valor da m�dia aritm�tica dos mesmos. */ 

import java.util.Scanner;

public class ThirdQuest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		float n1 = scan.nextFloat();
		
		System.out.println("Digite o segundo n�mero: ");
		float n2 = scan.nextFloat();
		
		System.out.println("Digite o terceiro n�mero: ");
		float n3 = scan.nextFloat();
		
		System.out.println("Digite o quarto n�mero: ");
		float n4 = scan.nextFloat();
		
		float media = ((n1+n2+n3+n4)/4);
		System.out.println("A m�dia aritim�tica da soma dos n�meros �: " + media);
		
		
	}

}
