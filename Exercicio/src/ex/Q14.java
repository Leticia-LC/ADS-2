package ex;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int idade;
		
		System.out.println("informe idade: ");
		idade = leitura.nextInt();
		
		if(idade >= 16) {
			System.out.println("Pode votar");
			
		} else {
			System.out.println("Não pode votar");
			
		}
		
		leitura.close();

	}

}
