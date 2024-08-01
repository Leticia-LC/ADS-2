package ex;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		String nome;
		double altura;
		double peso, imc;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe nome: ");
		nome = leitura.next();
		
		System.out.println("Informe altura: ");
		altura = leitura.nextDouble();
		
		System.out.println("Informe peso: ");
		peso = leitura.nextFloat();
		
		imc = peso / (altura * altura);
		
		System.out.println("O IMC de " + nome + " é igual a: " + imc);
		
		leitura.close();

	}

}
