package visao;

//Classe abstrata que cont�m m�todo setListener, que ser� dada aos componentes suas devidas a��es 

import java.awt.event.ActionListener;


import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class UICtrl extends JPanel {
	
	public abstract void setListener(ActionListener actionListener); 
}
