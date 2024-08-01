package ex;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		String situacao = "Aprovado";

		Scanner leitura = new Scanner(System.in);
		
		if(situacao == "Aprovado") {
			System.out.println("Aprovado");
			
		} else {
			System.out.println("Reprovado");
		}
		
		leitura.close();


	}

}
