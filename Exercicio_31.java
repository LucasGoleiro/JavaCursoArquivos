import javax.swing.JOptionPane;

	public class Exercicio_31 {
	public static void main (String []args) {
	int n, a, q;
	n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro entre 10 e 150:"));
	while (n < 10 || n > 150) {
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro entre 10 e 150:"));
	}
	a = n;
	q = a * n;
	JOptionPane.showMessageDialog(null, "O quadrado de " + n + " é " + q);
	}
}