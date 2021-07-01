package view;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Classe responsável por demonstrar a utilização janela (Jframe) e botão
 * (Jbuton)
 * 
 * @author Nathalia Lanaro
 * @since 01 de Março de 2021
 */
public class Exemplo01 {
	// metodo para exibir uma janela swing com um botão
	public void iniciaGui() {//inicio do método
		//criando o componente JFrame - janela e adicionando seu titulo
		JFrame janela = new JFrame(" Exemplo de tela e botão");
		
		//criando o componente JButton - botão  e adicionando seu titulo
		JButton botao = new JButton("Clique aqui");
		
		//configurar o tamanho da janela
		//primeiro parametro largura, segundo altura
		janela.setSize(500, 300);
		
		//adicionando o botão no objeto janela dentro do seu content pane 
		janela.getContentPane().add(botao);
		
		//configurando a visibilidade da tela
		janela.setVisible(true);
		
		//informando que a tela nao tem layout pré- definido 
		janela.getContentPane().setLayout(null);
		
		
	}//fim do método
	//método principal para executar a classe
	public static void main(String[] args) {
		new Exemplo01().iniciaGui();
	}
	
}//fim da classe
