import javax.swing.JOptionPane;

	public class Circuito {
	public static void main (String []args) {
	int nv;
	double ec, td, ek, tk, vm ;
	nv = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de voltas:"));
	ec = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensao do circuito em metros:"));
	td = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duracao em minutos:"));
	ek = (ec / 1000) * nv;
	tk = td / 60;
	vm = ek / tk;
	JOptionPane.showMessageDialog(null, "A velocidade media foi de: " + vm + " Km/h.");
	}
}