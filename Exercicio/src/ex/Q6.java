package ex;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
        int idade;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe idade: ");
		idade = leitura.nextInt();
		
		if(idade < 18) {
			System.out.println("Menor de idade");
			
		} else {
			System.out.println("Maior de idade");
			
		}
		
		leitura.close();

	}

}
