import javax.swing.JOptionPane;

	public class Alimento {
	public static void main (String []args) {
	double qa, dias, ag;
	qa = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimentos em kg:"));
	ag = qa * 1000;
	dias = ag / 50;
	JOptionPane.showMessageDialog(null, "A quantidade de alimento durara por " + dias + " dias");
	}
}