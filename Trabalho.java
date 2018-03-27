import javax.swing.JOptionPane;

	public class Trabalho {
	public static void main (String []args) {
	double ht, vh, pd, nd, sl, sb, sf, d;
	ht = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas:"));
	vh = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora de trabalho:"));
	pd = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto:"));
	nd = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de dependentes:"));
	sb = ht * vh;
	d = sb * pd / 100;
	sl = sb - d;
	sf = sl + (nd * 100);
	JOptionPane.showMessageDialog(null, "O salario a receber e de: " + sf + " reais");
	}
}
	