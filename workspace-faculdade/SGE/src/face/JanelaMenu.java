package face;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class JanelaMenu extends JFrame {

	private static final long serialVersionUID = 1L;

	private JMenuBar menuMenuPrincipal = null;

	private JMenu menuManter = null;

	private JMenuItem menuItemUsuario = null;

	private JMenuItem menuItemCliente = null;

	private JMenuItem menuItemVeiculo = null;

	private JMenuItem menuItemParametros = null;

	private JMenu menuRegistrar = null;

	private JMenuItem menuItemEntrada = null;

	private JMenuItem menuItemSaida = null;

	private JMenu menuExibir = null;

	private JMenuItem menuItemVagas = null;

	private JMenu menuGerarRelatorios = null;

	private JMenuItem menuItemFaturamentoDia = null;

	private JMenuItem menuItemFaturamentoSemana = null;

	private JMenuItem menuItemCompararFaturamento = null;

	private JPanel panelMenu = null;

	private JLabel campoNomeSistema = null;

	private JMenu menuOperacoes = null;

	private JMenuItem menuItemVoltarLogin = null;

	private JMenuItem menuItemSair = null;

	/**
	 * This is the default constructor
	 */
	public JanelaMenu() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(398, 249);
		this.setContentPane(getPanelMenu());
		this.setJMenuBar(getMenuMenuPrincipal());
		this.setTitle("Menu Principal ");
	}

	/**
	 * This method initializes menuMenuPrincipal
	 * 
	 * @return javax.swing.JMenuBar
	 */
	private JMenuBar getMenuMenuPrincipal() {
		if (menuMenuPrincipal == null) {
			menuMenuPrincipal = new JMenuBar();
			menuMenuPrincipal.add(getMenuManter());
			menuMenuPrincipal.add(getMenuRegistrar());
			menuMenuPrincipal.add(getMenuExibir());
			menuMenuPrincipal.add(getMenuGerarRelatorios());
			menuMenuPrincipal.add(getMenuOperacoes());
		}
		return menuMenuPrincipal;
	}

	/**
	 * This method initializes menuManter
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getMenuManter() {
		if (menuManter == null) {
			menuManter = new JMenu();
			menuManter.setText("Manter");
			menuManter.add(getMenuItemUsuario());
			menuManter.add(getMenuItemCliente());
			menuManter.add(getMenuItemVeiculo());
			menuManter.add(getMenuItemParametros());
		}
		return menuManter;
	}

	/**
	 * This method initializes menuItemUsuario
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMenuItemUsuario() {
		if (menuItemUsuario == null) {
			menuItemUsuario = new JMenuItem();
			menuItemUsuario.setText("Usuário");
			menuItemUsuario
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							JanelaManterUsuario janManterUsuario = new JanelaManterUsuario();
							janManterUsuario.setVisible(true);
							dispose();
						}
					});
		}
		return menuItemUsuario;
	}

	/**
	 * This method initializes menuItemCliente
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMenuItemCliente() {
		if (menuItemCliente == null) {
			menuItemCliente = new JMenuItem();
			menuItemCliente.setText("Cliente");
			menuItemCliente
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							JanelaManterCliente janManterCliente = new JanelaManterCliente();
							janManterCliente.setVisible(true);
							dispose();
						}
					});
		}
		return menuItemCliente;
	}

	/**
	 * This method initializes menuItemVeiculo
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMenuItemVeiculo() {
		if (menuItemVeiculo == null) {
			menuItemVeiculo = new JMenuItem();
			menuItemVeiculo.setText("Veículo");
			menuItemVeiculo
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							JanelaManterVeiculo janManterVeiculo = new JanelaManterVeiculo();
							janManterVeiculo.setVisible(true);
							dispose();
						}
					});
		}
		return menuItemVeiculo;
	}

	/**
	 * This method initializes menuItemParametros
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMenuItemParametros() {
		if (menuItemParametros == null) {
			menuItemParametros = new JMenuItem();
			menuItemParametros.setText("Parâmetros");
			menuItemParametros
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							JanelaManterParametros janManterParametros = new JanelaManterParametros();
							janManterParametros.setVisible(true);
							dispose();
						}
					});
		}
		return menuItemParametros;
	}

	/**
	 * This method initializes menuRegistrar
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getMenuRegistrar() {
		if (menuRegistrar == null) {
			menuRegistrar = new JMenu();
			menuRegistrar.setText("Registrar");
			menuRegistrar.add(getMenuItemEntrada());
			menuRegistrar.add(getMenuItemSaida());
		}
		return menuRegistrar;
	}

	/**
	 * This method initializes menuItemEntrada
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMenuItemEntrada() {
		if (menuItemEntrada == null) {
			menuItemEntrada = new JMenuItem();
			menuItemEntrada.setText("Entrada");
			menuItemEntrada
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							JanelaRegistrarEntrada janRegistrarEntrada = new JanelaRegistrarEntrada();
							janRegistrarEntrada.setVisible(true);
							dispose();
						}
					});
		}
		return menuItemEntrada;
	}

	/**
	 * This method initializes menuItemSaida
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMenuItemSaida() {
		if (menuItemSaida == null) {
			menuItemSaida = new JMenuItem();
			menuItemSaida.setText("Saída");
			menuItemSaida
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							JanelaRegistrarSaida janRegistrarSaida = new JanelaRegistrarSaida();
							janRegistrarSaida.setVisible(true);
							dispose();
						}
					});
		}
		return menuItemSaida;
	}

	/**
	 * This method initializes menuExibir
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getMenuExibir() {
		if (menuExibir == null) {
			menuExibir = new JMenu();
			menuExibir.setText("Exibir");
			menuExibir.add(getMenuItemVagas());
		}
		return menuExibir;
	}

	/**
	 * This method initializes menuItemVagas
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMenuItemVagas() {
		if (menuItemVagas == null) {
			menuItemVagas = new JMenuItem();
			menuItemVagas.setText("Vagas");
			menuItemVagas
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							JanelaExibirVagas janExibirVagas = new JanelaExibirVagas();
							janExibirVagas.setVisible(true);
							dispose();
						}
					});
		}
		return menuItemVagas;
	}

	/**
	 * This method initializes menuGerarRelatorios
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getMenuGerarRelatorios() {
		if (menuGerarRelatorios == null) {
			menuGerarRelatorios = new JMenu();
			menuGerarRelatorios.setText("Gerar Relatórios");
			menuGerarRelatorios.add(getMenuItemFaturamentoDia());
			menuGerarRelatorios.add(getMenuItemFaturamentoSemana());
			menuGerarRelatorios.add(getMenuItemCompararFaturamento());
		}
		return menuGerarRelatorios;
	}

	/**
	 * This method initializes menuItemFaturamentoDia
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMenuItemFaturamentoDia() {
		if (menuItemFaturamentoDia == null) {
			menuItemFaturamentoDia = new JMenuItem();
			menuItemFaturamentoDia.setText("Faturamento do dia");
		}
		return menuItemFaturamentoDia;
	}

	/**
	 * This method initializes menuItemFaturamentoSemana
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMenuItemFaturamentoSemana() {
		if (menuItemFaturamentoSemana == null) {
			menuItemFaturamentoSemana = new JMenuItem();
			menuItemFaturamentoSemana.setText("Faturamento da semana");
		}
		return menuItemFaturamentoSemana;
	}

	/**
	 * This method initializes menuItemCompararFaturamento
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMenuItemCompararFaturamento() {
		if (menuItemCompararFaturamento == null) {
			menuItemCompararFaturamento = new JMenuItem();
			menuItemCompararFaturamento.setText("Comparar faturamento");
		}
		return menuItemCompararFaturamento;
	}

	/**
	 * This method initializes panelMenu
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getPanelMenu() {
		if (panelMenu == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			campoNomeSistema = new JLabel();
			campoNomeSistema.setText("Sistema Gerenciador de estacionamento");
			campoNomeSistema.setName("");
			campoNomeSistema.setFont(new Font("Segoe UI", Font.BOLD, 14));
			panelMenu = new JPanel();
			panelMenu.setLayout(new GridBagLayout());
			panelMenu.add(campoNomeSistema, gridBagConstraints);
		}
		return panelMenu;
	}

	/**
	 * This method initializes menuOperacoes
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getMenuOperacoes() {
		if (menuOperacoes == null) {
			menuOperacoes = new JMenu();
			menuOperacoes.setText("Operações");
			menuOperacoes.add(getMenuItemVoltarLogin());
			menuOperacoes.add(getMenuItemSair());
		}
		return menuOperacoes;
	}

	/**
	 * This method initializes menuItemVoltarLogin
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMenuItemVoltarLogin() {
		if (menuItemVoltarLogin == null) {
			menuItemVoltarLogin = new JMenuItem();
			menuItemVoltarLogin.setText("Voltar ao login");
			menuItemVoltarLogin
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							JanelaLogin janLogin = new JanelaLogin();
							janLogin.setVisible(true);
							dispose();
						}
					});
		}
		return menuItemVoltarLogin;
	}

	/**
	 * This method initializes menuItemSair
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMenuItemSair() {
		if (menuItemSair == null) {
			menuItemSair = new JMenuItem();
			menuItemSair.setText("Sair do sistema");
			menuItemSair.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.exit(0);
				}
			});
		}
		return menuItemSair;
	}

} // @jve:decl-index=0:visual-constraint="10,10"
