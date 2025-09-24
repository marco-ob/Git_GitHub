package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features ="src/test/java/features", glue ="stepDefinitions",monochrome = true,dryRun = true,
        tags = "@SmokeTest or @RegressionTest",plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"}) //
//CUCUMBEROPTION es una anotación que configura la ejecución de tus pruebas de Cucumber.
//@CucumberOptions(...)
//Esta es una anotación que configura la ejecución de tus pruebas de Cucumber.
//Veamos sus dos parámetros:
//
//a. features = "src/test/java/features"
//Aquí se indica la ruta donde están tus archivos .feature escritos en Gherkin.
//En este caso, están en la carpeta: src/test/java/features.
//
//b. glue = "stepDefinitions"
//Esto le dice a Cucumber dónde buscar las definiciones de pasos (@Given, @When, @Then).
//Cucumber buscará las clases Java dentro del paquete llamado stepDefinitions.

public class TestNGRunner extends AbstractTestNGCucumberTests {





}
