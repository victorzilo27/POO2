# Padrão Composite

Implementar a configuração das fases do game de forma flexível utilizando o padrão 
composite.

Uma fase deve ser representada por um composite de elementos. Este composite deve
representar um labirinto.

Neste contexto, o jogador (personagem) deve encontrar a saída do labirinto. 

O labirinto é composto por salas (composite), que por sua vez, levam a outras salas 
recursivamente, ou a saídas (nó-folha tipo 1) ou um abismo (nó-folha tipo 2). 

Cada sala deve possuir um inimigo a ser confrontado pelo personagem. Desta forma, 
o construtor de um composite deve receber: caminho1, caminho2 e inimigo.

Desta forma, cada sala dá origem a dois possíveis caminhos, que podem ser outras 
salas (composite) e/ou nó-folha (fim de jogo: saída ou abismo).

Implemente um método jogar(Personagem p) para simular um jogador andando pelo 
labirinto, de forma que a função seleciona aleatoriamente (random()) uma das duas 
possibilidades (caminhos) para prosseguir, até que o jogador encontre um nó folha 
(saída ou abismo).

A medida que o jogador passa por uma sala, deve-se mostrar sua identificação, ou 
tipo, e o inimigo encontrado, assim como o life atual do personagem.

## Observação

A quantidade de caminhos possíveis a partir de uma sala pode ser 
variável, utilizando-se uma estrutura dinâmica (ex. Arraylist) para armazenar os 
composites.