package tests;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Browsers;

public class PreencherFormulario {

	Browsers browser = new Browsers();
	
	
	@Given("que steja no site {string}")
	public void que_steja_no_site(String site) {
	  browser.abrirNavegador(site); 
	}

	@Given("acesse o formulario")
	public void acesse_o_formulario() {
	 browser.clicar(By.className("btn redirect-landing btn-header-ganhaganha eventoAbrirConta"));
	}

	@Given("preencher nome {string}")
	public void preencher_nome(String string) {
	  
	}

	@Given("preencher celular {string}")
	public void preencher_celular(String string) {
	    
	}

	@Given("preencher email {string}")
	public void preencher_email(String string) {
	    
	}

	@Given("preencher cpf {string}")
	public void preencher_cpf(String string) {
	    
	}

	@When("clicar no botao enviar")
	public void clicar_no_botao_enviar() {
	
	}
}
