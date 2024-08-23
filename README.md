Lista de Exercícios 04 – Orientação a Objetos Avançada em Java

Criar uma interface AnimalIF com os métodos comer, moverse, dormir;


Criar uma classe abstrata AnimalAB que implementa a interface AnimalIF e define os métodos abstrados assinado na interface;

Crie as classes concertas Cachorro, Gato, Elefante, Leão que herdarão da classe AnimalAB e sobrescreva os métodos abstratos comer, moverse, dormir; 
As ações desses métodos consistem em alterar o estado interno do objeto através dos atributos de instância que representam a quantidade de comida ingerida ao comer, 
a quantidade de caminho percorrido ao moverse, e a quantidade de horas ao dormir;

Crie uma classe Peixe e Pombo. De quem vamos herdar? Um peixe nada e um pombo voa então os métodos nadar e voar devem estar na classe abstrata Animal? Não. 
Então criem uma classe abstrata AnimalMarinhoAB ,AnimalVoadorAB, AnimalTerrestreAB que implementa a classe abstrata AnimalAB para representar a classe abstrata para 
animais marinhos e aéreos “que voam”.
