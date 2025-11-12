package Exercicios_GPT;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int idade = teclado.nextInt();
		
		if (idade < 12) {
			System.out.println("Você é uma criança."); 
		} else if (idade < 18) {
			System.out.println("Você é um adolescente.");
		} else {
			System.out.println("Você é um adulto.");
		}
		
		// Sobre os {} É como se: Se a idade for menor que 18, execute tudo o que está dentro das chaves.
		teclado.close();
		// TODO Auto-generated method stub

	}

}
