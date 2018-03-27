import javax.swing.JOptionPane;

	public class Angulo {
	public static void main (String []args) {
	double a1, a2, a3, sa;
	a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um angulo em graus:"));
	a2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro angulo em graus:"));
	sa = a1 + a2;
	a3 = 180 - sa;
	JOptionPane.showMessageDialog(null, "O terceiro angulo tem:" + a3 + " graus");
	}
}
