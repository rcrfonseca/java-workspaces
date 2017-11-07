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

public class JanelaRegistrarSaida extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JPanel panelRegistrarSaida = null;

	private JLabel campoRegistrarSaida = null;

	private JLabel campoHorarioEntrada = null;

	private JLabel campoPlaca = null;

	private JTextField textoPlaca = null;

	private JButton botaoConsultar = null;

	private JTextField textoHorarioEntrada = null;

	private JTextField textoHorarioSaida = null;

	private JLabel campoHorarioSaida = null;

	private JLabel campoValor = null;

	private JTextField textoValor = null;

	private JPanel panelMenu = null;

	private JButton botaoRegistrar = null;

	private JButton botaoLimpar = null;

	private JPanel panelVoltar = null;

	private JButton botaoVoltar = null;

	/**
	 * This is the default constructor
	 */
	public JanelaRegistrarSaida() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 248);
		this.setContentPane(getJContentPane());
		this.setTitle("Registrar Saída");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			campoValor = new JLabel();
			campoValor.setBounds(new Rectangle(14, 138, 38, 16));
			campoValor.setText("Valor:");
			campoHorarioSaida = new JLabel();
			campoHorarioSaida.setBounds(new Rectangle(14, 108, 85, 16));
			campoHorarioSaida.setText("Horário Saída:");
			campoPlaca = new JLabel();
			campoPlaca.setBounds(new Rectangle(16, 48, 42, 16));
			campoPlaca.setText("Placa:");
			campoHorarioEntrada = new JLabel();
			campoHorarioEntrada.setBounds(new Rectangle(15, 77, 97, 16));
			campoHorarioEntrada.setText("Horário Entrada:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getPanelRegistrarSaida(), null);
			jContentPane.add(campoHorarioEntrada, null);
			jContentPane.add(campoPlaca, null);
			jContentPane.add(getTextoPlaca(), null);
			jContentPane.add(getBotaoConsultar(), null);
			jContentPane.add(getTextoHorarioEntrada(), null);
			jContentPane.add(getTextoHorarioSaida(), null);
			jContentPane.add(campoHorarioSaida, null);
			jContentPane.add(campoValor, null);
			jContentPane.add(getTextoValor(), null);
			jContentPane.add(getPanelMenu(), null);
			jContentPane.add(getPanelVoltar(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes panelRegistrarSaida	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanelRegistrarSaida() {
		if (panelRegistrarSaida == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			campoRegistrarSaida = new JLabel();
			campoRegistrarSaida.setText("Registrar Saída");
			panelRegistrarSaida = new JPanel();
			panelRegistrarSaida.setLayout(new GridBagLayout());
			panelRegistrarSaida.setBounds(new Rectangle(70, 7, 144, 24));
			panelRegistrarSaida.add(campoRegistrarSaida, gridBagConstraints);
		}
		return panelRegistrarSaida;
	}

	/**
	 * This method initializes textoPlaca	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoPlaca() {
		if (textoPlaca == null) {
			textoPlaca = new JTextField();
			textoPlaca.setBounds(new Rectangle(67, 44, 97, 20));
		}
		return textoPlaca;
	}

	/**
	 * This method initializes botaoConsultar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBotaoConsultar() {
		if (botaoConsultar == null) {
			botaoConsultar = new JButton();
			botaoConsultar.setBounds(new Rectangle(193, 45, 92, 18));
			botaoConsultar.setText("Consultar");
		}
		return botaoConsultar;
	}

	/**
	 * This method initializes textoHorarioEntrada	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoHorarioEntrada() {
		if (textoHorarioEntrada == null) {
			textoHorarioEntrada = new JTextField();
			textoHorarioEntrada.setBounds(new Rectangle(123, 72, 91, 20));
		}
		return textoHorarioEntrada;
	}

	/**
	 * This method initializes textoHorarioSaida	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoHorarioSaida() {
		if (textoHorarioSaida == null) {
			textoHorarioSaida = new JTextField();
			textoHorarioSaida.setBounds(new Rectangle(123, 107, 90, 20));
		}
		return textoHorarioSaida;
	}

	/**
	 * This method initializes textoValor	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoValor() {
		if (textoValor == null) {
			textoValor = new JTextField();
			textoValor.setBounds(new Rectangle(60, 135, 62, 20));
		}
		return textoValor;
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
			panelMenu.setBounds(new Rectangle(6, 181, 181, 30));
			panelMenu.add(getBotaoRegistrar(), gridBagConstraints1);
			panelMenu.add(getBotaoLimpar(), gridBagConstraints2);
		}
		return panelMenu;
	}

	/**
	 * This method initializes botaoRegistrar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBotaoRegistrar() {
		if (botaoRegistrar == null) {
			botaoRegistrar = new JButton();
			botaoRegistrar.setText("Registrar");
		}
		return botaoRegistrar;
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
					textoPlaca.setText("");
					textoHorarioEntrada.setText("");
					textoHorarioSaida.setText("");
					textoValor.setText("");
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
			panelVoltar.setBounds(new Rectangle(206, 182, 78, 28));
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

}  //  @jve:decl-index=0:visual-constraint="10,10"
