import javax.swing.JOptionPane;

	public class Ordem {
	public static void main (String []args) {
	double v1, v2, v3, v4;
	v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
	v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor maior que o anterior:"));
	v3 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor maior que o anterior:"));
	v4 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor aleatorio:"));
	if (v4 < v1 ) {
		JOptionPane.showMessageDialog(null, v4 + " - " + v1 + " - " + v2 + " - "+ v3);
	} if (v4 > v1 && v4 < v2 ) {
		JOptionPane.showMessageDialog(null, v1 + " - " + v4 + " - " + v2 + " - "+ v3);
	} if (v4 > v2 && v4 < v3 ) {
		JOptionPane.showMessageDialog(null, v1 + " - " + v2 + " - " + v4 + " - " + v3);
	} if (v4 > v3 ) {
		JOptionPane.showMessageDialog(null, v1 + " - " + v2 + " - " + v3 + " - " + v4);
	}
	}
}