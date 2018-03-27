import javax.swing.JOptionPane;

	public class Crescente {
	public static void main (String []args) {
	int n1 , n2;
	n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
	n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor inteiro:"));
	if (n1 > n2) {
		JOptionPane.showMessageDialog(null, n2 + " - " + n1 );
	} if (n2 > n1) {
		JOptionPane.showMessageDialog(null, n1 + " - " + n2 );
	}
	}
}