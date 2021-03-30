package visao;

//Classe responsável pelos componentes de ordenação (botões)

import java.awt.event.ActionListener;




import javax.swing.JButton;

@SuppressWarnings("serial")

//Criando um objeto de referência de instância (Padrão Singleton)

public class UIBtnOrdenar extends UICtrl {

	private static UIBtnOrdenar refInstância = null;

	private JButton btnBubblesort;
	private JButton btnSelectionsort;
	private JButton btnInsertionsort;
	private JButton btnShellsort;
	private JButton btnCancelar;

	private UIBtnOrdenar() {

		btnBubblesort = new JButton("Bubble S.");
		btnBubblesort.setActionCommand("CMD_BUBBLESORT");
		btnBubblesort.setMnemonic('B');

		btnSelectionsort = new JButton("Selection S.");
		btnSelectionsort.setActionCommand("CMD_SELECTIONSORT");
		btnSelectionsort.setMnemonic('S');

		btnInsertionsort = new JButton("Insertion S.");
		btnInsertionsort.setActionCommand("CMD_INSERTIONSORT");
		btnInsertionsort.setMnemonic('I');

		btnShellsort = new JButton("Shell S.");
		btnShellsort.setActionCommand("CMD_SHELLSORT");
		btnShellsort.setMnemonic('H');

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setActionCommand("CMD_CANCELAR");
		btnCancelar.setMnemonic('C');

		this.add(btnBubblesort);

		this.add(btnSelectionsort);

		this.add(btnInsertionsort);

		this.add(btnShellsort);

		this.add(btnCancelar);
	}
	
	//Método que verefica a existência de uma instância (Padrão Singleton)
	
	public static UIBtnOrdenar getInstance() {
		if (refInstância == null)
			refInstância = new UIBtnOrdenar();
		return refInstância;
	}
	
	//Método que gera ação dos componentes.
	
	@Override
	public void setListener(ActionListener actionListener) {

		btnBubblesort.addActionListener(actionListener);
		
		btnSelectionsort.addActionListener(actionListener);
		
		btnInsertionsort.addActionListener(actionListener);
		
		btnShellsort.addActionListener(actionListener);
		
		btnCancelar.addActionListener(actionListener);

	}

}
