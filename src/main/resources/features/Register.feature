#language: pt

@QA
Funcionalidade: Cadastro

  @test
  Cenário: Cadastro valido
    Dado que o usuario acesse o formulario de cadastro e informe os dados de Email e Senha validos
    Quando selecionar o botao Cadastrar
    Então usuario deve ser cadastrado