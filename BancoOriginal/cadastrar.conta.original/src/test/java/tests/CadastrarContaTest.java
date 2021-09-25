package tests;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MetodosTeste;

public class CadastrarContaTest {

	MetodosTeste metodos = new MetodosTeste();
	ElementosWeb elemento = new ElementosWeb();
	
	
	
	@Given("que esteja ja home")
	public void que_esteja_ja_home() {
		
	}

	@Given("acesso o formulario de abertura de conta")
	public void acesso_o_formulario_de_abertura_de_conta() {
		metodos.clicar(elemento.getAbrirNovaConta());
	 	metodos.clicar(elemento.getAbrirConta());
	
	}

	@When("preencho todos os dados obrigatorios corretamente")
	public void preencho_todos_os_dados_obrigatorios_corretamente() {
		
	   
	}

	@Then("formulario enviado com sucesso")
	public void formulario_enviado_com_sucesso() {
	   
	}

	@Given("que esteja na home")
	public void que_esteja_na_home() {
	   
	}

	@When("preencho todos os dados obrigatorios invalidos")
	public void preencho_todos_os_dados_obrigatorios_invalidos() {
	    
	}

	@Then("sistema exibe mensagem de erro")
	public void sistema_exibe_mensagem_de_erro() {
	   
	}

}
