# Author: Juan David Martínez Botero
@stories
Feature: Accessing the Reglamento Inversion Virtual Bancolombia document
  A user wants to see the Reglamento Inversion Virtual Bancolombia document

  @scenario1
  Scenario: Opening the Reglamento Inversion Virtual Bancolombia document
    Given than Juan wants to see the Reglamento Inversion Virtual Bancolombia document
    When he follows the route in the website
    Then he sees the document
    |urlPdf|
#    |https://www.bancolombia.com/wcm/connect/www.bancolombia.com-26918/182d05c8-d942-42ca-9b3d-ddd0fe8772fe/Reglamento+Inversi%C3%B3n+Virtual.pdf?MOD=AJPERES&CVID=nPHYsMT|
#    |Reglamento+InversiÃ³n+Virtual.pdf|
  |Reglamento+Inversi%C3%B3n+Virtual.pdf|