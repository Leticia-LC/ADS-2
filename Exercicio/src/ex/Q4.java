package ex;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
        int num;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		num = leitura.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Número par");
			
		} else {
			System.out.println("número ímpar");
		}
		
		leitura.close();
	}

}
