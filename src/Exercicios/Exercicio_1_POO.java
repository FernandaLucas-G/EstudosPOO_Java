package Exercicios;
import java.util.Scanner;

// Classe Aluno representa um aluno com métodos relacionados a notas
class Aluno {
    // Método para calcular a média de três notas
    double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}

// Class é a receita e o Objeto é o bolo pronto
// Criamos métodos na classe e depois usamos objetos para executá-los

public class Exercicio_1_POO {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Criando um objeto aluno para usar o método calcularMedia
        Aluno aluno = new Aluno();

        // Passo 1: Ler as três notas do aluno
        System.out.print("Digite a primeira nota: ");
        double n1 = teclado.nextDouble(); // Primeira nota
        System.out.print("Digite a segunda nota: ");
        double n2 = teclado.nextDouble(); // Segunda nota
        System.out.print("Digite a terceira nota: ");
        double n3 = teclado.nextDouble(); // Terceira nota

        // Passo 2: Calcular a média usando o método da classe Aluno
        double media = aluno.calcularMedia(n1, n2, n3);

        // Passo 3: Exibir o resultado
        System.out.println("Média = " + media);

        // Fechar o scanner para liberar recursos
        teclado.close();
    }
}
