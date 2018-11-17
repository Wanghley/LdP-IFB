package principal;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ProgressBar extends JFrame {
	//Create a jprogress bar
	JProgressBar pb;
	public ProgressBar() {
		pb = new JProgressBar();
		pb.setBounds(22, 29, 250, 20);
		pb.setValue(0);
		pb.setStringPainted(true);
		getContentPane().add(pb);
		this.setSize(293, 92);
		getContentPane().setLayout(null);
		
		JLabel lblCarregandoListaDe = new JLabel("Carregando Lista de Livros:");
		lblCarregandoListaDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarregandoListaDe.setBounds(0, 0, 282, 17);
		getContentPane().add(lblCarregandoListaDe);
	}
	
	//Update the pb
	public void update(int value) {
		pb.setValue(value);
	}
	public static void begin() {
		ProgressBar pd=new ProgressBar();
		pd.setVisible(true);
		pd.update(0);
	}
}
