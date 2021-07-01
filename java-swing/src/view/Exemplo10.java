package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * Classe respons�vel pela utiliza��o do componente JPanel com abas
 * 
 * @author Nathalia Lanaro
 * @since 03 de Mar�o de 2021
 * @version 1.0
 *
 */
public class Exemplo10 {
	private JFrame janela;

	// declarando labels auxiliares
	private JLabel lbAux1;
	private JLabel lbAux2;
	private JLabel lbAux3;

	// declarando os paineis
	private JPanel aba1;
	private JPanel aba2;
	private JPanel aba3;

	// declarando
	private JTabbedPane painelAbas;
	private JPanel painelPrincipal;

	public void iniciaGui() {

		/*
		 * Configura��es do JFrame - tela
		 */
		janela = new JFrame();
		janela.setTitle("Exemplo de JPainel");
		janela.setSize(390, 300);
		janela.setLocationRelativeTo(null);

		/*
		 * Configura��es da label 1
		 */

		lbAux1 = new JLabel();
		lbAux1.setText("Primeira aba ");

		/*
		 * Configura��es da label 2
		 */

		lbAux2 = new JLabel();
		lbAux2.setText("Segunda aba");

		/*
		 * Configura��es da label 3
		 */

		lbAux3 = new JLabel();
		lbAux3.setText("Terceira aba");

		/*
		 * Configura��es da primeira aba
		 */

		aba1 = new JPanel();
		aba1.add(lbAux1);

		/*
		 * Configura��es da segunda aba
		 */

		aba2 = new JPanel();
		aba2.add(lbAux2);
		/*
		 * Configura��es da terceira aba
		 */

		aba3 = new JPanel();
		aba3.add(lbAux3);

		/*
		 * configurando o controlar de abas Jtaabled
		 */

		painelAbas = new JTabbedPane();
		painelAbas.add("Aba 1", aba1);
		painelAbas.add("Aba 2", aba2);
		painelAbas.add("Aba 3", aba3);
		//configurar posi��o e tamanho
		painelAbas.setBounds(14, 21, 342, 200);

		/*
		 * Configurando painel principal
		 */

		painelPrincipal = (JPanel) janela.getContentPane();
		painelPrincipal.setLayout(null);
		painelPrincipal.add(painelAbas);

		janela.setVisible(true);
	}

	public static void main(String[] args) {
		new Exemplo10().iniciaGui();
	}

}
