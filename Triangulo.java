import javax.swing.JOptionPane;

	public class Triangulo {
		public static void main (String []args) {
		double base, altura, area;
		base=Double.parseDouble(JOptionPane.showInputDialog("Digite a base do tri�ngulo em m�:"));
		altura=Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do tri�ngulo em m�:"));
		area = (base * altura) / 2;
		JOptionPane.showMessageDialog(null, "a �rea do tri�ngulo �: "+area+" m�");
	}//fechando m�todo principal
}//fechando classe