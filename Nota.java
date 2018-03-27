import javax.swing.JOptionPane;

	public class Nota {
	public static void main (String []args) {
	double n1, n2, n3, n4, m;
	n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
	n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
	n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
	n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));
	m = (n1 + n2 + n3 + n4) / 4;
	if (m >= 6 ) {
		JOptionPane.showMessageDialog(null, "APROVADO");
	} if (m >= 3  && m < 6) {
		JOptionPane.showMessageDialog(null, "EXAME");
	} if (m < 6 ) {
		JOptionPane.showMessageDialog(null, "REPROVADO");
	}
	}
}
			
	