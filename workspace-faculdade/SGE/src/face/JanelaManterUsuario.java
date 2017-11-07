package face;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;

public class JanelaManterUsuario extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JPanel panelManterUsuario = null;

	private JLabel campoManterUsuario = null;

	private JLabel campoCodigo = null;

	private JPanel panelMenu = null;

	private JButton botaoRegistrar = null;

	private JButton botaoAlterar = null;

	private JButton botaoConsultar = null;

	private JButton botaoExcluir = null;

	private JPanel panelVoltar = null;

	private JButton botaoVoltar = null;

	private JTextField textoCodigo = null;

	private JLabel campoDescricao = null;

	private JTextPane textPaneDescricao = null;

	private JRadioButton radioTipoFuncionario = null;

	private JLabel campoAtendente = null;

	private JRadioButton radioGerente = null;

	private JLabel campoGerente = null;

	private JLabel campoLogin = null;

	private JTextField textoLogin = null;

	private JLabel campoSenha = null;

	private JTextField textoSenha = null;

	/**
	 * This is the default constructor
	 */
	public JanelaManterUsuario() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(564, 238);
		this.setContentPane(getJContentPane());
		this.setTitle("Manter Usuário");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			campoSenha = new JLabel();
			campoSenha.setBounds(new Rectangle(195, 181, 46, 16));
			campoSenha.setText("Senha:");
			campoLogin = new JLabel();
			campoLogin.setBounds(new Rectangle(25, 182, 38, 16));
			campoLogin.setText("Login:");
			campoGerente = new JLabel();
			campoGerente.setBounds(new Rectangle(338, 89, 53, 16));
			campoGerente.setText("Gerente");
			campoAtendente = new JLabel();
			campoAtendente.setBounds(new Rectangle(236, 89, 64, 16));
			campoAtendente.setText("Atendente");
			campoDescricao = new JLabel();
			campoDescricao.setBounds(new Rectangle(17, 120, 71, 16));
			campoDescricao.setText("Descrição:");
			campoCodigo = new JLabel();
			campoCodigo.setBounds(new Rectangle(18, 88, 49, 16));
			campoCodigo.setText("Código:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getPanelManterUsuario(), null);
			jContentPane.add(campoCodigo, null);
			jContentPane.add(getPanelMenu(), null);
			jContentPane.add(getPanelVoltar(), null);
			jContentPane.add(getTextoCodigo(), null);
			jContentPane.add(campoDescricao, null);
			jContentPane.add(getTextPaneDescricao(), null);
			jContentPane.add(getRadioTipoFuncionario(), null);
			jContentPane.add(campoAtendente, null);
			jContentPane.add(getRadioGerente(), null);
			jContentPane.add(campoGerente, null);
			jContentPane.add(campoLogin, null);
			jContentPane.add(getTextoLogin(), null);
			jContentPane.add(campoSenha, null);
			jContentPane.add(getTextoSenha(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes panelManterUsuario	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanelManterUsuario() {
		if (panelManterUsuario == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			campoManterUsuario = new JLabel();
			campoManterUsuario.setText("Manter Usuário");
			panelManterUsuario = new JPanel();
			panelManterUsuario.setLayout(new GridBagLayout());
			panelManterUsuario.setBounds(new Rectangle(208, 9, 108, 24));
			panelManterUsuario.add(campoManterUsuario, gridBagConstraints);
		}
		return panelManterUsuario;
	}

	/**
	 * This method initializes panelMenu	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanelMenu() {
		if (panelMenu == null) {
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
			panelMenu = new JPanel();
			panelMenu.setLayout(new GridBagLayout());
			panelMenu.setBounds(new Rectangle(21, 44, 360, 25));
			panelMenu.add(getBotaoRegistrar(), gridBagConstraints1);
			panelMenu.add(getBotaoAlterar(), gridBagConstraints2);
			panelMenu.add(getBotaoConsultar(), gridBagConstraints3);
			panelMenu.add(getBotaoExcluir(), gridBagConstraints4);
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
			panelVoltar.setBounds(new Rectangle(420, 43, 123, 28));
			panelVoltar.add(getBotaoVoltar(), gridBagConstraints5);
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
			botaoVoltar.setText("Voltar ao menu");
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
	 * This method initializes textoCodigo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoCodigo() {
		if (textoCodigo == null) {
			textoCodigo = new JTextField();
			textoCodigo.setBounds(new Rectangle(90, 88, 77, 20));
		}
		return textoCodigo;
	}

	/**
	 * This method initializes textPaneDescricao	
	 * 	
	 * @return javax.swing.JTextPane	
	 */
	private JTextPane getTextPaneDescricao() {
		if (textPaneDescricao == null) {
			textPaneDescricao = new JTextPane();
			textPaneDescricao.setBounds(new Rectangle(104, 121, 398, 33));
		}
		return textPaneDescricao;
	}

	/**
	 * This method initializes radioTipoFuncionario	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getRadioTipoFuncionario() {
		if (radioTipoFuncionario == null) {
			radioTipoFuncionario = new JRadioButton();
			radioTipoFuncionario.setBounds(new Rectangle(213, 86, 21, 21));
			radioTipoFuncionario.setText("Atendente");
		}
		return radioTipoFuncionario;
	}

	/**
	 * This method initializes radioGerente	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getRadioGerente() {
		if (radioGerente == null) {
			radioGerente = new JRadioButton();
			radioGerente.setBounds(new Rectangle(315, 86, 21, 21));
			radioGerente.setText("Gerente");
		}
		return radioGerente;
	}

	/**
	 * This method initializes textoLogin	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoLogin() {
		if (textoLogin == null) {
			textoLogin = new JTextField();
			textoLogin.setBounds(new Rectangle(247, 179, 105, 20));
		}
		return textoLogin;
	}

	/**
	 * This method initializes textoSenha	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextoSenha() {
		if (textoSenha == null) {
			textoSenha = new JTextField();
			textoSenha.setBounds(new Rectangle(65, 179, 105, 20));
		}
		return textoSenha;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
