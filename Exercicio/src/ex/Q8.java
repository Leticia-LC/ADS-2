package ex;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		String nome;
		int idade;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		nome = leitura.next();
		
		System.out.println("Informe a idade: ");
		idade = leitura.nextInt();
		
		if(idade >= 65) {
			System.out.println( nome + " pode se aposentar!");
			
		} else {
			System.out.println(nome + " não pode se aposentar!");
			
		}
		
		leitura.close();

	}

}
