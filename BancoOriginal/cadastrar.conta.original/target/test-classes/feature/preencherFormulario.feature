#Author: silas@silas.com.br

@formulario
Feature: Prencher formulario de abertura de conta
  Eu como usuario quero acessar o formulario para enviar o meu cadastro

Background: Abrir site
   Given que steja no site "https://www.original.com.br"
   And acesse o formulario
	
  @regressivo
  Scenario: Enviar formulario
    And preencher nome "Teste Silas"
    And preencher celular "13997108410"
    And preencher email "silas@silas.com.br"
    And preencher cpf "760.265.240-10"
    When clicar no botao enviar
    Then formulario enviado com sucesso
   
