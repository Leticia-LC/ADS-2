package ex;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
        double num1, num2, num3, maior;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		num1 = leitura.nextDouble();
		
		System.out.println("Informe o segundo número: ");
		num2 = leitura.nextDouble();
		
		System.out.println("Informe o terceiro número: ");
		num3 = leitura.nextDouble();
		
		maior = num1;
			
		if(maior < num1) {
			maior = num1;
			
		}
		
		if(maior < num2) {
			maior = num2;
			
		}
		
		if(maior < num3) {
			maior = num3;
		}
		
		System.out.println("O maior número digitado foi: " + maior);
		
		leitura.close();

	}

}
