import javax.swing.JOptionPane;

	public class Exercicio_32 {
	public static void main (String []args) {
	int n, f;
	n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo:"));
	while (n < 0) {
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo:"));
	}
	f = n;
	for (int c = 1; c < n; c ++) {
		f = f * c;
	}
	JOptionPane.showMessageDialog(null, "O fatorial de " + n + " é " + f);
	}
}
		