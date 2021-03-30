package modelo;

//Classe responsável pelo método de ordenação Insertion Sort.

public class InsertionSort {

	// Vetor de variação anual de temperaturas em um periodo entre os anos de 1880 a
	// 2019

	public double vetor[] = { -0.51, -0.44, -0.47, -0.68, -0.72, -0.58, -0.52, -0.49, -0.44, -0.31, -0.53, -0.54, -0.52,
			-0.56, -0.42, -0.42, -0.35, -0.29, -0.41, -0.23, -0.16, -0.12, -0.29, -0.38, -0.45, -0.35, -0.17, -0.61,
			-0.44, -0.42, -0.35, -0.48, -0.48, -0.48, -0.31, -0.05, -0.08, -0.45, -0.62, -0.49, -0.32, -0.34, -0.13,
			-0.24, -0.27, -0.24, -0.14, 0.00, -0.20, -0.13, -0.48, -0.12, -0.02, -0.03, -0.35, -0.06, -0.17, -0.12,
			-0.02, 0.18, 0.09, 0.07, 0.10, 0.05, 0.07, 0.19, -0.07, -0.01, 0.04, 0.05, -0.07, -0.33, -0.07, -0.06, 0.19,
			-0.13, -0.12, -0.41, -0.05, 0.14, 0.07, -0.02, 0.11, 0.15, 0.21, -0.23, -0.13, -0.06, 0.01, -0.12, -0.09,
			0.04, -0.03, -0.17, 0.33, -0.19, 0.13, -0.23, 0.25, 0.11, 0.17, 0.31, 0.52, 0.11, 0.50, 0.06, 0.10, 0.30,
			0.45, 0.58, 0.36, 0.66, 0.53, 0.24, 0.35, 0.48, 0.78, 0.35, 0.64, 0.98, 0.79, 0.64, 0.86, 0.97, 0.96, 0.83,
			1.10, 0.99, 1.14, 0.91, 0.92, 1.17, 0.93, 0.98, 1.05, 1.03, 1.42, 1.54, 1.42, 1.22 };

	private static double aux;
	private static int i;

	public InsertionSort() {

		selectionSort(vetor);
	}

	// Estrutura Insertion Sort

	private static void selectionSort(double vetor[]) {

		for (int j = 1; j < vetor.length; j++) {

			aux = vetor[j];

			for (i = j - 1; (i >= 0) && (vetor[i] > aux); i--) {

				vetor[i + 1] = vetor[i];
			}

			vetor[i + 1] = aux;
		}
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < vetor.length - 1; i++) {
			s.append(this.vetor[i]);
			s.append("°C, ");
		}
		if (vetor.length > 0) {
			s.append(this.vetor[vetor.length - 1]);

		}
		s.append("]");
		return s.toString();
	}

}
