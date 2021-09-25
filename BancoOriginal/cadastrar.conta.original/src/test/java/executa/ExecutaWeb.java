package executa;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//caminho para acessar as features
		features = "src/test/resources/feature",
		
		//nome da peckage com stesp
		glue = "tests",
		
		//nome da tag que sera executada
		tags = "@positivo",
		
		//validar se existe alguma linha do featrue sem step, padrao false
		dryRun = false,
		
		// pretty serve para deixar a visualizacao do junit igual cucumber
		// report sao os status report
		plugin = {"pretty", "html:target/cucumb-report.html"},
		
		//Exclui os caracteres especiais de formatacao do console
		monochrome = true
	
		)

public class ExecutaWeb {

}
