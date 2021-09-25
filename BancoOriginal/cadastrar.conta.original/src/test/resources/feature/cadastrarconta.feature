#Author: silas@silas.com.br


@cadastro
Feature: Prencher formulario de abertura de conta
  Eu como usuario quero acessar o formulario para enviar o meu cadastro

  @positivo
  Scenario: preenchimento de formulario
    Given que esteja ja home
    And acesso o formulario de abertura de conta
    When preencho todos os dados obrigatorios corretamente
    Then formulario enviado com sucesso
   

  @negativo
  Scenario Outline: preeenchimento de formulario com dados invalidos 
    Given que esteja na home
    And acesso o formulario de abertura de conta
    When preencho todos os dados obrigatorios invalidos 
    Then sistema exibe mensagem de erro

  
