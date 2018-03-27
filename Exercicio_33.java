import javax.swing.JOptionPane;

	public class Exercicio_33 {
	public static void main (String []args) {
	int n, s;
	s = 0;
	n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo:"));
	while (n < 0) {
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo:"));
	}
	for (int c = 1; c <= n; c ++) {
		s = s + (1 / c);
		JOptionPane.showMessageDialog(null, s);
	}
	}
}
	