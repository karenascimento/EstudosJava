package fundamentos;

import java.util.Scanner;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(1));
		
		String s = "Boa tarde";
		s = "Bom dia".toUpperCase();
		System.out.println(s.concat("!!!!"));
		System.out.println(s.startsWith("bom"));
		System.out.println(s.toLowerCase());
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		/*var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 20;
		var salario = 2500.45;
		
		System.out.printf("O funcionário %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		//System.out.println("\n\nNome = " + nome + " " + sobrenome + " " + "Sua idade é: " + idade);
		
		System.out.printf("%s %s tem %d anos. %n", nome, sobrenome, idade);
		
		entrada.close();
	}
}
