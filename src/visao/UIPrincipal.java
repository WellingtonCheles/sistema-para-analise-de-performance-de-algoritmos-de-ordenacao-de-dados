package visao;

//Classe Principal respons�vel pela reconfigura��o da janela

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import controle.ControleTempUI;

@SuppressWarnings("serial")
public class UIPrincipal extends JFrame implements WindowListener {

	public static final int MODO_TELA_VAZIA = 0;
	public static final int MODO_ORDENAR = 1;

	private JMenuItem miOrdenar;
	private JMenuItem miSobre;

	@SuppressWarnings("rawtypes")

	private UIDados painelDados;

	private UICtrl painelControle;

	private ControleTempUI controle;

	
	 
//	 Construtor padr�o. Respons�vel pela inicializa��o completa da interface
//	 gr�fica.
	 
	public UIPrincipal() {

		// propriedades da janela
		
		this.setTitle("Ordena��o de Temperatura");
		this.setSize(560, 280);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.addWindowListener(this);

		// Constru��o dos menus
		
		JMenu mNavegar = new JMenu();
		mNavegar.setText("Navegar");
		mNavegar.setMnemonic('N');


		miOrdenar = new JMenuItem("Ordenar");
		miOrdenar.setToolTipText("Ordenar Temperatura");
		miOrdenar.setMnemonic('R');
		miOrdenar.setActionCommand("FUNC_ORDENAR_TEMPERATURA");
		mNavegar.add(miOrdenar);

		JMenu mOutros = new JMenu();
		mOutros.setText("Outros");
		mOutros.setMnemonic('O');


		JMenuBar barraMenus = new JMenuBar();
		barraMenus.add(mNavegar);
		barraMenus.add(mOutros);
		this.setJMenuBar(barraMenus);
		
		miSobre = new JMenuItem("Sobre");
		miSobre.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(rootPane,
								"Esta aplica��o foi desenvolvida pelos alunos Gabriel, Jo�o e Wellington\n"
										+ "do 4� periodo do curso de Ci�ncia da Computa��o.\n"
										+ "O objetivo � aplicar m�todos de ordena��o de dados,\n"
										+ "afim de comparar o desempenho entres eles.\n",
								"Sobre", JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(UIPrincipal.class.getResource("imagens/32x32/iconsobre32.png")));
					}
				});
		mOutros.add(miSobre);

		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(UIBarraFerramentas.getInstance(), BorderLayout.NORTH);
	}

	
//		M�todo para reconfigura��o da janela principal, ajustando os componentes
//		gr�ficos necess�rio a cada modo de opera��o.
	 
	public void configure(int modo) {
		this.getContentPane().removeAll();
		switch (modo) {
		case MODO_TELA_VAZIA:
			
			painelDados = null;
			painelControle = null;
			break;
		
		case MODO_ORDENAR:

			painelDados = null;
			painelControle = UIBtnOrdenar.getInstance();
			

		}
		this.getContentPane().add(UIBarraFerramentas.getInstance(), BorderLayout.NORTH);
		if (painelDados != null) {
			this.getContentPane().add(painelDados, BorderLayout.CENTER);
		}
		if (painelControle != null) {
			this.getContentPane().add(painelControle, BorderLayout.SOUTH);
			painelControle.setListener(controle);
		}
		this.getContentPane().validate();
		this.getContentPane().repaint();
	}

	
	
	//M�todo que gera a��o dos componentes.
	
	public void setListener(ActionListener actionListener) {
		this.controle = (ControleTempUI) actionListener;
		miOrdenar.addActionListener(controle);
		miSobre.addActionListener(controle);
		UIBarraFerramentas.getInstance().setListener(controle);
	}

	@SuppressWarnings("rawtypes")
	public UIDados getPainelDados() {
		return painelDados;
	}

	// M�todos de callback para WindowEvent
	
	@Override
	public void windowClosing(WindowEvent e) {
		int resp = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente fechar o programa?",
				"Encerrar execu��o", JOptionPane.YES_NO_OPTION);
		if (resp == JOptionPane.YES_OPTION)
			System.exit(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

}
