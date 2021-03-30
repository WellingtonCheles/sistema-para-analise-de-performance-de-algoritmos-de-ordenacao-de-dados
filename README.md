# Desenvolvimento de um sistema para análise de performance de algoritmos de ordenação de dados.

## Atividades práticas supervisionadas – APS IV – Trabalho apresentado como exigência para a avaliação do curso de Ciências da Computação da Universidade Paulista sob orientação de professores do semestre.

### Integrantes envolvidos no desenvolvimento da aplicação
- Wellington Junior Cheles
- Gabriel Eduardo Joioso
- João Victor Caires

### Orientador
- Prof. Dr. Leandro Carlos Fernandes

### Objetivo
O objetivo dessa atividade foi desenvolver um sistema para análise de performance de algoritmos de ordenação de dados e relacionar o tema proposto com um contexto que apresentasse aspectos ligados as questões ambientais e de desenvolvimento sustentável.

### Introdução
Problemas são propostas em busca de uma solução, algoritmos existem com o proposito de entregar a solução para certos problemas. Julgando que nosso problema seja ordenar dados de forma especifica, podemos utilizar dos algoritmos de ordenação de dados para solucionarmos nosso problema. Os algoritmos descrevem passo a passo todos os procedimentos que devem ser feitos para chegar a uma solução de um determinado problema. Um dos tipos de algoritmos mais usados na resolução de problemas computacionais são os algoritmos de ordenação de dados, que tem como proposito ordenar e organizar uma lista de números ou caracteres de acordo com sua necessidade. Varias linguagens de programação já possuem métodos de ordenação. Os mais populares algoritmos de ordenação são: Insertion sort, Selection sort, Bubble sort, Comb sort, Quick sort, Merge sort, Heap sort e Shell sort.

### Contribuição do trabalho no Contexto Ambiental
Registros de temperaturas desde o século 19 mostram que a temperatura média da superfície da Terra cresceu 0,8 ºC nos últimos cem anos. Quase 0,6 ºC desse total ocorreu nas últimas três décadas. Os 20 anos mais quentes já registrados ocorreram nos últimos 22 anos, liderados pelo período entre 2015 e 2019. Se essa tendência continuar, as temperaturas poderão subir entre 3 ºC e 5 ºC até 2100. Desenvolvemos este programa para analisar o impacto do aquecimento global nos últimos anos (entre 1880 e 2019) com base na oscilação média da temperatura mundial.

### Algoritmos de ordenação de dados utilizados
- Bubble sort
- Insertion sort
- Selection sort
- Shell sort

### Referencial teórico

O Bubble sort, ou ordenação por flutuação (literalmente por bolha), é um dos mais simples algoritmos de ordenação. O princípio é percorrer o vetor várias vezes e em cada passagem fazer "flutuar" para o topo o maior elemento. Essa movimentação recebeu esse nome levando em consideração bubble do inglês bolha e sort do inglês ordenar (bolhas que ordenam). No melhor dos casos, o algoritmo executa N operações relevantes, onde N é o número de elementos do vetor. No pior dos casos, são feitas n² operações. A complexidade desse algoritmo é de ordem quadrática, sendo assim, ele não é recomendado para programas que necessitam de velocidade e quantidade elevada de dados. Esse algoritmo percorre a lista de itens ordenáveis do início ao fim, verificando a ordem dos elementos dois a dois, e trocando-os de lugar se necessário. O percorrer da lista ocorre até que nenhum elemento tenha sido trocado de lugar na passagem anterior.

O Insertion sort é a ordenação por inserção, basicamente é um algoritmo de ordenação que utiliza uma estrutura de lista (array) construindo uma matriz final com um elemento de cada vez. Assim como algoritmos de ordenação quadrática, é bastante eficiente para problemas com pequenas entradas, sendo o mais eficiente entre os algoritmos desta ordem de classificação. Podemos comparar o insertion sort com o modo que algumas pessoas organizam um baralho. Suponha que você esta jogando cartas e suas cartas estão em sua mao ordenadas, ao receber uma nova carta você deve coloca-la na posição correta seguindo seu padrão de ordenação. A cada carta adicionada em sua mão pode ser maior ou menor que algumas cartas que você já possui, assim você começa a comparar a nova carta com todas as outras em sua mao até encontrar a posição correta. Você insere a nova carta na posição correta e assim por diante. Esta é a ideia por traz da ordenação por inserção. Percorra as posições do array, começando com o índice 1, cada nova posição é como a nova carta que você recebeu, e você precisa inseri-la no lugar certo no subarray ordenado a esquerda daquela posição.

