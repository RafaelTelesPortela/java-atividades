/* 2) Fazer um programa para ler duas medidas de um ret�ngulo. O programa deve mostrar o per�metro e a �rea do ret�ngulo a partir das medidas recebidas. */

import java.util.Scanner;

public class SecondQuest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
			double b = scan.nextDouble();
		System.out.println("Digite o valor da altura: ");
			double a = scan.nextDouble();
		
			double perimetro = (2*(b + a));
		System.out.println("O valor do perimetro �: "+ perimetro);
		
			double area = (b*a);
		System.out.println("O valor da area �: "+ area);
		
	}

}
