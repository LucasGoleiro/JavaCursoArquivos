import javax.swing.JOptionPane;

	public class Potencia {
	public static void main (String []args) {
	int e;
	double b, p;
	b = Double.parseDouble(JOptionPane.showInputDialog("Digite a base:"));
	e = Integer.parseInt(JOptionPane.showInputDialog("Digite o expo�nte:"));
	p = Math.pow(b, e);
	JOptionPane.showMessageDialog(null, "A pot�ncia �: " + p);
	}
}
	