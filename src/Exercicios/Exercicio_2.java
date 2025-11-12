package Exercicios;
import java.util.Scanner; 
// Importa o pacote java.util e pede a ferramenta Scanner para ler dados fornecidos pelo usuário

public class Exercicio_2 {

    public static void main(String[] args) {
        // Criando o leitor de entrada
        // Scanner é uma classe pronta no Java; 'teclado' é o nome do objeto que escolhemos
        Scanner teclado = new Scanner(System.in);

        // Passo 1: Solicitar o nome do usuário
        System.out.print("Digite seu nome: "); 

        // Passo 2: Armazenar o nome digitado em uma variável
        String nome = teclado.nextLine(); 

        // Passo 3: Exibir uma mensagem personalizada
        System.out.println("Olá, " + nome + "!"); 

        // Fechar o scanner para liberar recursos (boa prática)
        teclado.close(); 
    }
}
