package view;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Classe respons�vel por demonstrar a utiliza��o janela (Jframe) e bot�o
 * (Jbuton)
 * 
 * @author Nathalia Lanaro
 * @since 01 de Mar�o de 2021
 */
public class Exemplo01 {
	// metodo para exibir uma janela swing com um bot�o
	public void iniciaGui() {//inicio do m�todo
		//criando o componente JFrame - janela e adicionando seu titulo
		JFrame janela = new JFrame(" Exemplo de tela e bot�o");
		
		//criando o componente JButton - bot�o  e adicionando seu titulo
		JButton botao = new JButton("Clique aqui");
		
		//configurar o tamanho da janela
		//primeiro parametro largura, segundo altura
		janela.setSize(500, 300);
		
		//adicionando o bot�o no objeto janela dentro do seu content pane 
		janela.getContentPane().add(botao);
		
		//configurando a visibilidade da tela
		janela.setVisible(true);
		
		//informando que a tela nao tem layout pr�- definido 
		janela.getContentPane().setLayout(null);
		
		
	}//fim do m�todo
	//m�todo principal para executar a classe
	public static void main(String[] args) {
		new Exemplo01().iniciaGui();
	}
	
}//fim da classe
