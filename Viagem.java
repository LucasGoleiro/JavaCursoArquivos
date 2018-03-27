import javax.swing.JOptionPane;

	public class Viagem {
	public static void main (String []args) {
	double t, v, g, d;
	t = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso em horas:"));
	v = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade media em km/h:"));
	d = v * t;
	g = d / 12;
	JOptionPane.showMessageDialog(null, "Foram gastos " + g + " litros.");
	}
}