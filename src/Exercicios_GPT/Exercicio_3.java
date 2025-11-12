package Exercicios_GPT;
import java.util.Scanner; // Importamos o pacote pronto .util do Java e pedimos a ferramenta Scanner para ler os dados fornecidos pelo usuário

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // Criando o leitor, Scanner é uma das classes (ferramentas, códigos prontos) que vem nesse pacote que importamos, teclado é só o nome que escolhemos dar
		System.out.print("Digite seu nome: "); // Aqui colocamos o texto que aparece antes do "input"
		String nome = teclado.nextLine(); // Aqui é o comando que armazena a informação digitada, dentro da variavel string "nome"
		System.out.println("Olá, " + nome + "!"); // Junta o "Print" com a informação que guardamos na variavel "nome", ele chama a variavel e vai mostrar o que o usuário digitou
		teclado.close(); // Fecha o objeto teclado para poupar recursos (O Java fecha sozinho mas fechamos por boa prática)
		// TODO Auto-generated method stub

	}

}
