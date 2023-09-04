# Atividade 04

| *** | *** |
| --- | --- |
| Aluno: | Ryan Ifran Brittes |
| Curso: | Engenharia da Computação |
| Professor: | Luiz Augusto Rodrigues |
| Disciplina | Linguagem Orientada a Objetos |

## Questão 01
>O estagiário começou um diagrama de classes, mas não finalizou, por algum
motivo divino, sobrando para você terminar o trabalho dele. Mas parece que não está
nada bom o que ele fez.
Usando o que você aprendeu em POO, análise e otimize o diagrama abaixo,criando uma versão corrigida do diagrama, salvando o resultado em PDF.

>Após isso, crie um projeto Java chamado ProjetoEstagiario, codifique as
classes que você otimizou, publique no GitHub, e mande o link para o professor.

### UML do Estagiário:

![](https://github.com/RyanBrittes/Faculdade_LOO/blob/main/Atividade_04/Diagrama_UML/Diagrama_Original.jpg)

<hr>

### UML Corrigido:

![](https://github.com/RyanBrittes/Faculdade_LOO/blob/main/Atividade_04/Diagrama_UML/Diagrama_Corrigido.jpg)

### NOTAS:
Após uma análise sobre o [UML do Estagiário](https://github.com/RyanBrittes/Faculdade_LOO/blob/main/Atividade_04/Diagrama_UML/Diagrama_Original.jpg), foram observadas algumas inconsistência que não se aplicam ao que lhe foi proposto: criar um diagrama UML voltado ao Paradigma Orientado a Objetos.

**Observação**:
> Utilização incorreta das bases de OO (Orientação a Objetos), `Abstração`, `Encapsulamento` e `Herança`.

### Correção:
* No [UML do Estagiário](https://github.com/RyanBrittes/Faculdade_LOO/blob/main/Atividade_04/Diagrama_UML/Diagrama_Original.jpg), não houve o reaproveitamento de atributos utilizando a classe Pai, BasePessoa, e que devido a isso os atributos `codigo`, `nome`, `email`, `registro`, `dataNascimento` e `usuario` contidos na classe `Passageiro` e os atributos `codigo`, `nome`, `telefone`, `registro`, `usuario` e `senha` contidos na classe `Funcionario` foram reescritos de forma incongruente. O [UML Corrigido](https://github.com/RyanBrittes/Faculdade_LOO/blob/main/Atividade_04/Diagrama_UML/Diagrama_Corrigido.jpg) corrige essas inconsistências e representam como a Orientação a Objetos se comporta.
* Após a correção, os únicos atributos que deverão estar contidos dentro da Classe `Funcionario` deverão ser: `contaCorrente` e `cracha`. Na Classe `Passageiro`, deverão ser: `numeroCartao` e `documento`.
* Os atributos dentro da classe `BasePessoa`, devem receber como forma de encapsulamento o atributo `Protected`, para que apenas os suas afiliações consigam acessar os valores e métodos contidos nela, sendo está uma boa pratica. Na classe `Funcioanrio` e `Passageiro`, os atributos devem receber como parâmetro o atributo `Private`, para que apenas os objetos de sua mesma classe consigam acessar seus métodos e valores. O [UML Corrigido](https://github.com/RyanBrittes/Faculdade_LOO/blob/main/Atividade_04/Diagrama_UML/Diagrama_Corrigido.jpg) corrige essas inconsistências.

### Código:
>O projeto encontrado em ProjetoEstagiario contem os seguintes trechos de código, e se referem ao [UML Corrigido](https://github.com/RyanBrittes/Faculdade_LOO/blob/main/Atividade_04/Diagrama_UML/Diagrama_Corrigido.jpg).

* Trecho de código referente à Classe BasePessoa:

https://github.com/RyanBrittes/Faculdade_LOO/blob/025c5dacbbfcda5d791b000b0c4254e99389b1c6/Atividade_04/ProjetoEstagiario/src/uniderp/loo/escola/dominio/BasePessoa.java#L1-L75

* Trecho de código referente à Classe Funcionario:

https://github.com/RyanBrittes/Faculdade_LOO/blob/025c5dacbbfcda5d791b000b0c4254e99389b1c6/Atividade_04/ProjetoEstagiario/src/uniderp/loo/escola/dominio/Funcionario.java#L1-L28

* Trecho de código referente à Classe Passageiro:

https://github.com/RyanBrittes/Faculdade_LOO/blob/025c5dacbbfcda5d791b000b0c4254e99389b1c6/Atividade_04/ProjetoEstagiario/src/uniderp/loo/escola/dominio/Passageiro.java#L1-L32
