package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Classe para demonstrar a utilização do componente JCHECKBOX
 * 
 * @author Nathalia Lanaro
 * @since 02 de Março de 2021
 *
 */
public class Exemplo05 {
	private JFrame janela;
	private JLabel lbAuxiliar;
	private JCheckBox cbBoleto;
	private JCheckBox cbCartao;
	private JCheckBox cbCobranca;
	private JButton btVerificar;
	private JPanel painel;

	// criando metodo para configuraççoes da tela
	public void iniciaGui() {
		janela = new JFrame();
		janela.setTitle("exemplo de checkbox");
		janela.setSize(390, 300);
		janela.setLocationRelativeTo(null);

		/*
		 * configurações do Jlabel
		 */
		lbAuxiliar = new JLabel();
		lbAuxiliar.setText("Selecione a forma de pagamento:");
		lbAuxiliar.setBounds(40, 15, 210, 20);

		/*
		 * configurações do JCheckBox
		 */

		cbBoleto = new JCheckBox();
		cbCartao = new JCheckBox();
		cbCobranca = new JCheckBox();

		cbBoleto.setText("Boleto");
		cbCartao.setText("Cartão de Crédito");
		cbCobranca.setText("Cobrança Bancária");

		cbBoleto.setBounds(45, 60, 145, 20);
		cbCartao.setBounds(45, 80, 145, 20);
		cbCobranca.setBounds(45, 100, 145, 20);

		/*
		 * configurando JButton
		 */

		btVerificar = new JButton();
		btVerificar.setText("Verificar");
		btVerificar.setBounds(145, 196, 120, 28);
		btVerificar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				verificaCheckBox();

			}
		});

		/*
		 * Configurando JPanel
		 */

		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbAuxiliar);
		painel.add(cbBoleto);
		painel.add(cbCartao);
		painel.add(cbCobranca);
		painel.add(btVerificar);

		janela.setVisible(true);

	}

	// método p verificar a seleção do componente jcheckbox
	private void verificaCheckBox() {
		String aux = "";
		// verificando boletos selecionado
		if (cbBoleto.isSelected()) {
			aux += cbBoleto.getText() + "\n";
		}
		if (cbCartao.isSelected()) {
			aux += cbCartao.getText() + "\n";
		}

		if (cbCobranca.isSelected()) {
			aux += cbCobranca.getText() + "\n";
		}
		
		//exibindo o resultado para o usuario
		if (!aux.equals("")) {
			JOptionPane.showMessageDialog(null, aux, "Formas de Pagamento", 1);
		}

	}

	public static void main(String[] args) {
		new Exemplo05().iniciaGui();
	}

}
