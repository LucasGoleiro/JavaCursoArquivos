import javax.swing.JOptionPane;

	public class Equacao {
	public static void main (String []args) {
	double a, b, c, delta, raiz1, raiz2;
	a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A:" ));
	b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B:" ));
	c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C:" ));
	delta = Math.pow(b, 2) - (4 * a * c);
	raiz1 = ((-b + Math.sqrt(delta)) / (2 * a));
	raiz2 = ((-b - Math.sqrt(delta)) / (2 * a));
	JOptionPane.showMessageDialog(null, "As raizes sao: \n" +raiz1 +"e " +raiz2);
	}
}