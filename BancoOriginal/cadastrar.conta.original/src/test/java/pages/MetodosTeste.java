package pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MetodosTeste {
	
	
	WebDriver driver;
	
	
	/**
	 * Metodo para escrever texto
	 * 
	 * @param elemento
	 * @param texto
	 */
	public void escrever (By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);	
		
		} catch (Exception e) {
			System.out.println("========== Erro ao digitar ============" + e.getLocalizedMessage());
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
		/**
		 * Metodo para capturar screenshot da pagina
		 * @param nome
		 */
		public void screenShot (String nome) {
			try {
				TakesScreenshot srcShot	= ((TakesScreenshot) driver);
				File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
				File destinoFile = new File ("./Evidencias"+nome+".png");
				FileUtils.copyFile(srcFile, destinoFile);
				
			} catch (Exception e) {
				System.err.println("========== Erro ao tirar screencShot ==========" + e.getMessage());
			}
		}
	
	
	/**
	 * Metodo para fechar navegador
	 */
	public void fecharNavegador (By elemento) {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("========= Erro ao fechar Navegador =========");
		}
	}
	
}
