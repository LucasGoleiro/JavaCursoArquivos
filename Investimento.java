import javax.swing.JOptionPane;

	public class Investimento {
	public static void main (String []args) {
	int t;
	double v, vn;
	try{
	t = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de investimento:"));
	if (t == 1) {
		v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento:"));
		vn = v * 1.03;
		JOptionPane.showMessageDialog(null, "O valor corrigido sera de: R$ " + vn + " reais");
	}  else if (t == 2) {
		v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento:"));
		vn = v * 1.05;
		JOptionPane.showMessageDialog(null, "O valor corrigido sera de: R$ " + vn + " reais");
	} else
		JOptionPane.showMessageDialog(null, "Opção inválida");	

	}catch(Exception erro){
		JOptionPane.showMessageDialog(null,"Operacao invalida\n"+erro.getMessage());
	}
	}//fechando main
}