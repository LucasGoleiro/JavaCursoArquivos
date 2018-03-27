import javax.swing.JOptionPane;

	public class Teste {
	public static void main (String []args) {
	int ano;
	ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));
	if (ano % 4 == 0) {
		JOptionPane.showMessageDialog(null, "O ano: " +  ano + " é bissexto.");
	} else {
		JOptionPane.showMessageDialog(null, "O ano: " +  ano + " não é bissexto.");
	}
	}
}
	