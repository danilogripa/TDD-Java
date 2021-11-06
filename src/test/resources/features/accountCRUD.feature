#language:pt
Funcionalidade: AccountCRUD

  @cadastroConta
  Cenario: Cadastro nova conta
    Dado que a pagina new account esteja sendo exibida
    Quando os campos de cadastro estiverem preenchidos com
      | username | daniloteste         |
      | email    | danilo456@gmail.com |
      | password | senha123            |
      | country  | Brazil              |
    Então deve ser possivel logar no sistema
