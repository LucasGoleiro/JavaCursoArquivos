import javax.swing.JOptionPane;

	public class Triangulo {
		public static void main (String []args) {
		double base, altura, area;
		base=Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo em m²:"));
		altura=Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo em m²:"));
		area = (base * altura) / 2;
		JOptionPane.showMessageDialog(null, "a área do triângulo é: "+area+" m²");
	}//fechando método principal
}//fechando classe