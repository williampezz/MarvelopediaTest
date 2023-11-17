#language: pt

@QA
Funcionalidade: Login
  @test
  Cenário: Login com valor diferente de email
    Dado que o usuario acesse a tela de Login do app e informe um texto invalido no campo Email
    Quando selecionar o foco no campo de senha ou clicar no botão Login
    Entao o sistema deve exibir mensagem de erro e nao deve permitir o login
