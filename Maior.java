import javax.swing.JOptionPane;

	public class Maior {
	public static void main (String []args) {
	int n1, n2, d;
	n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
	n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero:"));
	if (n1 > n2) {
		d = n1 - n2;
		JOptionPane.showMessageDialog(null, "A diferenca entre " + n1 + " e " + n2 + " e de: " + d);
	} if (n2 > n1) {
		d = n2 - n1;
		JOptionPane.showMessageDialog(null, "A diferenca entre " + n2 + " e " + n1 + " e de: " + d);
	} if (n1 == n2) {
		JOptionPane.showMessageDialog(null, "Os numeros sao iguais");
	}
	}
}