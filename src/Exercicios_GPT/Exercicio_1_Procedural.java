package Exercicios_GPT;
import java.util.Scanner;

public class Exercicio_1_Procedural { // Precedural é como escrevemos no Python, por exemplo

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		double n1 = teclado.nextDouble(); // Ele vai ler o proximo valor digitado e guardar em N1
		System.out.print("Digite a segunda nota: ");
		double n2 = teclado.nextDouble();
		System.out.print("Digite a terceria nota: ");
		double n3 = teclado.nextDouble();
		
		// Double guarda números com casas decimais, ou seja, números com vírgula
		
		double media = (n1 + n2 + n3) / 3;
		System.out.println("Média = " + media);
		
		teclado.close();
		// TODO Auto-generated method stub

	}

}
