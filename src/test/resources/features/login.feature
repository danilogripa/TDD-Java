#language:pt
  @login
Funcionalidade: Login

  Contexto:
    Dado que a modal esteja sendo exibida

  @fecharModal
  Cenário: Fechar a Modal ao click fora da mesma
    Quando for realizado um click fora da modal
    Entao a janela modal deve ser fechada

  @fecharModalIcone @smoke
  Cenário: Fechar a Modal ao click no icone Fechar
    Quando for realizado um click no icone Fechar
    Entao a janela modal deve ser fechada

  @createNewAccount @smoke
  Cenário: Link Create New account
    Quando for realizado um click no Create New Account
    Então a pagina Create New Account deve ser exibida

  @loginComSucesso @smoke
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | login    | <login>    |
      | password | <password> |
      | remember | <remember> |
    Quando for realizado o click no botao sign in
    Entao deve ser possivel logar no sistema
    Exemplos:
      | identificacao       | login   | password | remember |
      | campos obrigatorios | danilo  | pass123A | false    |
      | todos os campos     | danilo  | pass123A | true     |

  @loginError
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | login    | <login>    |
      | password | <password> |
      | remember | <remember> |
    Quando for realizado o click no botao sign in
    Entao o sistema deve exibir uma msg de erro
    Exemplos:
      | identificacao    | login    | password | remember |
      | usuario invalida | invalida | senha    | false    |
      | senha invalida   | cg       | invalida | true     |


  @dadosEmBranco @smoke
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | login    | <login>    |
      | password | <password> |
      | remember | <remember> |
    Quando for realizado o click no botao sign in
    Entao o botao sign in deve permanecer desabilitado
    Exemplos:
      | identificacao     | login   | password | remember |
      | usuario em branco |         | senha    | false    |
      | senha em branco   | chronos |          | true     |

