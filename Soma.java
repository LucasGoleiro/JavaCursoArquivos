import javax.swing.JOptionPane;

	public class Soma {
	public static void main (String []args) {
	int n1, n2, q1, q2, sq;
	n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
	n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
	q1 = n1 * n1;
	q2 = n2 * n2;
	sq = q1 + q2;
	JOptionPane.showMessageDialog(null, "A soma dos quadrados dos numeros e: " + sq);
	}
}