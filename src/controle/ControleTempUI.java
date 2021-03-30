package controle;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import modelo.BubbleSort;
import modelo.InsertionSort;
import modelo.SelectionSort;
import modelo.ShellSort;
import modelo.Temperatura;
import visao.UIPrincipal;

//Classe que controla a aplicação, através do modelo MVC.

@SuppressWarnings("unused")
public class ControleTempUI implements ActionListener {
	private Temperatura temperatura;
	private UIPrincipal janela;

	public ControleTempUI(Temperatura temp, UIPrincipal gui) {

		this.temperatura = temp;
		this.janela = gui;
	}

//	  Método que inicia a execução dos elementos de visão e de
//	  controle.

	public void iniciarAplicacao() {

		janela.setListener(this);
		janela.setVisible(true);
	}

//	  Método responsável por conduzir o fluxo de execução entre as interações na interface e as
//	  funcionalidades.

	@Override
	public void actionPerformed(ActionEvent ae) {

		// Reações da interface gráfica

		if (ae.getActionCommand().equals("FUNC_ADICIONAR_TEMPERATURA")) {

			janela.configure(1);

		} else if (ae.getActionCommand().equals("FUNC_ORDENAR_TEMPERATURA")) {

			janela.configure(1);

			JOptionPane.showMessageDialog(janela, "Escolha o Modo de Ordenação!", "Escolha!",
					JOptionPane.INFORMATION_MESSAGE);

		} else if (ae.getActionCommand().equals("FUNC_SOBRE")) {

			JOptionPane.showMessageDialog(janela,
					"Esta aplicação foi desenvolvida pelos alunos Gabriel, João e Wellington\n"
							+ "do 4° periodo do curso de Ciência da Computação.\n"
							+ "O objetivo é aplicar métodos de ordenação de dados,\n"
							+ "afim de comparar o desempenho entres eles.\n",
					"Sobre", JOptionPane.PLAIN_MESSAGE,
					new ImageIcon(UIPrincipal.class.getResource("imagens/32x32/iconsobre32.png")));

		}

		// Reações da interface gráfica

		else if (ae.getActionCommand().equals("CMD_BUBBLESORT")) {

			long tempoInicial = System.currentTimeMillis();

			BubbleSort bubblesort = new BubbleSort();

			long tempoFinal = System.currentTimeMillis();

			JTextArea textArea = new JTextArea(10, 40);
			BubbleSort longMessage = bubblesort;
			textArea.setText("Ordenação Bubble Sort:\n " + "\n" + bubblesort + "\n " + "\nTempo de Ordenação: "
					+ (tempoFinal - tempoInicial) + "ms");
			textArea.setFont(new Font("Arial", Font.BOLD, 12));
			textArea.setEditable(false);

			JScrollPane scrollPane = new JScrollPane(textArea);

			JOptionPane.showMessageDialog(janela, scrollPane, "Bubble Sort", JOptionPane.INFORMATION_MESSAGE);

		} else if (ae.getActionCommand().equals("CMD_SELECTIONSORT")) {

			// Função(tempoInicial e tempoFinal) responsável pelo pelo tempo, timer em ms;

			long tempoInicial = System.currentTimeMillis();

			SelectionSort selectionsort = new SelectionSort();

			long tempoFinal = System.currentTimeMillis();

			// Funcão responsável pela janela de ordenação e o scroll;

			JTextArea textArea = new JTextArea(10, 40);
			SelectionSort longMessage = selectionsort;
			textArea.setText("Ordenação Selection Sort:\n " + "\n" + selectionsort + "\n " + "\nTempo de Ordenação: "
					+ (tempoFinal - tempoInicial) + "ms");
			textArea.setFont(new Font("Arial", Font.BOLD, 12));
			textArea.setEditable(false);

			JScrollPane scrollPane = new JScrollPane(textArea);

			JOptionPane.showMessageDialog(janela, scrollPane, "Selection Sort", JOptionPane.INFORMATION_MESSAGE);

		} else if (ae.getActionCommand().equals("CMD_INSERTIONSORT")) {

			long tempoInicial = System.currentTimeMillis();

			InsertionSort insertionsort = new InsertionSort();

			long tempoFinal = System.currentTimeMillis();

			JTextArea textArea = new JTextArea(10, 40);
			InsertionSort longMessage = insertionsort;
			textArea.setText("Ordenação Insertion Sort:\n " + "\n" + insertionsort + "\n " + "\nTempo de Ordenação: "
					+ (tempoFinal - tempoInicial) + "ms");
			textArea.setFont(new Font("Arial", Font.BOLD, 12));
			textArea.setEditable(false);

			JScrollPane scrollPane = new JScrollPane(textArea);

			JOptionPane.showMessageDialog(janela, scrollPane, "Insertion Sort", JOptionPane.INFORMATION_MESSAGE);

		} else if (ae.getActionCommand().equals("CMD_SHELLSORT")) {

			long tempoInicial = System.currentTimeMillis();

			ShellSort shellsort = new ShellSort();

			long tempoFinal = System.currentTimeMillis();

			JTextArea textArea = new JTextArea(10, 40);
			ShellSort longMessage = shellsort;
			textArea.setText("Ordenação Shell Sort:\n " + "\n" + shellsort + "\n " + "\nTempo de Ordenação: "
					+ (tempoFinal - tempoInicial) + "ms");
			textArea.setFont(new Font("Arial", Font.BOLD, 12));
			textArea.setEditable(false);

			JScrollPane scrollPane = new JScrollPane(textArea);

			JOptionPane.showMessageDialog(janela, scrollPane, "Shell Sort", JOptionPane.INFORMATION_MESSAGE);

		} else if (ae.getActionCommand().equals("CMD_CANCELAR")) {

			int resp = JOptionPane.showConfirmDialog(janela, "Deseja realmente Cancelar?", "Cancelar execução",
					JOptionPane.YES_NO_OPTION);
			if (resp == JOptionPane.YES_OPTION)

				janela.configure(UIPrincipal.MODO_TELA_VAZIA);

		}
	}

}
