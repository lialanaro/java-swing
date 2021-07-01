package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 * Classe para demonstrar a utilização de janela, textarea, textField e função
 * dos botões
 * 
 * @author Nathalia Lanaro
 * @since 01 de Março de 2021
 */
public class Exemplo03 {
	
	/*
	 * declarando os componentes utilizando em tela
	 */

	private JFrame janela;
	private JTextField campo;
	private JTextArea area;
	private JButton botao1;
	private JButton botao2;
	
	/*
	 * método para criar a instancia dos objetos e suas ações
	 */
	
	public void iniciaGui() {
		/*
		 * Configurando dela
		 */
		janela = new JFrame();
		janela.setSize(300,300);
		janela.setTitle("Exemplo de ações");
		janela.setLocationRelativeTo(null);
		
		/*
		 * configurando o campo texto
		 */
		campo = new JTextField();
		
		/*
		 * Configurando area de texto
		 */
		area = new JTextArea();
		
		/*
		 * Configurando o primeiro botão
		 */
		botao1 = new JButton();
		botao1.setText("Clique aqui");
		//adicionado um evento de clique do componente
		botao1.addActionListener( new AcaoBotao1());
		/*
		 * Configurando o segundo botão
		 */
		botao2 = new JButton();
		botao2.setText("troca cor");
		botao2.addActionListener(new AcaoBotao2());
		
		/*
		 * adicionando os componentes e sua localização 
		 */
		
		janela.getContentPane().add(BorderLayout.EAST, botao2);
		janela.getContentPane().add(BorderLayout.SOUTH, botao1);
		janela.getContentPane().add(BorderLayout.CENTER, area);
		janela.getContentPane().add(BorderLayout.NORTH, campo);
		
		/*
		 * Configurando os paramentros de execução da tela 
		 */
		janela.setVisible(true);
	}//fim do método
	
	/*
	 * classe interna para auxiliar controlar a ação do botão 1
	 */
	public class AcaoBotao1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String auxiliar = campo.getText(); //captura o texto digitado no campo textfield
			//atribuindo o valor para area
			area.append(auxiliar + "\n");
			//apagando conteudo digitado
			campo.setText(" ");
			
		}
		
	} //fim da classe interna

	/*
	 * classe interna para auxiliar controlar a ação do botão 2
	 */
	
	public class AcaoBotao2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//verifica a cor do background
			if (area.getBackground().equals(Color.BLACK)) {
				//trocando a cor
				area.setBackground(Color.WHITE);
				//definindo a cor do texto
				area.setForeground(Color.BLACK);
			} else {
				//trocando a cor
				area.setBackground(Color.BLACK);
				//definindo a cor do texto
				area.setForeground(Color.WHITE);
			}
			
		}
		
	}
	
	//método principal para executar a classe
	public static void main(String[] args) {
	 new Exemplo03().iniciaGui();
	}
	
	
}//fim da classe
