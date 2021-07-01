package view;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Classe responsavel por demonstrar a utilização de JcomboBox
 * @author Nathalia Lanaro
 * @since 23 de Março de 2021
 *
 */
public class Exemplo06 {
	private JFrame janela;
	private JComboBox cbxEstados;
	private JPanel painel;
	private String estados [] = {"São Paulo", "Paraná", "Santa Catarina", "Rio Grande do Sul"};
	
	
	
	
	public void iniciaGui() {
		janela = new JFrame();
		janela.setTitle("exemplo de ComboBox");
		janela.setSize(390, 300);
		janela.setLocationRelativeTo(null);
		
		/*
		 * Configurações do jcombox
		 */
		
		cbxEstados = new JComboBox(estados);
		cbxEstados.setBounds(10, 10, 300, 20);
		
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(cbxEstados);
		
		janela.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Exemplo06().iniciaGui();
	}
}
