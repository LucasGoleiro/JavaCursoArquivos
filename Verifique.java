import javax.swing.JOptionPane;

	public class Verifique {

	public static void main (String []args) {
	int n1, n2;
	n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
	n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro:"));
	if (n1 > n2 ) {
		if (n1 % n2 == 0) {
			JOptionPane.showMessageDialog(null, "O numero " + n1 + " e multiplo de " + n2);
		} if (n1 % n2 != 0) {
			JOptionPane.showMessageDialog(null, "O numero " + n1 + " nao e multiplo de " + n2);
		}
	} if (n1 < n2 ) {
		if (n2 % n1 == 0) {
			JOptionPane.showMessageDialog(null, "O numero " + n2 + " e multiplo de " + n1);
		} if (n2 % n1 != 0) {
			JOptionPane.showMessageDialog(null, "O numero " + n2 + " nao e multiplo de " + n1);
		}
	}if (n1 == n2) {
		JOptionPane.showMessageDialog(null, "Os numeros sao iguais.");
	}
	}
}