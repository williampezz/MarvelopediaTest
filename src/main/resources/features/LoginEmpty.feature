#language: pt

@QA
Funcionalidade: Login
  @test
  Cenário: Login vazio
    Dado que o usuario acesse a tela de Login do app com campo de Email e Senha em branco
    Quando clicar no botão Login
    Então mensagem de erro deve ser apresentada e Login não deve ser realizado