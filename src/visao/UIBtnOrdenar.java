package visao;

//Classe respons�vel pelos componentes de ordena��o (bot�es)

import java.awt.event.ActionListener;




import javax.swing.JButton;

@SuppressWarnings("serial")

//Criando um objeto de refer�ncia de inst�ncia (Padr�o Singleton)

public class UIBtnOrdenar extends UICtrl {

	private static UIBtnOrdenar refInst�ncia = null;

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
	
	//M�todo que verefica a exist�ncia de uma inst�ncia (Padr�o Singleton)
	
	public static UIBtnOrdenar getInstance() {
		if (refInst�ncia == null)
			refInst�ncia = new UIBtnOrdenar();
		return refInst�ncia;
	}
	
	//M�todo que gera a��o dos componentes.
	
	@Override
	public void setListener(ActionListener actionListener) {

		btnBubblesort.addActionListener(actionListener);
		
		btnSelectionsort.addActionListener(actionListener);
		
		btnInsertionsort.addActionListener(actionListener);
		
		btnShellsort.addActionListener(actionListener);
		
		btnCancelar.addActionListener(actionListener);

	}

}
