package ex;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
        int num;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		num = leitura.nextInt();
		
		if(num < 0) {
			System.out.println("Número negativo");
			
		} else if(num > 0) {
			System.out.println("Número positivo");
			
		} else {
			System.out.println("Número igual a zero");
		}
		
		leitura.close();

	}

}
