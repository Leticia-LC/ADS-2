package ex;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		int num;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		num = leitura.nextInt();
		
		if(num % 3 == 0) {
			System.out.println("Múltipo de três");
			
		}
		
		if(num % 5 == 0) {
			System.out.println("Múltiplo de cinco");
			
		}
		
		leitura.close();
	}

}
