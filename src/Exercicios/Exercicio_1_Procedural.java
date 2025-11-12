package Exercicios;
import java.util.Scanner;

public class Exercicio_1_Procedural {
	// Procedural: código organizado em passos sequenciais, como em Python

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Passo 1: Ler as três notas do aluno
		System.out.print("Digite a primeira nota: ");
		double n1 = teclado.nextDouble(); // Captura a nota do aluno para calcular a média posteriormente
		System.out.print("Digite a segunda nota: ");
		double n2 = teclado.nextDouble();
		System.out.print("Digite a terceria nota: ");
		double n3 = teclado.nextDouble();
		
		// Passo 2: Calcular a média das notas
		// double: tipo de dado para números com casas decimais	
		double media = (n1 + n2 + n3) / 3;
		
		// Passo 3: Exibir resultado
		System.out.println("Média = " + media);

		// Fechar o scanner para liberar recursos
		teclado.close();

	}

}
