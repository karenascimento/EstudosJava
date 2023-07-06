package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7: ");
		
		double dia = entrada.nextDouble();
		
		if(dia == 1) {
			System.out.println("O dia digitado é domingo!");
		} else if(dia == 2) {
			System.out.println("O dia digitado é segunda-feira!");
		} else if(dia == 3) {
			System.out.println("O dia digitado é terça-feira!");
		} else if(dia == 4) {
			System.out.println("O dia digitado é quarta-feira!");
		} else if(dia == 5) {
			System.out.println("O dia digitado é quinta-feira!");
		} else if(dia == 6) {
			System.out.println("O dia digitado é sexta-feira!");
		} else {
			System.out.println("O dia digitado é sábado!");
		}
		
		entrada.close();
	}
}
