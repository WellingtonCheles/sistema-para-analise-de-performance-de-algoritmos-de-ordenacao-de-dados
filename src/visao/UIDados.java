package visao;

//Classe abstrata respons�vel pelo gerenciamento dos dados

import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class UIDados <T> extends JPanel {
	
	public abstract void setDados(T objeto);
	public abstract T getDados();
		
}

