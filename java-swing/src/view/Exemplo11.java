package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import util.Valida;

/**
 * Classe para demonstração do componente JTabble (tabelas)
 * 
 * @author Nathalia Lanaro
 * @since 03 de Março de 2021
 * @version 1.0
 */
public class Exemplo11 {
	private JFrame janela;
	// labels para exibir os rotulos na tela
	private JLabel lbIncluiUf;
	private JLabel lbIncluirNome;

	// declarando textfield para o usuario entrar com informações
	private JTextField tfIncluirUf;
	private JTextField tfIncluirNome;

	// declarando tabela que vai armazenar os dados inseridos pelo usuário
	private JTable tabela;

	// declarando scroll auxiliar para mostrar os registros da tabela
	private JScrollPane scroll;

	// declarando botões auxliares para incluir e excluir registros na tabela
	private JButton btIncluir;
	private JButton btExcluir;

	// declarando o painel para organizar os componentes da tela
	private JPanel painel;

	private String colunas[] = { "UF", "ESTADO" };
	private String linhas[][] = { { "SP", "São Paulo" }, { "PR", "Paraná" }, { "SC", "Santa Catarina" },
			{ "RS", "Rio Grande do Sul" },

	};

	public void iniciaGui() {
		/*
		 * configurações do elemento JFrame - janela
		 */
		janela = new JFrame();
		janela.setTitle("Exemplo  de tabela");
		janela.setSize(400, 300);
		janela.setLocationRelativeTo(null);

		/*
		 * configurações do componete JLabel UF
		 */
		lbIncluiUf = new JLabel();
		lbIncluiUf.setText("Informe UF:");
		lbIncluiUf.setBounds(15, 20, 70, 25);

		/*
		 * configurações do componete JLabel Nome
		 */
		lbIncluirNome = new JLabel();
		lbIncluirNome.setText("Informe Estado:");
		lbIncluirNome.setBounds(15, 55, 90, 25);

		/*
		 * Configurações do componente JTextField UF
		 */

		tfIncluirUf = new JTextField();
		// configurar posição e tamanho
		tfIncluirUf.setBounds(110, 20, 50, 25);

		/*
		 * Configurações do componente JTextField Nome
		 */

		tfIncluirNome = new JTextField();
		// configurar posição e tamanho
		tfIncluirNome.setBounds(110, 55, 260, 25);

		/*
		 * configurando o componente JTable
		 */
		// definir a quantidade de linha e colunas da tabela
		DefaultTableModel modelo = new DefaultTableModel(linhas, colunas);
		tabela = new JTable(modelo);
		tabela.setBounds(10, 30, 300, 95);
		tabela.setEnabled(true);
	
		/*
		 * Configurando scroll
		 */

		scroll = new JScrollPane(tabela);
		// configurando a posição do scrum
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(10, 100, 360, 95);

		/*
		 * configurando JButton incluir
		 */

		btIncluir = new JButton();
		// Configurando texto inicial
		btIncluir.setText("Incluir");
		btIncluir.setBounds(75, 200, 100, 50);
		btIncluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				incluirLinha();
			}
		});

		/*
		 * configurando JButton Excluir
		 */

		btExcluir = new JButton();
		// Configurando texto inicial
		btExcluir.setText("Excluir");
		btExcluir.setBounds(195, 200, 100, 50);
		btExcluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				excluirLinha();
			}
		});
		/*
		 * Configurações do painel Principal
		 */

		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);

		painel.add(lbIncluiUf);
		painel.add(lbIncluirNome);
		painel.add(tfIncluirUf);
		painel.add(tfIncluirNome);
		painel.add(scroll);
		painel.add(btIncluir);
		painel.add(btExcluir);

		janela.setVisible(true);
	}



	// metodo para botão btn incluir
	private void incluirLinha() {
		// validar dos dados informados pelo usuario
		if (validarDados()) {
			// obtendo o modelo da tabela criada
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

			// adicionando linha
			modelo.addRow(new String[] { tfIncluirUf.getText(), tfIncluirNome.getText() });
			// limpando o campo
			tfIncluirUf.setText("");
			tfIncluirNome.setText("");
			// exibindo mensagem de sucesso para o usuário
			JOptionPane.showMessageDialog(null, "Registro incluido com sucesso", "Cadastro de Estado", 1);
		}

	}
	
	// metodo para validar dados
	private boolean validarDados() {
		if (Valida.isEmptyOrNull(tfIncluirUf.getText())) {
			JOptionPane.showMessageDialog(null, "Informe UF, campo obrigatório", "Cadastro UF", 0);
			return false;
		}
		if (Valida.isEmptyOrNull(tfIncluirNome.getText())) {
			JOptionPane.showMessageDialog(null, "Informe nome, campo obrigatório", "Cadastro Nome", 0);
			return false;
		}
		return true;

	}

	// metodo para botão btnExcluir
	private void excluirLinha() {
		//verificando se o usuario selecinou o registro
		if (tabela.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Selecione um registro", "Excluir Estado", 0);
		} else if (tabela.getSelectedRowCount()>1) {
			JOptionPane.showMessageDialog(null, "Selecione Apenas um registro", "Excluir Estado", 0);
		} else {
			//obter o modelo da tabela atual 
			DefaultTableModel  modelo = (DefaultTableModel) tabela.getModel();
			modelo.removeRow(tabela.getSelectedRow());
			//mostrando mensagem para o usuario
			JOptionPane.showMessageDialog(null, "Registro Excluido", "Excluir Estado", 1);
		}
	}

	public static void main(String[] args) {
		new Exemplo11().iniciaGui();
	}

}
