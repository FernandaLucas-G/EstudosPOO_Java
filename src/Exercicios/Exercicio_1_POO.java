package Exercicios_GPT;
import java.util.Scanner;

class Aluno {
	double calcularMedia(double n1, double n2, double n3) {
		return (n1 + n2 + n3) / 3;
	}
}

// Class é a receita e o Objeto é o bolo pronto, quando criamos uma classe criamos um método, colocamos esse método dentro de um objeto e só chamamos o objeto

public class Exercicio_1_POO {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Aluno aluno = new Aluno(); // Criando o objeto aluno para chamar o método 
		
		System.out.print("Digite a primeira nota: ");
		double n1 = teclado.nextDouble(); // Ele vai ler o proximo valor digitado e guardar em N1
		System.out.print("Digite a segunda nota: ");
		double n2 = teclado.nextDouble();
		System.out.print("Digite a terceria nota: ");
		double n3 = teclado.nextDouble();
		
		double media = aluno.calcularMedia(n1, n2, n3);
		System.out.println("Média = " + media);
		
		teclado.close();
		// TODO Auto-generated method stub

	}

}
