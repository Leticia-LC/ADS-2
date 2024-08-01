package ex;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		int num, cont = 0;
		double divisao;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		num = leitura.nextInt();
		
		for(int i = 2; i < (num / 2); i++) {
			divisao = num / i;
			if((divisao % i) == 0) {
				cont++;
			}
		}
		
		if(cont == 0) {
			System.out.println("Número primo!");
			
		} else {
			System.out.println("número não é primo!");
			
		}
		
		leitura.close();

	}

}
