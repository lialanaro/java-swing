package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 * Classe para demonstrar a utilização de senha
 * @author Nathalia Lanaro 
 * @since 02/03/2021
 *
 */
public class Exemplo07 {
	private JFrame janela;
	private JPanel painel;
	private JLabel lbsenha;
	
	//declarando campo para senha 
	private JPasswordField pfSenha;
	
	public void iniciaGui() {
		janela = new JFrame();
		janela.setTitle("exemplo de passwordField");
		janela.setSize(300, 300);
		janela.setLocationRelativeTo(null);
		
		/*
		 * Configurações do label
		 */
		
		lbsenha = new JLabel();
		lbsenha.setText("Senha:");
		lbsenha.setBounds(10, 40, 40, 20);
		
		
		/*
		 * configurações do jpassowordField
		 */
		pfSenha = new JPasswordField();
		pfSenha.setBounds(60, 40, 100, 20);
		
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbsenha);
		painel.add(pfSenha);
		
		janela.setVisible(true);

	}
	
	public static void main(String[] args) {
		new Exemplo07().iniciaGui();
	}
	

}
