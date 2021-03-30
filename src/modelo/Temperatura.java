package modelo;

//Classe que representa a inicializa��o do programa.

import controle.ControleTempUI;

import visao.UIPrincipal;

public class Temperatura {
		
	private UIPrincipal janela;
	private ControleTempUI controle;
	
	public Temperatura() {
		
	}
	
	//M�todo de inicializa��o da aplica��o.
	
	public void iniciar() {
		janela = new UIPrincipal();
		controle = new ControleTempUI(this, janela);		
		controle.iniciarAplicacao();
	}

		
}
