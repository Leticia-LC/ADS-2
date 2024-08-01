package ex;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
        int num, num2, resultado = 0;
        String op;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		num = leitura.nextInt();
		
		System.out.println("Informe um valor: ");
		num2 = leitura.nextInt();
		
		System.out.println("Qual operação deseja realizar?");
		op = leitura.next();
		
		switch(op) {
		case "+":
			resultado = num + num2;
			break;
		case "-":
			resultado = num - num2;
			break;
		case "*":
			resultado = num * num2;
			break;
		case "/":
			resultado = num / num2;
			break;
		default:
			System.out.println("Operação inválida!");
		}
		
		System.out.println("O resultado da operação é igual a: " + resultado);
		
		leitura.close();

	}

}
