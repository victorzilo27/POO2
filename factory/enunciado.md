# Prática 

## Factory Method

Aplique o padrão factory method, criando uma implementação abstrata da
fábrica, mas deixando cada sub-classe concreta decidir quais personagens
criar. 

Na classe abstrata crie um método jogar() que simula uma lógica de
execução do game, e utiliza o factory method para fabricar personagens. O
método jogar() deve ser final, não podendo ser sobreposto nas subclasses.

Forneça 2 factory methods concretos nas subclasses concretas:

- uma implementando uma fábrica simples, em que 4 tipos de personagens
são fornecidos, conforme parâmetro do método fabrica. 

- uma implementando uma fábrica mais complexas, em que 4 tipos de
personagens decorados são fornecidos, conforme parâmetro do método
fabrica.