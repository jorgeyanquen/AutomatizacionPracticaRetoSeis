@Regresion
  Feature: The automation of the success page is wanted to validate the purchase of a television

    @CasoExitoso
    Scenario: it is necessary to select an LG television and make the purchase from the official page.
      Given that I want to buy a television to watch the World Cup
      When I enter the virtual page of success and select the one I like the most
      Then I make the purchase so that it is sent to my house.
