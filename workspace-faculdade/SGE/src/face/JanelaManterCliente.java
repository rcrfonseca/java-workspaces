package face;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JTree;
import javax.swing.JProgressBar;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import java.awt.List;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;

public class JanelaManterCliente extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JPanel panelManterCliente = null;

	private JLabel campoManterCliente = null;

	private JLabel campoCodigo = null;

	private JTextField textoCodigo = null;

	private JLabel campoSituacao = null;

	private JRadioButton radioBloqueado = null;

	private JLabel campoBloqueado = null;

	private JRadioButton radioOK = null;

	private JLabel OK = null;

	private JLabel campoNome = null;

	private JTextField textoNome = null;

	private JLabel campoCPF = null;

	private JTextField textoCPF = null;

	private JLabel campoDTCadastro = null;

	private JTextField textoDTCadastro = null;

	private JLabel campoLogradouro = null;

	private JTextField textoLogradouro = null;

	private JLabel campoBairro = null;

	private JTextField textoBairro = null;

	private JLabel campoCidade = null;

	private JTextField textoCidade = null;

	private JLabel campoNum = null;

	private JTextField textoNumero = null;

	private JLabel campoComplemento = null;

	private JTextField textoComplemento = null;

	private JLabel campoUF = null;

	private JTextField textoUF = null;

	private JPanel panelMenu = null;

	private JButton botaoIncluir = null;

	private JButton botaoAlterar = null;

	private JButton botaoExcluir = null;

	private JButton botaoConsultar = null;

	private JButton botaoVoltar = null;

	/**
	 * This is the default constructor
	 */
	public JanelaManterCliente() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(551, 456);
		this.setContentPane(getJContentPane());
		this.setTitle("Manter Cliente");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			campoUF = new JLabel();
			campoUF.setBounds(new Rectangle(477, 196, 25, 16));
			campoUF.setText("UF:");
			campoComplemento = new JLabel();
			campoComplemento.setBounds(new Rectangle(361, 197, 90, 16));
			campoComplemento.setText("Complemento:");
			campoNum = new JLabel();
			campoNum.setBounds(new Rectangle(275, 196, 56, 16));
			campoNum.setText("Número:");
			campoCidade = new JLabel();
			campoCidade.setBounds(new Rectangle(20, 306, 50, 16));
			campoCidade.setText("Cidade:");
			campoBairro = new JLabel();
			campoBairro.setBounds(new Rectangle(19, 256, 47, 16));
			campoBairro.setText("Bairro:");
			campoLogradouro = new JLabel();
			campoLogradouro.setBounds(new Rectangle(21, 197, 78, 16));
			campoLogradouro.setText("Logradouro:");
			campoDTCadastro = new JLabel();
			campoDTCadastro.setBounds(new Rectangle(394, 76, 107, 16));
			campoDTCadastro.setText("Data de cadastro:");
			campoCPF = new JLabel();
			campoCPF.setBounds(new Rectangle(21, 144, 38, 16));
			campoCPF.setText("CPF:");
			campoNome = new JLabel();
			campoNome.setBounds(new Rectangle(20, 90, 38, 16));
			campoNome.setText("Nome:");
			OK = new JLabel();
			OK.setBounds(new Rectangle(456, 41, 25, 16));
			OK.setText("OK");
			campoBloqueado = new JLabel();
			campoBloqueado.setBounds(new Rectangle(341, 40, 64, 16));
			campoBloqueado.setText("Bloqueado");
			campoSituacao = new JLabel();
			campoSituacao.setBounds(new Rectangle(251, 40, 60, 16));
			campoSituacao.setText("Situação:");
			campoCodigo = new JLabel();
			campoCodigo.setBounds(new Rectangle(22, 38, 48, 16));
			campoCodigo.setText("Código:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getPanelManterCliente(), null);
			jContentPane.add(campoCodigo, null);
			jContentPane.add(getTextoCodigo(), null);
			jContentPane.add(campoSituacao, null);
			jContentPane.add(getRadioBloqueado(), null);
			jContentPane.add(campoBloqueado, null);
			jContentPane.add(getRadioOK(), null);
			jContentPane.add(OK, null);
			jContentPane.add(campoNome, null);
			jContentPane.add(getTextoNome(), null);
			jContentPane.add(campoCPF, null);
			jContentPane.add(getTextoCPF(), null);
			jContentPane.add(campoDTCadastro, null);
			jContentPane.add(getTextoDTCadastro(), null);
			jContentPane.add(campoLogradouro, null);
			jContentPane.add(getTextoLogradouro(), null);
			jContentPane.add(campoBairro, null);
			jContentPane.add(getTextoBairro(), null);
			jContentPane.add(campoCidade, null);
			jContentPane.add(getTextoCidade(), null);
			jContentPane.add(campoNum, null);
			jContentPane.add(getTextoNumero(), null);
			jContentPane.add(campoComplemento, null);
			jContentPane.add(getTextoComplemento(), null);
			jContentPane.add(campoUF, null);
			jContentPane.add(getTextoUF(), null);
			jContentPane.add(getPanelMenu(), null);
			jContentPane.add(getBotaoVoltar(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes panelManterCliente
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getPanelManterCliente() {
		if (panelManterCliente == null) {
			campoManterCliente = new JLabel();
			campoManterCliente.setBounds(new Rectangle(23, 2, 90, 16));
			campoManterCliente.setText("Manter Cliente");
			panelManterCliente = new JPanel();
			panelManterCliente.setLayout(null);
			panelManterCliente.setBounds(new Rectangle(206, 6, 134, 21));
			panelManterCliente.add(campoManterCliente, null);
		}
		return panelManterCliente;
	}

	/**
	 * This method initializes textoCodigo
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTextoCodigo() {
		if (textoCodigo == null) {
			textoCodigo = new JTextField();
			textoCodigo.setBounds(new Rectangle(21, 60, 117, 20));
		}
		return textoCodigo;
	}

	/**
	 * This method initializes radioBloqueado
	 * 
	 * @return javax.swing.JRadioButton
	 */
	private JRadioButton getRadioBloqueado() {
		if (radioBloqueado == null) {
			radioBloqueado = new JRadioButton();
			radioBloqueado.setBounds(new Rectangle(318, 38, 21, 21));
			radioBloqueado.setText("Bloqueado");
		}
		return radioBloqueado;
	}

	/**
	 * This method initializes radioOK
	 * 
	 * @return javax.swing.JRadioButton
	 */
	private JRadioButton getRadioOK() {
		if (radioOK == null) {
			radioOK = new JRadioButton();
			radioOK.setBounds(new Rectangle(426, 39, 21, 21));
			radioOK.setText("OK");
		}
		return radioOK;
	}

	/**
	 * This method initializes textoNome
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTextoNome() {
		if (textoNome == null) {
			textoNome = new JTextField();
			textoNome.setBounds(new Rectangle(20, 112, 234, 20));
		}
		return textoNome;
	}

	/**
	 * This method initializes textoCPF
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTextoCPF() {
		if (textoCPF == null) {
			textoCPF = new JTextField();
			textoCPF.setBounds(new Rectangle(20, 168, 129, 20));
		}
		return textoCPF;
	}

	/**
	 * This method initializes textoDTCadastro
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTextoDTCadastro() {
		if (textoDTCadastro == null) {
			textoDTCadastro = new JTextField();
			textoDTCadastro.setBounds(new Rectangle(394, 98, 129, 20));
		}
		return textoDTCadastro;
	}

	/**
	 * This method initializes textoLogradouro
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTextoLogradouro() {
		if (textoLogradouro == null) {
			textoLogradouro = new JTextField();
			textoLogradouro.setBounds(new Rectangle(20, 224, 236, 20));
		}
		return textoLogradouro;
	}

	/**
	 * This method initializes textoBairro
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTextoBairro() {
		if (textoBairro == null) {
			textoBairro = new JTextField();
			textoBairro.setBounds(new Rectangle(19, 279, 238, 20));
		}
		return textoBairro;
	}

	/**
	 * This method initializes textoCidade
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTextoCidade() {
		if (textoCidade == null) {
			textoCidade = new JTextField();
			textoCidade.setBounds(new Rectangle(19, 327, 237, 20));
		}
		return textoCidade;
	}

	/**
	 * This method initializes textoNumero
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTextoNumero() {
		if (textoNumero == null) {
			textoNumero = new JTextField();
			textoNumero.setBounds(new Rectangle(273, 224, 58, 20));
		}
		return textoNumero;
	}

	/**
	 * This method initializes textoComplemento
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTextoComplemento() {
		if (textoComplemento == null) {
			textoComplemento = new JTextField();
			textoComplemento.setBounds(new Rectangle(359, 224, 91, 20));
		}
		return textoComplemento;
	}

	/**
	 * This method initializes textoUF
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTextoUF() {
		if (textoUF == null) {
			textoUF = new JTextField();
			textoUF.setBounds(new Rectangle(476, 224, 50, 20));
		}
		return textoUF;
	}

	/**
	 * This method initializes panelMenu
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getPanelMenu() {
		if (panelMenu == null) {
			GridLayout gridLayout = new GridLayout();
			gridLayout.setRows(1);
			panelMenu = new JPanel();
			panelMenu.setLayout(gridLayout);
			panelMenu.setBounds(new Rectangle(17, 368, 359, 33));
			panelMenu.add(getBotaoIncluir(), null);
			panelMenu.add(getBotaoAlterar(), null);
			panelMenu.add(getBotaoExcluir(), null);
			panelMenu.add(getBotaoConsultar(), null);
		}
		return panelMenu;
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
			botaoVoltar.setBounds(new Rectangle(444, 368, 81, 32));
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

} // @jve:decl-index=0:visual-constraint="10,10"
