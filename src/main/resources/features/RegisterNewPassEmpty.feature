#language: pt

@QA
Funcionalidade: Cadastro
  @test
  Cenário: Cadastro vazio

        Dado que o usuario acesse o formulario de cadastro e preencha o Email corretamente
        E preencha a Senha corretamente deixando o RepitaSenha em branco
        Quando clicar no botão para Cadastrar
        Entao usuario NAO deve ser cadastrado e mensagem deve ser exibida
