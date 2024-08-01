package ex;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		int raio;
		double area;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe o raio do círculo em centímetros: ");
		raio = leitura.nextInt();
		
		area = (raio * raio) * 3.1415;
		
		System.out.println("A área do círculo é igual a: " + area);
		
		leitura.close();
		

	}

}
