import javax.swing.JOptionPane;

	public class Poupanca {
	public static void main (String []args) {
	double d, r, vf;
	d = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da aplicacao: "));
	r = ((d * 1.3) / 100);
	vf = d + r;
	JOptionPane.showMessageDialog(null, "O valor apos um ano sera de: "+vf);
	}
}
