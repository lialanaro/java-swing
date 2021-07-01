package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Classse para demonstrar janelas, botões, rotulos e  campo texto.
 * @author Nathalia Lanaro
 * @since 01 de Março de 2021
 *
 */
public class Exemplo02 {
	//método responsavel por criar tela e adicionar seus componentes
	public void iniciaGui() {
		//Definindo a tela e suas configurações
		JFrame janela = new JFrame();
		//configurando o titulo da tela 
		janela.setTitle("Exemplo de campo de texto");
		//configurando o tamanho da tela
		janela.setSize(300, 200);
		//definir o layout como nulo da janela
		janela.getContentPane().setLayout(null);
		//configurando a centralização do objeto janela
		janela.setLocationRelativeTo(null);
		
		/* 
		 * definindo rotulo e suas configurações
		 */
		JLabel lbNome = new JLabel();
		//definindo txt 
		lbNome.setText("Nome");
		//configurando o tamanho e o local da label
		//primeira posição X ponto 0 para a direta
		//segundo  posição y do ponto 0 para baixo
		//terceiro argumento - largura
		//quarto argumento - altura
		lbNome.setBounds(10, 10, 40, 20);
		
		/* 
		 * definindo campo para texto - digitação p usuário
		 */
		JTextField tfNome = new JTextField();
		//configurando o tamanho
		tfNome.setBounds(60, 10, 150, 20);
		/*
		 * definindo botão e suas configurações
		 */
		
		JButton botao = new JButton();
		//configurando o texto do botão
		botao.setText("Clique aqui");
		//configurando o local e tamanho do botao
		botao.setBounds(10, 60, 100, 20);
		
		/*
		 * adicionando os componentes na tela
		 */
		janela.getContentPane().add(lbNome);
		janela.getContentPane().add(tfNome);
		janela.getContentPane().add(botao);
		
		
		/*
		 * Configurando o parametro de visualização da tela 
		 */
		
		janela.setVisible(true);
	}//fim do método 
	//método principal para executar a classe 
	public static void main(String[] args) {
		new Exemplo02().iniciaGui();
	}

}//fim da classe