Em termos de comparação com outros algoritmos de ordenação, o insertion sort e o bubble sort atingem 0(n) em seus melhores casos, diferente do selection sort que
é o 0(n²) em todos os seus casos (melhor, médio e pior caso). A ordenação por seleção (do inglês, selection sort) é um algoritmo de ordenação que se baseia em passar sempre o menor valor para a primeira posição do vetor (ou maior dependendo da ordem estabelecida), depois o segundo menor valor na segunda posição e assim é feito com os N-1 elementos restantes, ate os últimos dois elementos. O selection sort é composto por dois laços, um externo e outro interno, o laço externo serve para controlar o índice inicial e o interno percorre o vetor todo. Na primeira iteração do laço externo o índice começa de 0 e cada iteração ele soma uma unidade até o final do vetor e o laço mais interno percorre o vetor começando desse índice externo +1 até o final do vetor.

**Exemplo:**

**Vetor de entrada = 9 - 7 - 8 - 1 - 2 - 0 - 4**

O primeiro laço o índice inicial é 0. O laço mais interno começa do índice 1
(índice_inicial_externo + 1) e percorre o vetor até achar o menor elemento, neste caso
o número zero. O zero passa para a posição inicial do vetor que na primeira iteração
do laço é 0.

- 0 - 7 - 8 - 1 - 2 - 9 - 4

Ao fim do laço interno, o laço externo incrementa uma unidade, agora a posição inicial do vetor passa a ser 1, pois o zero já se encontra no lugar dele, não é preciso mais fazer verificações pois ele é o menor elemento deste vetor. Agora o processo se repete, buscando o segundo menor elemento, neste caso o um.

- 0 - 1 - 8 - 7 - 2 - 9 - 4

Consequentemente o terceiro menor, quarto menor, ...
Assim sucessivamente até que o vetor esteja ordenado.

- 0 - 1 - 2 -7 - 8 - 9 - 4
- 0 - 1 - 2 - 4 - 8 - 9 - 7
- 0 - 1 - 2 - 4 - 7 - 9 - 8
- 0 - 1 - 2 - 4 - 7 - 8 – 9

O Selection sort compara a cada interação um elemento com os outros, visando
encontrar o menor. Dessa forma, podemos entender que não existe um melhor caso
mesmo que o vetor esteja ordenado ou em ordem inversa serão executados os dois
laços do algoritmo, o externo e o interno. A complexidade deste algoritmo será sempre
O(n²) enquanto que, por exemplo, os algoritmos heapsort e mergesort possuem
complexidades O(n log n).

O Shell Sort o algoritmo mais eficiente dentre os de complexidade quadrática
pois é um refinamento do método de inserção direta. O algoritmo difere do método de
inserção direta pelo fato de no lugar de considerar o array a ser ordenado como um
único segmento, ele considera vários segmentos sendo aplicado o método de
inserção direta em cada um deles. Basicamente o algoritmo passa várias vezes pela
lista dividindo o grupo maior em menores. Nos grupos menores é aplicado o método
da ordenação por inserção.

Exemplo de execução:

**Dado o vetor de entrada: 12, 43, 1, 6, 56, 23, 52, 9**
- 12, 43, 1, 6, 56, 23, 52, 9
- **12,** 43, **1**, 6, 56, 23, 52, 9
- 1, **43**, 12, **6**, 56, 23, 52, 9
- 1, 6, 12, 43, **56**, 23, **52**, 9
- 1, 6, 12, **43**, 52, 23, 56, **9**
- 1, 6, **12**, **9**, 52, 23, 56, 43
- 1, 6, 9, 12, **52**, **23**, 56, 43
- 1, 6, 9, 12, 23, 52, **56**, **43**
- 1, 6, 9, 12, 23, **52**, **43**, 56
- 1, 6, 9, 12, 23, 43, 52, 56

*Em negrito estão os números trocados na atual iteração.*

Após as seguintes trocas acima, obtemos o vetor ordenado: **1, 6, 9, 12, 23, 43, 52, 56**.

### Linguagem utilizada no desenvolvimento da aplicação
- Java

### Bibliotecas e ferramentas utilizadas para o desenvolvimento da aplicação
- Padrão Singleton
- AWT e Swing
- Action Event
- Action Listener
- Java JPanel
- Padrão Model View Controller (MVC)


### Aplicação
<p align="center">
  <img src="https://github.com/WellingtonCheles/sistema-para-analise-de-performance-de-algoritmos-de-ordenacao-de-dados/blob/master/program.gif?raw=true" width="80%"/>
</p>

<p align="left"><strong>Nota:</strong> 9,5<br>
<strong>Comentário do orientador:</strong><br>
<i>"A monografia apresentada pelo grupo está bem estrutura, adequada em forma e com um conteúdo de qualidade. Os integrantes revisão dos métodos de ordenação, abordando os aspectos conceituais e funcionais dos métodos escolhidos. No projeto prático, aplicaram vários conceitos interessantes visto durante o semestre. Uma descrição detalhada do sistema implementado pelo grupo é apresentada no documento, bem como, o resultados dos testes experimentais que estão devidamente acompanhado de sua discussão. Potenciais contribuições do tema foram satisfatoriamente correlacionadas com as questões ambientais e de sustentabilidade, tal como solicitado. Assim, o grupo atendeu e alcançou todos os objetivos esperados neste trabalho de APS."</i></p>






<p align="center">Atividade concluída em 13/11/2020.</p>
