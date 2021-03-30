package visao;

//Classe abstrata que contém método setListener, que será dada aos componentes suas devidas ações 

import java.awt.event.ActionListener;


import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class UICtrl extends JPanel {
	
	public abstract void setListener(ActionListener actionListener); 
}
