#language: pt

@QA
Funcionalidade: Logout
  @test
  Cenário: Logout
    Dado que o usuario esteja logado no aplicativo
    Quando selecionar Logout
    Entao app deve ser desligado
