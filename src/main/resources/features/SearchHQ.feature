#language: pt

@QA
Funcionalidade: Quadrinhos
  @test
  Cenário: Pesquisar quadrinho

    Dado que o usuario acessa a aba Quadrinhos
    Quando pesquisar pelo nome de um quadrinho
    Entao deve ser retornado o resultado pesquisado
