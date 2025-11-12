package Exercicios;
import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {
        // Criando o leitor de entrada
        Scanner teclado = new Scanner(System.in);

        // Passo 1: Solicitar a idade do usuário
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        // Passo 2: Verificar a faixa etária
        if (idade < 12) {
            System.out.println("Você é uma criança.");
        } else if (idade < 18) {
            System.out.println("Você é um adolescente.");
        } else {
            System.out.println("Você é um adulto.");
        }

        // Explicação rápida sobre {}:
        // O que estiver dentro das chaves será executado se a condição do if/else for verdadeira

        // Passo 3: Fechar o scanner para liberar recursos
        teclado.close();
    }
}
