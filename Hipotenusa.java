import javax.swing.JOptionPane;

	public class Hipotenusa {
	public static void main (String []args) {
	double c1, c2, h, h2;
	c1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um cateto em cm²:"));
	c2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro cateto em cm²:"));
	h2 = (c1 * c1) + (c2 *c2);
	h = Math.sqrt(h2);	
	JOptionPane.showMessageDialog(null, "A hipotenusa tem: " + h + " cm²");
	}
}
	