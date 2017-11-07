package face;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JanelaExibirVagas extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JPanel panelExibirVagas = null;

	private JLabel campoExibirVagas = null;

	private JLabel campoQtdVagas = null;

	private JTextField textoTotalVagas = null;

	private JLabel campoQtdVagaEspeciais = null;

	private JTextField textoVagasEspeciais = null;

	private JLabel campoVagasOcupadas = null;

	private JTextField textoVagasOcupadas = null;

	private JLabel campoVagasDisponiveis = null;

	private JTextField textoVagasDisponiveis = null;

	private JButton botaoVoltar = null;

	/**
	 * This is the default constructor
	 */
	public JanelaExibirVagas() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("Exibir Vagas");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {

			campoVagasDisponiveis = new JLabel();
			campoVagasDisponiveis.setBounds(new Rectangle(13, 135, 112, 16));
			campoVagasDisponiveis.setText("Vagas Disponíveis:");
			campoVagasOcupadas = new JLabel();
			campoVagasOcupadas.setBounds(new Rectangle(14, 103, 107, 16));
			campoVagasOcupadas.setText("Vagas Ocupadas:");
			campoQtdVagaEspeciais = new JLabel();
			campoQtdVagaEspeciais.setBounds(new Rectangle(16, 75, 105, 16));
			campoQtdVagaEspeciais.setText("Vagas Especiais:");
			campoQtdVagas = new JLabel();
			campoQtdVagas.setBounds(new Rectangle(15, 45, 90, 16));
			campoQtdVagas.setText("Total de Vagas:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getPanelExibirVagas(), null);
			jContentPane.add(campoQtdVagas, null);
			jContentPane.add(getTextoTotalVagas(), null);
			jContentPane.add(campoQtdVagaEspeciais, null);
			jContentPane.add(getTextoVagasEspeciais(), null);
			jContentPane.add(campoVagasOcupadas, null);
			jContentPane.add(getTextoVagasOcupadas(), null);
			jContentPane.add(campoVagasDisponiveis, null);
			jContentPane.add(getTextoVagasDisponiveis(), null);
			jContentPane.add(getBotaoVoltar(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes panelExibirVagas
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getPanelExibirVagas() {
		if (panelExibirVagas == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			campoExibirVagas = new JLabel();
			campoExibirVagas.setText("Exibir Vagas");
			panelExibirVagas = new JPanel();
			panelExibirVagas.setLayout(new GridBagLayout());
			panelExibirVagas.setBounds(new Rectangle(73, 11, 125, 24));
			panelExibirVagas.add(campoExibirVagas, gridBagConstraints);
		}
		return panelExibirVagas;
	}

	/**
	 * This method initializes textoTotalVagas
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTextoTotalVagas() {
		if (textoTotalVagas == null) {
			textoTotalVagas = new JTextField();
			textoTotalVagas.setBounds(new Rectangle(135, 43, 50, 20));
		}
		return textoTotalVagas;
	}

	/**
	 * This method initializes textoVagasEspeciais
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTextoVagasEspeciais() {
		if (textoVagasEspeciais == null) {
			textoVagasEspeciais = new JTextField();
			textoVagasEspeciais.setBounds(new Rectangle(135, 71, 50, 20));
		}
		return textoVagasEspeciais;
	}

	/**
	 * This method initializes textoVagasOcupadas
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTextoVagasOcupadas() {
		if (textoVagasOcupadas == null) {
			textoVagasOcupadas = new JTextField();
			textoVagasOcupadas.setBounds(new Rectangle(135, 102, 50, 20));
		}
		return textoVagasOcupadas;
	}

	/**
	 * This method initializes textoVagasDisponiveis
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTextoVagasDisponiveis() {
		if (textoVagasDisponiveis == null) {
			textoVagasDisponiveis = new JTextField();
			textoVagasDisponiveis.setBounds(new Rectangle(135, 133, 50, 20));
		}
		return textoVagasDisponiveis;
	}

	/**
	 * This method initializes botaoVoltar
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBotaoVoltar() {
		if (botaoVoltar == null) {
			botaoVoltar = new JButton();
			botaoVoltar.setBounds(new Rectangle(214, 11, 70, 24));
			botaoVoltar.setText("Voltar");
			botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JanelaMenu janMenu = new JanelaMenu();
					janMenu.setVisible(true);
					dispose();
				}
			});
		}
		return botaoVoltar;
	}

}
