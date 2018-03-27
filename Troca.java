import javax.swing.JOptionPane;

	public class Troca {
	public static void main (String []args) {
	double x, y, z;
	x = Double.parseDouble(JOptionPane.showInputDialog("Digite em numero para X:"));
	y = Double.parseDouble(JOptionPane.showInputDialog("Digite em numero para Y:"));
	z = x;
	x = y;
	y = z;
	JOptionPane.showMessageDialog(null, "X = "+x+" e Y = "+y);
	}
}