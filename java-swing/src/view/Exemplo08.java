package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.AttributeSet.ColorAttribute;

/**
 * Classe para demonstrar a utilização do componente JList e o componente JScrollPane
 * @author Nathalia Lanaro
 * @since 03 de Março de 2021
 *
 */
public class Exemplo08 {
	//declarando janela
	private JFrame janela;
	
	//declarando Jlist para armazenar uma lista de opções
	private JList ltDiaSemana;
	
	//declarando Jscrollpane
	private JScrollPane scroll;

	//label auxiliar
	private JLabel lbAuxiliar;
	
	//painel p organizar os componetes
	private JPanel painel;
	
	private String diasSemana [] = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta","Sabádo"};
	
	public void iniciaGui() {
		janela = new JFrame();
		janela.setTitle("Exemplo de JList e JScrollPane");
		janela.setSize(330, 330);
		janela.setLocationRelativeTo(null);
		
		/* 
		 * configurações do JLabrl
		 */
		
		lbAuxiliar = new JLabel();
		lbAuxiliar.setText("CTRL para multi seleções");
		//configurações de estilo
		lbAuxiliar.setOpaque(true);
		lbAuxiliar.setBackground(Color.LIGHT_GRAY);
		lbAuxiliar.setForeground(Color.BLACK);
		lbAuxiliar.setBounds(10, 10, 300, 30);
		
		//instanciando JList e atribuindo o vetor a ele 
		ltDiaSemana = new JList(diasSemana);
		//configurando se vai ser multiplaescola ou unico
		ltDiaSemana.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		ltDiaSemana.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				//atribuindo o texto selecionado na label auxiliar 
				lbAuxiliar.setText((String)ltDiaSemana.getSelectedValue());
				
			}
		});
		
		//configurando scroll
		scroll  = new JScrollPane(ltDiaSemana);
		scroll.setBounds(10, 60, 300, 90);
		
		//confiruções da janela
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbAuxiliar);
		painel.add(scroll);
		
		janela.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Exemplo08().iniciaGui();
	}
	
}
