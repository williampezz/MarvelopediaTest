#language: pt

@QA
Funcionalidade: Carrinho
  @test
  Cenário: Carrinho abandonado
    Dado que o usuario possua produtos no carrinho
    Quando selecionar o icone do carrinho
    Entao deve ser aberta pagina do carrinho com os produtos adicionados
