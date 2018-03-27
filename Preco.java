import javax.swing.JOptionPane;

	public class Preco {
	public static void main (String []args) {
	int v;
	double p, pn, j;
	p = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco atual:"));
	v = Integer.parseInt(JOptionPane.showInputDialog("Digite a media do produto:"));
	if (p < 30 && v < 500) {
		pn = p * 1.10;
		JOptionPane.showMessageDialog(null, "O preco atual sera de: R$ " + pn + " reais");
	} else if ((p >= 30 && p < 80) && (v >= 500 && v < 1000)) {
		pn = p *1.15;
		JOptionPane.showMessageDialog(null, "O preco atual sera de: R$ " + pn + " reais");
	} else if (p >= 1000 && v >= 80) {
		j = (p * 5) / 100;
		pn = p - j;
		JOptionPane.showMessageDialog(null, "O preco atual sera de: R$ " + pn + " reais");
	} else {
		JOptionPane.showMessageDialog(null, "O preco atual sera de: R$ " + p + " reais");
	}
	}
}
	