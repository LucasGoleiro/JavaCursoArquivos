import javax.swing.JOptionPane;

	public class Diferenca {
	public static void main (String []args) {
	int n1, n2, d;
	n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
	n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
	if (n1 >= n2) {
		d = n1 - n2;
	} else {
		d = n2 - n1;
		}
	JOptionPane.showMessageDialog(null, "A diferenca entre os numeros e de: " + d);
	}
}