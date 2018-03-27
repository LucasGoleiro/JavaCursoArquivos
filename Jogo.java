import javax.swing.JOptionPane;

	public class Jogo {
	public static void main (String []args) {
	int hi, mi, hf, mf, hdj, mdj;
	hi = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de inicio do jogo"));
	mi = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto de inicio do jogo"));
	hf = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final do jogo"));
	mf = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final do jogo"));
	hdj = 0;
	mdj = 0;
	if (hi <= hf) {
		hdj = hf - hi;	
	} if (hi > hf) {
		hf = hf + 24;
		hdj = hf - hi;	
	} if (mi <= mf) {
		mdj = mf - mi;	
	} if (mi > mf) {
		mf = mf + 60;
		mdj = mf - mi;	
	}
	JOptionPane.showMessageDialog(null, "O jogo teve: " + hdj + " horas e " + mdj + " minutos de duracao.");
	}
}
	