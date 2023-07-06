package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0) {
			System.out.println("Parabéns, você foi Aprovado!");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Infelizmente você ficou de Recuperação!");
		}
		
		if(media < 4.5 && media >= 0) {
			System.out.println("Não foi dessa vez que você passou, você foi Reprovado!");
		}
			
		entrada.close();
	}
}
