import javax.swing.JOptionPane;

	public class Ano {
	public static void main (String []args) {
	int an, aa, id, ia;
	an = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
	aa = Integer.parseInt(JOptionPane.showInputDialog("Digite o atual: "));
	ia = aa - an;
	id = ia + 17;
	JOptionPane.showMessageDialog(null, "A pessoa tem "+ia+" anos atualmente, e daqui a 17 anos tera: "+id);
	}
}