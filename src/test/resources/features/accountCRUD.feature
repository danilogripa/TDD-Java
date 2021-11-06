#language:pt
Funcionalidade: AccountCRUD

  @cadastroConta
  Cenario: Cadastro nova conta
    Dado que a pagina new account esteja sendo exibida
    Quando os campos de cadastro estiverem preenchidos com
      | username | daniloteste         |
      | email    | danilo456@gmail.com |
      | password | Senha123            |
      | country  | Brazil              |
    Entao deve ser possivel logar no sistema apos o cadastro

  @loginCRUD
  Cenario: Realizar login CRUD
    Dado que a modal esteja sendo exibida
    Quando os campos de login sejam preenchidos da seguinte forma
      | login    | daniloteste         |
      | email    | danilo456@gmail.com |
      | password | Senha123            |
      | country  | Brazil              |
    Quando for realizado o click no botao sign in
    Entao deve ser possivel logar no sistema

  @alteracaoCRUD
  Cenario: Alteracao CRUD
    Dado que esteja logado no sistema com
      | login    | daniloteste         |
      | email    | danilo456@gmail.com |
      | password | Senha123            |
