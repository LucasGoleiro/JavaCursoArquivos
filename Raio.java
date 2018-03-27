import javax.swing.JOptionPane;

	public class Raio {
	public static void main (String []args) {
	double r, c;
	r = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunferencia: "));
	c = 2 * Math.PI *r;
	JOptionPane.showMessageDialog(null, "O comprimento da circunferencia e de: " + c);
	}
}