package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Classe responsável por demonstrar a utilização de painéis (Novos formatos)
 * 
 * @author Nathalia Lanaro
 * @since 03 de Março de 2021
 *
 */
public class Exemplo09 {
	private JFrame janela;
	//painel principal 
	private JPanel painelPrincipal;
	private JPanel painel1;
	private JPanel painel2;
	private JPanel painel3;
	private JPanel painel4;

	// label auxiliar para mostrar os tipos de painel
	private JLabel lbAux1;
	private JLabel lbAux2;
	private JLabel lbAux3;
	private JLabel lbAux4;

	public void iniciaGui() {
		janela = new JFrame();
		janela.setTitle("Exemplo de JPainel");
		janela.setSize(422, 246);
		janela.setLocationRelativeTo(null);
		
		/*
		 * Configurações da label 1
		 */
		
		lbAux1 = new JLabel();
		lbAux1.setText("Painel 1");
		
		
		/*
		 * Configurações da label 2
		 */
		
		lbAux2 = new JLabel();
		lbAux2.setText("Painel 2");
		
		
		/*
		 * Configurações da label 3 
		 */
		
		lbAux3 = new JLabel();
		lbAux3.setText("Painel 3");
		
		
		/*
		 * Configurações da label 4 
		 */
		
		lbAux4 = new JLabel();
		lbAux4.setText("Painel 4");
		
		
		
		
		/*
		 * Configurações do primeiro painel
		 */
		
		painel1 = new JPanel();
		painel1.setBounds(4,6,200,100);
		//configurando o layout do painel
		painel1.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		//configurando borda do painel
		painel1.setBorder(BorderFactory.createEtchedBorder());
		
		painel1.add(lbAux1);
		
		/*
		 * Configurações do segundo painel
		 */
		
		painel2 = new JPanel();
		painel2.setBounds(208,6,200,100);
		//configurando a layout do painel
		painel2.setLayout(new BorderLayout(0, 0));
		//configurando a borda do painel
		painel2.setBorder(BorderFactory.createLoweredBevelBorder());
		
		painel2.add(lbAux2);
		
		/*
		 * Configurações do terceiro painel
		 */
		
		painel3 = new JPanel();
		painel3.setBounds(3,109,200,100);
		//configurando a layout do painel
		painel3.setLayout(new BoxLayout(painel3, BoxLayout.X_AXIS));
		//configurando a borda do painel
		painel3.setBorder(BorderFactory.createRaisedBevelBorder());
		
		painel3.add(lbAux3);
		
		
		/*
		 * Configurações do quarto painel
		 */
		
		painel4 = new JPanel();
		painel4.setBounds(208,110,200,100);
		//configurando a layout do painel
		painel4.setLayout(new GridLayout(1, 1, 0, 0));
		//configurando a borda do painel
		painel4.setBorder(new TitledBorder("Título"));
		
		painel4.add(lbAux4);
		
		/*
		 * Configurando painel principal
		 */
		
		painelPrincipal = (JPanel) janela.getContentPane();
		painelPrincipal.setLayout(null);
		painelPrincipal.add(painel1);
		painelPrincipal.add(painel2);
		painelPrincipal.add(painel3);
		painelPrincipal.add(painel4);
		
		janela.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new Exemplo09().iniciaGui();
	}

}
