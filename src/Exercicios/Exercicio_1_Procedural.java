package Exercicios;
import java.util.Scanner;

public class Exercicio_1_Procedural { // Procedural: código organizado em passos sequenciais, como em Python

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		double n1 = teclado.nextDouble(); // Captura a nota do aluno para calcular a média posteriormente
		System.out.print("Digite a segunda nota: ");
		double n2 = teclado.nextDouble();
		System.out.print("Digite a terceria nota: ");
		double n3 = teclado.nextDouble();
		
		// double armazena números com casas decimais
		
		double media = (n1 + n2 + n3) / 3;
		System.out.println("Média = " + media);
		
		teclado.close();
		// TODO Auto-generated method stub

	}

}
