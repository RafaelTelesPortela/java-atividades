/* 4) Fazer um programa para ler os valores de quatro n�meros N1, N2, N3 e N4. Calcule e imprima o valor da m�dia aritm�tica dos mesmos. Imprimir tamb�m uma mensagem
      de "aprovado" ou "reprovado" no caso da m�dia ser maior ou igual a seis, ou menor, respectivamente.                                                            */


import java.util.Scanner;

public class FourthQuest {

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
		System.out.println("A soma das quatro notas foi: " + media);
		
		if(media >= 6) {
			System.out.println("Voc� est� aprovado!");
		} else{
			System.out.println("Voc� est� reprovado!");
		}
	}

}