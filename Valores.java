import javax.swing.JOptionPane;

	public class Valores {
	public static void main (String []args) {
	double v1, v2;	
	v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:")); 
	v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:")); 
	if (v1 > v2) {
		JOptionPane.showMessageDialog(null, "O maior valor entre eles e: " + v1);
	}if (v2 > v1) {
		JOptionPane.showMessageDialog(null, "O maior valor entre eles e: " + v2);
	}if (v1 == v2) {
		JOptionPane.showMessageDialog(null, "Os numeros sao iguais");
	}
	}
}