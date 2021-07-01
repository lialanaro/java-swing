package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utilização de Menu
 * 
 * @author Nathalia Lanaro
 * @since 02 de Março de 2021
 * @version 1.0
 *
 */
public class Exemplo00 {

	// declarando os atributos da tela
	private JFrame janela;

	// declarando a barra de menu
	private JMenuBar barraMenu;

	// declarando menu1 e menu2
	private JMenu menu1;
	private JMenu menu2;
	private JMenu menu3;

	// declarando os itens de menu
	private JMenuItem itemMenu1;
	private JMenuItem itemMenu2;
	private JMenuItem itemMenu3;
	private JMenuItem itemMenu4;
	private JMenuItem itemMenu5;
	private JMenuItem itemMenu6;
	private JMenuItem itemMenu7;
	private JMenuItem itemMenu8;
	private JMenuItem itemMenu9;
	private JMenuItem itemMenu10;
	private JMenuItem itemMenu11;
	private JMenuItem itemMenu12;
	private JMenuItem itemMenu13;

	// método p criar a tela
	public void iniciaGui() {
		/*
		 * criando as instancia dos objetos
		 */

		janela = new JFrame();
		barraMenu = new JMenuBar();
		menu1 = new JMenu();
		menu2 = new JMenu();
		menu3 = new JMenu();
		itemMenu1 = new JMenuItem();
		itemMenu2 = new JMenuItem();
		itemMenu3 = new JMenuItem();
		itemMenu4 = new JMenuItem();
		itemMenu5 = new JMenuItem();
		itemMenu6 = new JMenuItem();
		itemMenu7 = new JMenuItem();
		itemMenu8 = new JMenuItem();
		itemMenu9 = new JMenuItem();
		itemMenu10 = new JMenuItem();
		itemMenu11 = new JMenuItem();
		itemMenu12 = new JMenuItem();
		itemMenu13 = new JMenuItem();

		/*
		 * Configurações de texto do menu
		 */

		menu1.setText("Menu 1");
		menu2.setText("Menu 2");
		menu3.setText("Menu 3");

		/*
		 * configurações do texto de menu
		 */
		itemMenu1.setText("Exemplo01");
		itemMenu2.setText("Exemplo02");
		itemMenu3.setText("Exemplo03");
		itemMenu4.setText("Exemplo04");
		itemMenu5.setText("Exemplo05");
		itemMenu6.setText("Exemplo06");
		itemMenu7.setText("Exemplo07");
		itemMenu8.setText("Exemplo08");
		itemMenu9.setText("Exemplo09");
		itemMenu10.setText("Exemplo10");
		itemMenu11.setText("Exemplo11");
		itemMenu12.setText("Exemplo12");
		itemMenu13.setText("Sair");
		/*
		 * adicionando o menu na barra de menu
		 */

		barraMenu.add(menu1);
		barraMenu.add(menu2);
		barraMenu.add(menu3);

		/*
		 * adicionando itens ao menu 1
		 */

		menu1.add(itemMenu1);
		menu1.add(itemMenu2);
		menu1.add(itemMenu3);
		menu1.add(itemMenu4);
		menu1.add(itemMenu5);
		menu1.add(itemMenu6);

		/*
		 * adicionando itens ao menu 2
		 */

		menu2.add(itemMenu7);
		menu2.add(itemMenu8);
		menu2.add(itemMenu9);
		menu2.add(itemMenu10);
		menu2.add(itemMenu11);
		menu2.add(itemMenu12);

		/*
		 * adicionando item de menu 3
		 */

		menu3.add(itemMenu13);

		/*
		 * adicionando ação aos itens de menu
		 */

		itemMenu1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Exemplo01().iniciaGui();
			}
		});

		itemMenu2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Exemplo02().iniciaGui();
			}
		});

		itemMenu3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Exemplo03().iniciaGui();
			}
		});

		itemMenu4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Exemplo04().iniciaGui();
			}
		});
		itemMenu5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Exemplo05().iniciaGui();
			}
		});

		itemMenu6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Exemplo06().iniciaGui();
			}
		});

		itemMenu7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Exemplo07().iniciaGui();
			}
		});

		itemMenu8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Exemplo08().iniciaGui();
			}
		});

		itemMenu9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Exemplo09().iniciaGui();
			}
		});

		itemMenu10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Exemplo10().iniciaGui();
			}
		});

		itemMenu11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Exemplo11().iniciaGui();
			}
		});

		itemMenu12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					new Exemplo12().iniciaGui();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		itemMenu13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sistema?", "Atenção",
						JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);

				if (opcao == JOptionPane.YES_OPTION) {
					System.exit(0);
				}

			}
		});

		/*
		 * configurações do JFrame
		 */

		janela.setJMenuBar(barraMenu);
		janela.setTitle("Exemplo de menu");

		// configurando a ação do x
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// configurando janela maximizada
		janela.setExtendedState(JFrame.MAXIMIZED_BOTH);

		// configurando visibilidade da janela
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		new Exemplo00().iniciaGui();
	}
}
