import javax.swing.JOptionPane;
import java.util.Scanner;

	public class Calc {
	public int som(int n1, int n2) {
		return n1 + n2;
	}
	public int sub(int n1, int n2) {
		return n1 - n2;
	}
	public int div(int n1, int n2) {
		return n1 / n2;
	}
	public int mul(int n1, int n2) {
		return n1 * n2;
	}
	
	public static void main (String[]args) {
	Calc c = new Calc();
	int opcao = 5;
	int n1, n2;
	Scanner input = new Scanner(System.in);
	System.out.println("ESCOLHA UMA OPÇÃO:");
	System.out.println("1 - SOMA");
	System.out.println("2 - SUBTRAÇÃO");
	System.out.println("3 - MULTIPLICAÇÃO");
	System.out.println("4 - DIVISÃO");
	System.out.println("0 - SAIR");
	System.out.println("OPERAÇÃO:");
	opcao = input.nextInt();
	while (opcao != 0) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Qual o primeiro número:");
		n1 = input.nextInt();
		System.out.println("Qual o segundo número:");
		n2 = input.nextInt();
		if (opcao == 1) {
			int operacao = c.som(n1, n2);		
			System.out.printf("\nO resultado da soma é: %d\n", operacao);
			break;
		}
		if (opcao == 2) {
			int operacao = c.sub(n1, n2);		
			System.out.printf("\nO resultado da subtração é: %d\n", operacao);
			break;
		}
		if (opcao == 3) {
			int operacao = c.mul(n1, n2);		
			System.out.printf("\nO resultado da multiplicação é: %d\n", operacao);
			break;
		}
		if (opcao == 4) {
			int operacao = c.div(n1, n2);		
			System.out.printf("\nO resultado da divisão é: %d\n", operacao);
			break;
		}
		else {
			System.out.println("Opção inválida!");
			break;
		}
	}
}
}