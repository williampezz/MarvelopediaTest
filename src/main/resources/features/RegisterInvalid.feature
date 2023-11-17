#language: pt

@QA
Funcionalidade: Cadastro
  @test
  Cenário: Cadastro com senha invalida
    Dado que o usuario acesse o formulario de cadastro
    E informe um Email valido
    E informe uma senha menor que o requisito mínimo
    Quando clicar no botão Cadastrar
    Então usuario NAO deve ser cadastrado
    E mensagem de erro deve ser apresentada