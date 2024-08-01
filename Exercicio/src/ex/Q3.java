package ex;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		double num1, num2, num3, media;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		num1 = leitura.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		num2 = leitura.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		num3 = leitura.nextDouble();
		
		media = (num1 + num2 + num3)/3;
		
		System.out.println("Média igual a: "+ media);
		
		leitura.close();

	}

}
