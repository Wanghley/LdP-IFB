package principal;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddRemoveBook extends JFrame {
	public AddRemoveBook() {
		setTitle("SBC - Adicionar ou Remover Livro");
		this.setSize(300, 188);
		getContentPane().setLayout(null);
		
		JButton btnAdicionarNovoLivro = new JButton("Adicionar\n Novo Livro");
		btnAdicionarNovoLivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewBook(e);
			}
		});
		btnAdicionarNovoLivro.setBounds(65, 26, 165, 50);
		getContentPane().add(btnAdicionarNovoLivro);
		
		JButton btnRemoverLivroExistente = new JButton("Remover Livro");
		btnRemoverLivroExistente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveBook(e);
			}
		});
		btnRemoverLivroExistente.setBounds(65, 92, 165, 50);
		getContentPane().add(btnRemoverLivroExistente);
	}
	private void NewBook(java.awt.event.ActionEvent evt) {
		
	}
	private void RemoveBook(java.awt.event.ActionEvent evt) {

	}
	public static void main() {
		AddRemoveBook pd=new AddRemoveBook();
		pd.setVisible(true);
	}
}
