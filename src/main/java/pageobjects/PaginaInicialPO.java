package pageobjects;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaInicialPO extends BaseTest {

    public static WebElement valorAplicarTextField(){
        return driver.findElement(By.id("valorAplicar"));
    }

    public static WebElement valorInvestirTextField(){
        return driver.findElement(By.id("valorInvestir"));
    }

    public static WebElement tempoTextField(){
        return driver.findElement(By.id("tempo"));
    }

    public static WebElement valorAplicarMinimoErroLabel(){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"valorAplicar-error\"]")));
    }

    public static WebElement valorInvestirMinimoErroLabel(){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"valorInvestir-error\"]")));
    }

    public static WebElement valorNaoConfereErroLabel(){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tempo-error\"]")));
    }

    public static WebElement simularButton(){
        return driver.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[5]/ul/li[2]/button"));
    }

    public static WebElement simulacaoProntaMensagemLabel(){
        return driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[2]/span[1]"));
    }

    public static WebElement valorSimulacaoLabel(){
        return driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[2]/span[1]"));
    }

    public static WebElement cabecalhoTabelaTempoLabel(){
        return driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[2]/div[1]/table/thead/tr/th[1]"));
    }

    public static WebElement cabecalhoTabelaValorLabel(){
        return driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[2]/div[1]/table/thead/tr/th[2]"));
    }

}
