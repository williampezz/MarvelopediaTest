#language: pt

@QA
Funcionalidade: Carrinho
  @test
  Cenário: Remover produtos do carrinho
    Dado que o usuario tenha produtos no carrinho
    Quando remover produtodos do carrinho
    Entao produto deve ser removido
