/* 4) Fazer um programa para ler os valores de quatro números N1, N2, N3 e N4. Calcule e imprima o valor da média aritmética dos mesmos. Imprimir também uma mensagem
      de "aprovado" ou "reprovado" no caso da média ser maior ou igual a seis, ou menor, respectivamente.                                                            */


import java.util.Scanner;

public class FourthQuest {

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
		System.out.println("A soma das quatro notas foi: " + media);
		
		if(media >= 6) {
			System.out.println("Você está aprovado!");
		} else{
			System.out.println("Você está reprovado!");
		}
	}

}