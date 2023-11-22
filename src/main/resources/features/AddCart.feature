#language: pt

@QA
Funcionalidade: Carrinho
  @test
  Cenário: Adicionar produtos ao carrinho
   Dado que o usuario esteja logado no app e na aba Quadrinhos
   Quando acessar a PDP de um Quadrinho e selecionar o botao adicionar
   Entao produto deve ser adicionado no carrinho de compras