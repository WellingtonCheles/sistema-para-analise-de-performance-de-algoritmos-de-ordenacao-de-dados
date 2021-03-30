package visao;


//Classe responsavel pela barra de ferramentas.


import java.awt.event.ActionListener;




import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class UIBarraFerramentas extends JToolBar {
	
	//Criando um objeto de referência de instância (Padrão Singleton)
	
	private static UIBarraFerramentas refInstancia = null;

	
	private JButton btnOrdenar;
	private JButton btnSobre;
	
	
	private UIBarraFerramentas() {
		
		
		
		btnOrdenar = new JButton("Ordenar");
		btnOrdenar.setActionCommand("FUNC_ORDENAR_TEMPERATURA");
		btnOrdenar.setIcon(new ImageIcon(UIBarraFerramentas.class.getResource("imagens/32x32/iconordenar32.png")));
		btnOrdenar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnOrdenar.setVerticalTextPosition(SwingConstants.BOTTOM);

		btnSobre = new JButton("Sobre");
		btnSobre.setActionCommand("FUNC_SOBRE");		
		btnSobre.setIcon(new ImageIcon(UIBarraFerramentas.class.getResource("imagens/32x32/iconsobre32.png")));
		btnSobre.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSobre.setVerticalTextPosition(SwingConstants.BOTTOM);
		
	
		this.add(btnOrdenar);
		this.add(btnSobre);
	}
	
	
	//Método que verefica a existência de uma instância (Padrão Singleton)
	
	public static UIBarraFerramentas getInstance() {
		if (refInstancia == null)
			refInstancia = new UIBarraFerramentas();
		return refInstancia;
	}
	
	//Método que gera ação dos componentes.
	
	public void setListener(ActionListener actionListener) {
		
		btnOrdenar.addActionListener(actionListener);
		btnSobre.addActionListener(actionListener);
	}
}
