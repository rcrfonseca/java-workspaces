package face;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class JanelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JLabel campoNome = null;

	private JLabel campoSenha = null;

	private JTextField textoNome = null;

	private JPasswordField passSenha = null;

	private JButton botaoEntrar = null;

	private JButton botaoApagar = null;

	/**
	 * This is the default constructor
	 */
	public JanelaLogin() {
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
		this.setTitle("Tela de login");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			campoSenha = new JLabel();
			campoSenha.setBounds(new Rectangle(47, 90, 60, 16));
			campoSenha.setText("Senha:");
			campoNome = new JLabel();
			campoNome.setBounds(new Rectangle(47, 46, 56, 16));
			campoNome.setText("Nome:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(campoNome, null);
			jContentPane.add(campoSenha, null);
			jContentPane.add(getTextoNome(), null);
			jContentPane.add(getPassSenha(), null);
			jContentPane.add(getBotaoEntrar(), null);
			jContentPane.add(getBotaoApagar(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes textoNome
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTextoNome() {
		if (textoNome == null) {
			textoNome = new JTextField();
			textoNome.setBounds(new Rectangle(135, 44, 122, 20));
		}
		return textoNome;
	}

	/**
	 * This method initializes passSenha
	 * 
	 * @return javax.swing.JPasswordField
	 */
	private JPasswordField getPassSenha() {
		if (passSenha == null) {
			passSenha = new JPasswordField();
			passSenha.setBounds(new Rectangle(135, 89, 122, 20));
		}
		return passSenha;
	}

	/**
	 * This method initializes botaoEntrar
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBotaoEntrar() {
		if (botaoEntrar == null) {
			botaoEntrar = new JButton();
			botaoEntrar.setBounds(new Rectangle(45, 135, 76, 31));
			botaoEntrar.setText("Entrar");
			botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JanelaMenu janMenu = new JanelaMenu();
					janMenu.setVisible(true);
					dispose();

				}

			});

		}
		return botaoEntrar;
	}

	/**
	 * This method initializes botaoApagar
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBotaoApagar() {
		if (botaoApagar == null) {
			botaoApagar = new JButton();
			botaoApagar.setBounds(new Rectangle(182, 134, 89, 32));
			botaoApagar.setText("Apagar");
			botaoApagar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					textoNome.setText("");
					passSenha.setText("");
				}
			});
		}
		return botaoApagar;
	}

}
