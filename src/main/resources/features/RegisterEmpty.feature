#language: pt

@QA
Funcionalidade: Cadastro
  @test
  Cenário: Cadastro vazio
    Dado que o usuario deixe o campo Email, Senha e RepitaSenha em branco
    Quando clicar no botão para se Cadastrar
    Então mensagem de erro deve ser apresentada e Cadastro não deve ser realizado