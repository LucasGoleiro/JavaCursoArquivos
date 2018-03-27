import javax.swing.JOptionPane;

	public class Potencia {
	public static void main (String []args) {
	int e;
	double b, p;
	b = Double.parseDouble(JOptionPane.showInputDialog("Digite a base:"));
	e = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoênte:"));
	p = Math.pow(b, e);
	JOptionPane.showMessageDialog(null, "A potência é: " + p);
	}
}
	