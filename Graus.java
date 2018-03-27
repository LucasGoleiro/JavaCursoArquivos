import javax.swing.JOptionPane;

public class Graus {
	static public void main (String [] args) {
	double cel, far;
	cel = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em °C"));
	far = ((9 * cel) + 160) / 5;
	JOptionPane.showMessageDialog(null, "A temperatura é de " +far +"°F");
	}
}