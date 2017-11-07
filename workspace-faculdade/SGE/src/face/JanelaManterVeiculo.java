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

public class JanelaManterVeiculo extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JPanel panelManterVeiculo = null;

	private JLabel campoManterVeiculo = null;

	private JLabel campoPlaca = null;

	private JTextField textoPlaca = null;

	private JLabel campoModelo = null;

	private JTextField textoModelo = null;

	private JLabel campoCor = null;

	private JTextField textoCor = null;

	private JButton botaoRegistrar = null;

	private JButton botaoLimpar = null;

	private JButton botaoVoltar = null;

	/**
	 * This is the default constructor
	 */
	public JanelaManterVeiculo() {
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
		this.setTitle("Manter Veículo");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			campoCor = new JLabel();
			campoCor.setBounds(new Rectangle(27, 105, 32, 16));
			campoCor.setText("Cor:");
			campoModelo = new JLabel();
			campoModelo.setBounds(new Rectangle(27, 75, 51, 16));
			campoModelo.setText("Modelo:");
			campoPlaca = new JLabel();
			campoPlaca.setBounds(new Rectangle(27, 47, 38, 16));
			campoPlaca.setText("Placa:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getPanelManterVeiculo(), null);
			jContentPane.add(campoPlaca, null);
			jContentPane.add(getTextoPlaca(), null);
			jContentPane.add(campoModelo, null);
			jContentPane.add(getTextoModelo(), null);
			jContentPane.add(campoCor, null);
			jContentPane.add(getTextoCor(), null);
			jContentPane.add(getBotaoRegistrar(), null);
			jContentPane.add(getBotaoLimpar(), null);
			jContentPane.add(getBotaoVoltar(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes panelManterVeiculo	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanelManterVeiculo() {
		if (panelManterVeiculo == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			campoManterVeiculo = new JLabel();
			campoManterVeiculo.setText("Manter Veículo");
			panelManterVeiculo = new JPanel();
			panelManterVeiculo.setLayout(new GridBagLayout());
			panelManterVeiculo.setBounds(new Rectangle(86, 14, 125, 18));
			panelManterVeiculo.add(campoManterVeiculo, gridBagConstraints);
		}
		return panelManterVeiculo;
	}

	/**
	 * This method initializes textoPlaca	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoPlaca() {
		if (textoPlaca == null) {
			textoPlaca = new JTextField();
			textoPlaca.setBounds(new Rectangle(91, 42, 96, 20));
		}
		return textoPlaca;
	}

	/**
	 * This method initializes textoModelo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoModelo() {
		if (textoModelo == null) {
			textoModelo = new JTextField();
			textoModelo.setBounds(new Rectangle(91, 74, 165, 20));
		}
		return textoModelo;
	}

	/**
	 * This method initializes textoCor	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoCor() {
		if (textoCor == null) {
			textoCor = new JTextField();
			textoCor.setBounds(new Rectangle(91, 105, 96, 20));
		}
		return textoCor;
	}

	/**
	 * This method initializes botaoRegistrar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBotaoRegistrar() {
		if (botaoRegistrar == null) {
			botaoRegistrar = new JButton();
			botaoRegistrar.setBounds(new Rectangle(8, 136, 91, 23));
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
			botaoLimpar.setBounds(new Rectangle(115, 136, 76, 23));
			botaoLimpar.setText("Limpar");
			botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					textoPlaca.setText("");
					textoModelo.setText("");
					textoCor.setText("");
				}
			});
		}
		return botaoLimpar;
	}

	/**
	 * This method initializes botaoVoltar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBotaoVoltar() {
		if (botaoVoltar == null) {
			botaoVoltar = new JButton();
			botaoVoltar.setBounds(new Rectangle(202, 136, 71, 23));
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
