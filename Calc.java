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
	System.out.println("ESCOLHA UMA OP��O:");
	System.out.println("1 - SOMA");
	System.out.println("2 - SUBTRA��O");
	System.out.println("3 - MULTIPLICA��O");
	System.out.println("4 - DIVIS�O");
	System.out.println("0 - SAIR");
	System.out.println("OPERA��O:");
	opcao = input.nextInt();
	while (opcao != 0) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Qual o primeiro n�mero:");
		n1 = input.nextInt();
		System.out.println("Qual o segundo n�mero:");
		n2 = input.nextInt();
		if (opcao == 1) {
			int operacao = c.som(n1, n2);		
			System.out.printf("\nO resultado da soma �: %d\n", operacao);
			break;
		}
		if (opcao == 2) {
			int operacao = c.sub(n1, n2);		
			System.out.printf("\nO resultado da subtra��o �: %d\n", operacao);
			break;
		}
		if (opcao == 3) {
			int operacao = c.mul(n1, n2);		
			System.out.printf("\nO resultado da multiplica��o �: %d\n", operacao);
			break;
		}
		if (opcao == 4) {
			int operacao = c.div(n1, n2);		
			System.out.printf("\nO resultado da divis�o �: %d\n", operacao);
			break;
		}
		else {
			System.out.println("Op��o inv�lida!");
			break;
		}
	}
}
}