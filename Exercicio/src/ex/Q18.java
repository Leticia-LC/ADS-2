package ex;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		int num;
		
        Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		num = leitura.nextInt();
		
		if(Epalindromo(num))
			System.out.println("O número informado é um palíndromo");
		else
			System.out.println("O número informado não é um palíndromo");
		
		leitura.close();

	}
	
	public static boolean Epalindromo(int pNum) {
		String pTexto = Integer.toString(pNum);
		
		for(int i = 0; i< (pTexto.length() / 2) ; i++)
			if(pTexto.charAt(i) == pTexto.charAt((pTexto.length() - 1) - i))
				return false;
				
		return true;
		
	}

}
