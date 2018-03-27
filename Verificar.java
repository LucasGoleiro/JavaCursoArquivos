import javax.swing.JOptionPane;

	public class Verificar {
	public static void main (String []args) {
	int v;
	v = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
	if (v % 2 == 0 && v % 3 == 0) {
		JOptionPane.showMessageDialog(null, "O numero " + v + " e divisivel por 2 e por 3.");
	} else {
		JOptionPane.showMessageDialog(null, "O numero " + v + " nao e divisivel por 2 e por 3.");
	}
	}
}

	

	