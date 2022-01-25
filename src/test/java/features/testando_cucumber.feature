#language: pt

  Funcionalidade: Testando pesquisa do google

    Cenario: Testando varios produtos

    Esquema do Cenário:
      Dado que o usuario esta na tela de pesquisa do google
      Quando pesquisa por <produto>
      Então o resultado esperado deve ser o <titulo_obtido>

        Exemplos:
        |produto   |titulo_obtido              |
        |"Camisa"  |"Camisa - Pesquisa Google" |
        |"Camiseta"|"Camiseta - Pesquisa Google" |
        |"Chapeu"  |"Chapeu - Pesquisa Google" |
        |"Bermuda" |"Bermuda - Pesquisa Google"|