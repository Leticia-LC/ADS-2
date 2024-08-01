package ex;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		int num, num2;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		num = leitura.nextInt();
		
		System.out.println("Informe um valor: ");
		num2 = leitura.nextInt();
		
		num += num2;
		
		System.out.println("A soma dos numeros é igual a: " + num);
		
		leitura.close();
		
	}

}
