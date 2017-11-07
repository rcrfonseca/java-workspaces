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
import java.awt.Dimension;

public class JanelaRegistrarEntrada extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JPanel panelRegistrarEntrada = null;

	private JLabel campoRegistrarEntrada = null;

	private JLabel campoPlaca = null;

	private JLabel campoQtdVagas = null;

	private JTextField textoPlaca = null;

	private JTextField textoQtdVagas = null;

	private JPanel panelMenu = null;

	private JButton botaoRegistrarEntrada = null;

	private JButton botaoLimpar = null;

	private JPanel panelVoltar = null;

	private JButton botaoVoltar = null;

	private JLabel campoHorarioEntrada = null;

	private JTextField textoHorarioEntrada = null;

	/**
	 * This is the default constructor
	 */
	public JanelaRegistrarEntrada() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 265);
		this.setContentPane(getJContentPane());
		this.setTitle("Registar Entrada");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			campoHorarioEntrada = new JLabel();
			campoHorarioEntrada.setBounds(new Rectangle(18, 59, 117, 16));
			campoHorarioEntrada.setText("Horário de Entrada:");
			campoQtdVagas = new JLabel();
			campoQtdVagas.setBounds(new Rectangle(12, 151, 184, 16));
			campoQtdVagas.setText("Quantidade de vagas restantes:");
			campoPlaca = new JLabel();
			campoPlaca.setBounds(new Rectangle(15, 106, 38, 16));
			campoPlaca.setText("Placa:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getPanelRegistrarEntrada(), null);
			jContentPane.add(campoPlaca, null);
			jContentPane.add(campoQtdVagas, null);
			jContentPane.add(getTextoPlaca(), null);
			jContentPane.add(getTextoQtdVagas(), null);
			jContentPane.add(getPanelMenu(), null);
			jContentPane.add(getPanelVoltar(), null);
			jContentPane.add(campoHorarioEntrada, null);
			jContentPane.add(getTextoHorarioEntrada(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes panelRegistrarEntrada	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanelRegistrarEntrada() {
		if (panelRegistrarEntrada == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			campoRegistrarEntrada = new JLabel();
			campoRegistrarEntrada.setText("Registrar Entrada");
			panelRegistrarEntrada = new JPanel();
			panelRegistrarEntrada.setLayout(new GridBagLayout());
			panelRegistrarEntrada.setBounds(new Rectangle(70, 14, 155, 20));
			panelRegistrarEntrada.add(campoRegistrarEntrada, gridBagConstraints);
		}
		return panelRegistrarEntrada;
	}

	/**
	 * This method initializes textoPlaca	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoPlaca() {
		if (textoPlaca == null) {
			textoPlaca = new JTextField();
			textoPlaca.setBounds(new Rectangle(63, 104, 78, 20));
		}
		return textoPlaca;
	}

	/**
	 * This method initializes textoQtdVagas	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoQtdVagas() {
		if (textoQtdVagas == null) {
			textoQtdVagas = new JTextField();
			textoQtdVagas.setBounds(new Rectangle(213, 150, 52, 20));
		}
		return textoQtdVagas;
	}

	/**
	 * This method initializes panelMenu	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanelMenu() {
		if (panelMenu == null) {
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 1;
			gridBagConstraints2.gridy = 0;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.gridy = 0;
			panelMenu = new JPanel();
			panelMenu.setLayout(new GridBagLayout());
			panelMenu.setBounds(new Rectangle(5, 200, 184, 31));
			panelMenu.add(getBotaoRegistrarEntrada(), gridBagConstraints1);
			panelMenu.add(getBotaoLimpar(), gridBagConstraints2);
		}
		return panelMenu;
	}

	/**
	 * This method initializes botaoRegistrarEntrada	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBotaoRegistrarEntrada() {
		if (botaoRegistrarEntrada == null) {
			botaoRegistrarEntrada = new JButton();
			botaoRegistrarEntrada.setText("Registrar");
		}
		return botaoRegistrarEntrada;
	}

	/**
	 * This method initializes botaoLimpar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBotaoLimpar() {
		if (botaoLimpar == null) {
			botaoLimpar = new JButton();
			botaoLimpar.setText("Limpar");
			botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					textoHorarioEntrada.setText("");
					textoPlaca.setText("");
					textoQtdVagas.setText("");
				}
			});
		}
		return botaoLimpar;
	}

	/**
	 * This method initializes panelVoltar	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanelVoltar() {
		if (panelVoltar == null) {
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 0;
			gridBagConstraints3.gridy = 0;
			panelVoltar = new JPanel();
			panelVoltar.setLayout(new GridBagLayout());
			panelVoltar.setBounds(new Rectangle(197, 200, 87, 33));
			panelVoltar.add(getBotaoVoltar(), gridBagConstraints3);
		}
		return panelVoltar;
	}

	/**
	 * This method initializes botaoVoltar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBotaoVoltar() {
		if (botaoVoltar == null) {
			botaoVoltar = new JButton();
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

	/**
	 * This method initializes textoHorarioEntrada	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoHorarioEntrada() {
		if (textoHorarioEntrada == null) {
			textoHorarioEntrada = new JTextField();
			textoHorarioEntrada.setBounds(new Rectangle(151, 58, 107, 20));
		}
		return textoHorarioEntrada;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
