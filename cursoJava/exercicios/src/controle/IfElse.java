package controle;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		double number = entrada.nextDouble();
		
		if(number % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
	}
}
