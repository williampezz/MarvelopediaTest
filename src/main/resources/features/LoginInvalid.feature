#language: pt

@QA
Funcionalidade: Login
  @test
  Cenário: Login invalido
    Dado que o usuario acesse a tela de Login do app e informe Email e senha Invalidos
    Quando clicar no botão Login
    Então login nao deve ser realizado e mensagem de erro deve ser apresentado