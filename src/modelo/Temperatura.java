package modelo;

//Classe que representa a inicialização do programa.

import controle.ControleTempUI;

import visao.UIPrincipal;

public class Temperatura {
		
	private UIPrincipal janela;
	private ControleTempUI controle;
	
	public Temperatura() {
		
	}
	
	//Método de inicialização da aplicação.
	
	public void iniciar() {
		janela = new UIPrincipal();
		controle = new ControleTempUI(this, janela);		
		controle.iniciarAplicacao();
	}

		
}
