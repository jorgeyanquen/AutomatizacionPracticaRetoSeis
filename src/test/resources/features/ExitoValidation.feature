@Regresion
  Feature: The automation of the success page is wanted to validate the purchase of a television

    @CasoExitoso
    Scenario: it is necessary to select an LG television and make the purchase from the official page.
  #se requiere seleccionar un televisor LG y realizar la compra desde la pagina oficial
      Given that I want to buy a television to watch the World Cup
     # Given que quiero comprar un televisor para ver el mundial de futbol
      When I enter the virtual page of success and select the one I like the most
  # Cuando ingreso a la página virtual del éxito y selecciono el que más me gusta
        | buscar    |
        | Televisor |
      Then I make the purchase so that it is sent to my house.
     # Entonces realizo la compra para que sea enviado a mi casa.