package Steps;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Testandocucumber {

    WebDriver driver;

    @Before

    public void inicio(){

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Dado("que o usuario esta na tela de pesquisa do google")
    public void que_o_usuario_esta_na_tela_de_pesquisa_do_google() {

        driver.get("https://www.google.com/");
    }

    @Quando("pesquisa por {string}")
    public void pesquisa_por(String produto) {
        driver.findElement(By.name("q")).sendKeys(produto);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Então("o resultado esperado deve ser o {string}")
    public void o_resultado_esperado_deve_ser_o(String tituloObtido) {

        Assert.assertEquals(tituloObtido, driver.getTitle());
    }
}
