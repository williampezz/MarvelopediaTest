#language: pt

@QA
Funcionalidade: Login
  @test
  Cenário: Login valido
    Dado que o usuario acesse a tela de Login do app e preencha Email e Senha
    Quando clicar no botao de Login
    Então login deve ser realizado com sucesso

