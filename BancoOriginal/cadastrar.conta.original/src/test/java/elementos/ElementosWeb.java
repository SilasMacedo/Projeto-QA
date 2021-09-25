package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	private By abrirNovaConta = By.xpath("[a@text = abrir-nova-conta_desktop]");
	private By abrirConta = By.className("bt-abrir-conta");
	private By nome = By.id("nome");
	private By telefone = By.id("telefone");
	private By email = By.id("email");
	private By cpf = By.id("cpf");
	private By enviar = By.id("btnEnviar");
	

	
	public By getAbrirNovaConta() {
		return abrirNovaConta;
	}
	public By getAbrirConta() {
		return abrirConta;
	}
	public By getNome() {
		return nome;
	}
	public By getTelefone() {
		return telefone;
	}
	public By getEmail() {
		return email;
	}
	public By getCpf() {
		return cpf;
	}
	public By getEnviar() {
		return enviar;
	}

	
	
	
}


