import javax.swing.JOptionPane;
	
	public class Paralelepipedo {
	public static void main (String []args) {
	double c, a, l, v;
	c = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do paralelepipedo:"));
	a = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do paralelepipedo:"));
	l = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do paralelepipedo:"));
	v = c * a * l;
	JOptionPane.showMessageDialog(null, "O volume do paralelepipedo e: "+v);
	}
}