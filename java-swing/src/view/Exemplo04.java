package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

/**
 * Classe responsavel por demonstrar a utilização do componente radiobutton
 * 
 * @author Nathalia Lanaro
 * @since 02 de Março de 2021
 */
public class Exemplo04 {
	private JFrame janela;
	private JLabel lbAuxiliar;
	// declarando radiobutton
	private JRadioButton rbSolteiro;
	private JRadioButton rbCasado;
	private JRadioButton rbViuvo;
	private JRadioButton rbDivorciado;
	// componente button group responsavel por gerenciar os componentes
	// radiosButtons
	private ButtonGroup grpRadio;
	private JButton btnVerificar;
	// componente para organização
	private JPanel painel;

	// método p criar tela
	public void iniciaGui() {
		janela = new JFrame();
		janela.setTitle("exemplo de RadioButton");
		janela.setSize(340, 275);
		janela.setLocationRelativeTo(null);
		/*
		 * configurar label
		 */

		lbAuxiliar = new JLabel();
		// configurando o texto inicial
		lbAuxiliar.setText("Selecione o seu estado civil");
		// configurando a posição do texto
		lbAuxiliar.setHorizontalTextPosition(SwingConstants.CENTER);
		// configurando a posição e tamanho
		lbAuxiliar.setBounds(50, 20, 230, 20);

		/*
		 * configurando rbuton
		 */

		rbCasado = new JRadioButton();
		rbDivorciado = new JRadioButton();
		rbSolteiro = new JRadioButton();
		rbViuvo = new JRadioButton();

		rbSolteiro.setText("Solteiro");
		rbCasado.setText("Casado");
		rbDivorciado.setText("Divorciado");
		rbViuvo.setText("Viuvo");

		rbSolteiro.setBounds(80, 50, 100, 25);
		rbCasado.setBounds(80, 75, 100, 25);
		rbViuvo.setBounds(80, 100, 100, 25);
		rbDivorciado.setBounds(80, 125, 100, 25);

		/*
		 * configuraçoes do group
		 */
		grpRadio = new ButtonGroup();
		grpRadio.add(rbSolteiro);
		grpRadio.add(rbCasado);
		grpRadio.add(rbViuvo);
		grpRadio.add(rbDivorciado);

		/*
		 * configurações do jbutton
		 */
		btnVerificar = new JButton();
		btnVerificar.setText("Verificar");
		btnVerificar.setBounds(126, 176, 84, 28);
		// configurando a ação do botão
		btnVerificar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				verificaRadioButton();

			}
		});

		/*
		 * configurar jpanel
		 */

		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		// adicionando os componentes no painel
		painel.add(lbAuxiliar);
		painel.add(rbSolteiro);
		painel.add(rbCasado);
		painel.add(rbViuvo);
		painel.add(rbDivorciado);
		painel.add(btnVerificar);

		// configurando visibilidade da tela

		janela.setVisible(true);
	}

	private void verificaRadioButton() {
		// variavel auxiliar para verificar o texto que foi selecionado
		String aux = "";
		// verificando se a opção solteiro esta selecionado
		if (rbSolteiro.isSelected()) {
			aux = "Selecione o estado civil:"+ " " + rbSolteiro.getText();
		}
		if (rbCasado.isSelected()) {
			aux = "Selecione o estado civil:" + " " + rbCasado.getText();
		}
		if (rbViuvo.isSelected()) {
			aux = "Selecione o estado civil:" + " " + rbViuvo.getText();
		}

		if (rbDivorciado.isSelected()) {
			aux = "Selecione o estado civil:" + " " + rbDivorciado.getText();
		}
		
		//atribuindo a seleção do usuário na label auxiliar
		if (!aux.equals("")) {
			lbAuxiliar.setText(aux);
		}

	}

	public static void main(String[] args) {
		new Exemplo04().iniciaGui();
	}
}
