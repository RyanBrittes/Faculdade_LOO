# Atividade 05

| *** | *** |
| --- | --- |
| Aluno: | Ryan Ifran Brittes |
| Curso: | Engenharia da Computação |
| Professor: | Luiz Augusto Rodrigues |
| Disciplina | Linguagem Orientada a Objetos |

## Questão 01
>O estagiário (mais uma vez) começou abstraindo um diagrama de classes de Veículos, mas novamente deixou para você realizar o trabalho dele. Desta vez, tudo o que ele pensou foram os atributos dos veículos. Porém, parece que ele não colocou a nomenclatura sugerida, não distribuiu os atributos, e relacionou classes cujos atributos não aparecem.
Usando o que você aprendeu em POO, análise os atributos, distribua nas classes relacionadas, reajustando atributos quando necessário, e crie o diagrama de classes no draw.io, salvando o resultado em PDF.

>Após isso, crie um projeto Java chamado ProjetoVeiculosEstagiario, codifique as classes que você criou no diagrama, publique no GitHub, e mande o link para o professor.

### DIAGRAMA INCOMPLETO

![](https://github.com/RyanBrittes/Faculdade_LOO/blob/main/Atividade_05/Diagrama_UML/DIAGRAMA_INCOMPLETO.png)

### UML CORRIGIDO
![](https://github.com/RyanBrittes/Faculdade_LOO/blob/main/Atividade_05/Diagrama_UML/UML_ProjetoVeiculosEstagiario.jpg)

### NOTAS:
Após uma análise sobre o [DIAGRAMA INCOMPLETO](https://github.com/RyanBrittes/Faculdade_LOO/blob/main/Atividade_05/Diagrama_UML/DIAGRAMA_INCOMPLETO.png), foi observado que haviam informações incompletas, sendo necessária a criação de um Diagrama UML completo para representar a lógica que o código deva seguir.

**Observação**:
> Utilização incorreta de `nomenclatura` que represente classes abstratas e necessidade de criação de `classes` que representem os `atributos` e criem relacionamentos acertivos com as `classes reais`.

### Correção:
* No [DIAGRAMA INCOMPLETO](https://github.com/RyanBrittes/Faculdade_LOO/blob/main/Atividade_05/Diagrama_UML/DIAGRAMA_INCOMPLETO.png), não houve a criação de classes e atributos suficientes que pudessem representar de maneira acertiva as classes reais, e também a representação da classe abstrada pela palavra `Base` não foi utilizada. Estas correções foram realizadas no [UML CORRIGIDO](https://github.com/RyanBrittes/Faculdade_LOO/blob/main/Atividade_05/Diagrama_UML/UML_ProjetoVeiculosEstagiario.jpg).
* Após a correção, foram criadas as seguintes classes abstratas:
  * Inserção da palavra `Base` em `Veiculo`, ficando `BaseVeiculo`: responsável por conter características de veículos e identificação no registro;
  * BaseDocumentacao: responsável por conter atributos referentes à documentação dos veículos;
  * BaseVeículoFechado: responsável por conter o atributo `portas`, exclusivo de veículos fechados, não se encaixando na classe real `Motocicleta`;
  * BaseVeículoAberto: responsável por conter atributos utilizados em `BaseVeiculoTerrestre`, foi necessária a criação e subdivisão destas classes para que não houvesse conflitos e o atributo `portas` deslocado;
  * BaseVeículoAereo: responsável por conter atributos esclusivos de veículos aéreos, características que não são encontradas em veículos terrestres, recebeu o atributo `tipoAeronave`. Os atributos `placa`, `chassi` e `codigoRenavam` foram excluidos desta classe por não terem representação;
  * BaseVeículoTerrestre: responsável por conter atributos de veículos terrestres, sendo criado para se destinguir de quaisquer atributos que possam ser relacionados a veículos aéreos;
* Cada uma das classes reais recebeu atributos únicos que representam características únicas sobre elas, sendo:
  * Aviao: recebeu o atributo `qtdeHelices`;
  * Caminhao: recebeu o atributo `tipoCarga`;
  * Onibus: recebeu o atributo `tipoOnibus`;
  * Motocicleta: recebeu o atributo `cilindragem`.
* Foram adicionadas interfaces no diagrama, sendo responsáveis por criar a possibilidade de varias classes reais terem a possibilidade de heradarem métodos de varias classes do tipo interface. As interfaces criadas foram:
  * ILocomocaoAereo: responsável por implementar os métodos: `Pousar` e `Decolar`, contido na classe real `Aviao`;
  * ISinalizacao: responsável por implementar o método: `acionarSeta`, contido nas classes reais `Caminhao`, `Onibus` e `Motocicletas`.

### Código:
>O projeto encontrado em ProjetoVeiculosEstagiario contem os seguintes trechos de código, e se referem ao [UML CORRIGIDO](https://github.com/RyanBrittes/Faculdade_LOO/blob/main/Atividade_05/Diagrama_UML/UML_ProjetoVeiculosEstagiario.jpg).

* Trecho de código referente à Classe BaseVeiculo:

https://github.com/RyanBrittes/Faculdade_LOO/blob/c9b0a95eca93c4ddb08ecb7ef653ab755057085c/Atividade_05/ProjetoVeiculosEstagiario/src/uniderp/loo/escola/dominio/BaseVeiculo.java#L1-L52

* Trecho de código referente à Classe BaseDocumentacao:

https://github.com/RyanBrittes/Faculdade_LOO/blob/c9b0a95eca93c4ddb08ecb7ef653ab755057085c/Atividade_05/ProjetoVeiculosEstagiario/src/uniderp/loo/escola/dominio/BaseDocumentacao.java#L1-L136

* Trecho de código referente à Classe BaseVeiculoFechado:

https://github.com/RyanBrittes/Faculdade_LOO/blob/c9b0a95eca93c4ddb08ecb7ef653ab755057085c/Atividade_05/ProjetoVeiculosEstagiario/src/uniderp/loo/escola/dominio/BaseVeiculoFechado.java#L1-L26

* Trecho de código referente à Classe BaseVeiculoAberto:

https://github.com/RyanBrittes/Faculdade_LOO/blob/c9b0a95eca93c4ddb08ecb7ef653ab755057085c/Atividade_05/ProjetoVeiculosEstagiario/src/uniderp/loo/escola/dominio/BaseVeiculoAberto.java#L1-L43

* Trecho de código referente à Classe BaseVeiculoTerrestre:

https://github.com/RyanBrittes/Faculdade_LOO/blob/c9b0a95eca93c4ddb08ecb7ef653ab755057085c/Atividade_05/ProjetoVeiculosEstagiario/src/uniderp/loo/escola/dominio/BaseVeiculoTerrestre.java#L1-L43

* Trecho de código referente à Classe BaseVeiculoAereo:

https://github.com/RyanBrittes/Faculdade_LOO/blob/c9b0a95eca93c4ddb08ecb7ef653ab755057085c/Atividade_05/ProjetoVeiculosEstagiario/src/uniderp/loo/escola/dominio/BaseVeiculoAereo.java#L1-L27

* Trecho de código referente à Interface ILocomocaoAerea:

https://github.com/RyanBrittes/Faculdade_LOO/blob/c9b0a95eca93c4ddb08ecb7ef653ab755057085c/Atividade_05/ProjetoVeiculosEstagiario/src/uniderp/loo/escola/dominio/ILocomocaoAerea.java#L1-L7

* Trecho de código referente à Interface ISinalizacao:

https://github.com/RyanBrittes/Faculdade_LOO/blob/c9b0a95eca93c4ddb08ecb7ef653ab755057085c/Atividade_05/ProjetoVeiculosEstagiario/src/uniderp/loo/escola/dominio/ISinalizacao.java#L1-L6

* Trecho de código referente à Classe Aviao:

https://github.com/RyanBrittes/Faculdade_LOO/blob/c9b0a95eca93c4ddb08ecb7ef653ab755057085c/Atividade_05/ProjetoVeiculosEstagiario/src/uniderp/loo/escola/dominio/Aviao.java#L1-L34

* Trecho de código referente à Classe Onibus:

https://github.com/RyanBrittes/Faculdade_LOO/blob/c9b0a95eca93c4ddb08ecb7ef653ab755057085c/Atividade_05/ProjetoVeiculosEstagiario/src/uniderp/loo/escola/dominio/Onibus.java#L1-L32

* Trecho de código referente à Classe Caminhao:

https://github.com/RyanBrittes/Faculdade_LOO/blob/c9b0a95eca93c4ddb08ecb7ef653ab755057085c/Atividade_05/ProjetoVeiculosEstagiario/src/uniderp/loo/escola/dominio/Caminhao.java#L1-L32

* Trecho de código referente à Classe Motocicleta:

https://github.com/RyanBrittes/Faculdade_LOO/blob/c9b0a95eca93c4ddb08ecb7ef653ab755057085c/Atividade_05/ProjetoVeiculosEstagiario/src/uniderp/loo/escola/dominio/Motocicleta.java#L1-L32
