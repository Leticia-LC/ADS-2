package ex;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		Float salario;
		int aumento;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe o salário: ");
		salario = leitura.nextFloat();
		
		if(salario >= 1500) {
			aumento = (int) (salario + (salario * 0.15));
			
		} else {
			aumento = (int) (salario + (salario * 0.10));
			
		}
		
		System.out.println("o novo salário será de: R$" + aumento);
		
		leitura.close();

	}

}
