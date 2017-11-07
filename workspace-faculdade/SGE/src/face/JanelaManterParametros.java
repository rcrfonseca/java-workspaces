package face;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JTextField;

public class JanelaManterParametros extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JPanel panelManterParametros = null;

	private JLabel campoManterParametros = null;

	private JPanel panelMenuParametros = null;

	private JButton botaoIncluir = null;

	private JButton botaoAlterar = null;

	private JButton botaoExcluir = null;

	private JButton botaoConsultar = null;

	private JButton botaoVoltar = null;

	private JLabel campoValorHora = null;

	private JTextField textoValorHora = null;

	private JLabel campoValorDiaria = null;

	private JTextField textoValorDiaria = null;

	private JLabel campoValorMensalidade = null;

	private JTextField textoValorMensalidade = null;

	private JLabel campoQtdVagas = null;

	private JTextField textoQtdVagas = null;

	private JLabel campoQtdVagasEspeciais = null;

	private JTextField textoQtdVagasEspeciais = null;

	private JPanel panelVoltar = null;

	/**
	 * This is the default constructor
	 */
	public JanelaManterParametros() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(679, 277);
		this.setContentPane(getJContentPane());
		this.setTitle("Manter Parâmetros");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			campoQtdVagasEspeciais = new JLabel();
			campoQtdVagasEspeciais.setBounds(new Rectangle(73, 181, 185, 16));
			campoQtdVagasEspeciais.setText("Quantidade de vagas especiais:");
			campoQtdVagas = new JLabel();
			campoQtdVagas.setBounds(new Rectangle(74, 151, 153, 16));
			campoQtdVagas.setText("Quantidade de vagas total:");
			campoValorMensalidade = new JLabel();
			campoValorMensalidade.setBounds(new Rectangle(407, 104, 135, 16));
			campoValorMensalidade.setText("Valor da mensalidade:");
			campoValorDiaria = new JLabel();
			campoValorDiaria.setBounds(new Rectangle(211, 105, 89, 16));
			campoValorDiaria.setText("Valor da diária:");
			campoValorHora = new JLabel();
			campoValorHora.setBounds(new Rectangle(21, 105, 87, 17));
			campoValorHora.setText("Valor da Hora:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getPanelManterParametros(), null);
			jContentPane.add(getPanelMenuParametros(), null);
			jContentPane.add(campoValorHora, null);
			jContentPane.add(getTextoValorHora(), null);
			jContentPane.add(campoValorDiaria, null);
			jContentPane.add(getTextoValorDiaria(), null);
			jContentPane.add(campoValorMensalidade, null);
			jContentPane.add(getTextoValorMensalidade(), null);
			jContentPane.add(campoQtdVagas, null);
			jContentPane.add(getTextoQtdVagas(), null);
			jContentPane.add(campoQtdVagasEspeciais, null);
			jContentPane.add(getTextoQtdVagasEspeciais(), null);
			jContentPane.add(getPanelVoltar(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes panelManterParametros	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanelManterParametros() {
		if (panelManterParametros == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			campoManterParametros = new JLabel();
			campoManterParametros.setText("Manter Parâmetros");
			panelManterParametros = new JPanel();
			panelManterParametros.setLayout(new GridBagLayout());
			panelManterParametros.setBounds(new Rectangle(15, 11, 642, 21));
			panelManterParametros.add(campoManterParametros, gridBagConstraints);
		}
		return panelManterParametros;
	}

	/**
	 * This method initializes panelMenuParametros	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanelMenuParametros() {
		if (panelMenuParametros == null) {
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridx = 3;
			gridBagConstraints4.gridy = 0;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 2;
			gridBagConstraints3.gridy = 0;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 1;
			gridBagConstraints2.gridy = 0;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.gridy = 0;
			panelMenuParametros = new JPanel();
			panelMenuParametros.setLayout(new GridBagLayout());
			panelMenuParametros.setBounds(new Rectangle(12, 57, 379, 31));
			panelMenuParametros.add(getBotaoIncluir(), gridBagConstraints1);
			panelMenuParametros.add(getBotaoAlterar(), gridBagConstraints2);
			panelMenuParametros.add(getBotaoExcluir(), gridBagConstraints3);
			panelMenuParametros.add(getBotaoConsultar(), gridBagConstraints4);
		}
		return panelMenuParametros;
	}

	/**
	 * This method initializes botaoIncluir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBotaoIncluir() {
		if (botaoIncluir == null) {
			botaoIncluir = new JButton();
			botaoIncluir.setText("Incluir");
		}
		return botaoIncluir;
	}

	/**
	 * This method initializes botaoAlterar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBotaoAlterar() {
		if (botaoAlterar == null) {
			botaoAlterar = new JButton();
			botaoAlterar.setText("Alterar");
		}
		return botaoAlterar;
	}

	/**
	 * This method initializes botaoExcluir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBotaoExcluir() {
		if (botaoExcluir == null) {
			botaoExcluir = new JButton();
			botaoExcluir.setText("Excluir");
		}
		return botaoExcluir;
	}

	/**
	 * This method initializes botaoConsultar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBotaoConsultar() {
		if (botaoConsultar == null) {
			botaoConsultar = new JButton();
			botaoConsultar.setText("Consultar");
		}
		return botaoConsultar;
	}

	/**
	 * This method initializes botaoVoltar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBotaoVoltar() {
		if (botaoVoltar == null) {
			botaoVoltar = new JButton();
			botaoVoltar.setText("Voltar ao Menu");
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

	/**
	 * This method initializes textoValorHora	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoValorHora() {
		if (textoValorHora == null) {
			textoValorHora = new JTextField();
			textoValorHora.setBounds(new Rectangle(121, 103, 63, 20));
		}
		return textoValorHora;
	}

	/**
	 * This method initializes textoValorDiaria	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoValorDiaria() {
		if (textoValorDiaria == null) {
			textoValorDiaria = new JTextField();
			textoValorDiaria.setBounds(new Rectangle(317, 104, 59, 20));
		}
		return textoValorDiaria;
	}

	/**
	 * This method initializes textoValorMensalidade	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoValorMensalidade() {
		if (textoValorMensalidade == null) {
			textoValorMensalidade = new JTextField();
			textoValorMensalidade.setBounds(new Rectangle(556, 104, 64, 20));
		}
		return textoValorMensalidade;
	}

	/**
	 * This method initializes textoQtdVagas	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoQtdVagas() {
		if (textoQtdVagas == null) {
			textoQtdVagas = new JTextField();
			textoQtdVagas.setBounds(new Rectangle(272, 151, 44, 20));
		}
		return textoQtdVagas;
	}

	/**
	 * This method initializes textoQtdVagasEspeciais	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoQtdVagasEspeciais() {
		if (textoQtdVagasEspeciais == null) {
			textoQtdVagasEspeciais = new JTextField();
			textoQtdVagasEspeciais.setBounds(new Rectangle(272, 179, 46, 20));
		}
		return textoQtdVagasEspeciais;
	}

	/**
	 * This method initializes panelVoltar	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanelVoltar() {
		if (panelVoltar == null) {
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.gridx = 0;
			gridBagConstraints5.gridy = 0;
			panelVoltar = new JPanel();
			panelVoltar.setLayout(new GridBagLayout());
			panelVoltar.setBounds(new Rectangle(485, 57, 158, 34));
			panelVoltar.add(getBotaoVoltar(), gridBagConstraints5);
		}
		return panelVoltar;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
