package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {
	
	WebDriver driver;
	
	/**
	 * Metodo para abrir navegador chrome
	 * @param site
	 */
	public void abrirNavegador(String site) {
		try {
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			System.out.println("------------Iniciando teste-------------");
			
		} catch (Exception e) {
			System.out.println("========== Erro ao abrir navegador ===========" + e.getMessage());
			System.out.println("========= Causa do erro =========" + e.getCause());
		}
			
	}
	/**
	 * Metodo para clicar em um elemento
	 * @param elemento
	 */
	public void clicar (By elemento) {
		try {
			driver.findElement(elemento).click();		
		
		} catch (Exception e) {
			System.out.println("========== Erro ao clicar ==========" + e.getMessage());
		}
	}

}
