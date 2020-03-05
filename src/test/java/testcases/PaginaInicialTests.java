package testcases;

import BaseTest.BaseTest;
import Constants.MessagesConstants;
import Utils.RelatoriosUtils.GenerateReport;
import Utils.ScreenshotsUtils;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tasks.PaginaInicialTasks;

import java.io.IOException;

@Listeners(GenerateReport.class)
public class PaginaInicialTests extends BaseTest {

    @Test
    public void valorAplicarMenorQueMinimoTest() throws IOException {
        PaginaInicialTasks paginaInicialTasks = new PaginaInicialTasks();
        paginaInicialTasks.preencherValorAplicarMenorQueMinimo();
        ScreenshotsUtils.teste("valorAplicarMenorQueMinimoTest",  "valorAplicarMenorQueMinimoTest");
        Assert.assertEquals(paginaInicialTasks.getValorAplicarErro(), MessagesConstants.VALOR_MINIMO_APLICAR);
    }

    @Test
    public void realizarSimulacaoTest() throws IOException {
        PaginaInicialTasks paginaInicialTasks = new PaginaInicialTasks();
        String tempo = "222";
        paginaInicialTasks.preencherValores("2000", "2000", tempo);
        paginaInicialTasks.clicarBotaoSimular();

        ScreenshotsUtils.teste("realizarSimulacaoTest",  "realizarSimulacaoTest");
        Assert.assertEquals(paginaInicialTasks.getSimulacaoProntaText(), "Em " + tempo + " meses você terá guardado");
    }

    @Ignore
    @Test
    public void valorInvestirMenorQueMinimoTest() throws IOException {
        PaginaInicialTasks paginaInicialTasks = new PaginaInicialTasks();
        paginaInicialTasks.preencherValorInvestirMenorQueMinimo();
        ScreenshotsUtils.teste("valorInvestirMenorQueMinimoTest",  "valorInvestirMenorQueMinimoTest");
        Assert.assertEquals(paginaInicialTasks.getValorInvestirErro(), MessagesConstants.VALOR_MINIMO_INVESTIR);
    }

    @Ignore
    @Test
    public void valorNaoConfereErroTest() throws IOException {
        PaginaInicialTasks paginaInicialTasks = new PaginaInicialTasks();
        paginaInicialTasks.preencherValorNaoConfereZero();
        ScreenshotsUtils.teste("valorNaoConfereErroTest",  "valorNaoConfereErroTest");
        Assert.assertEquals(paginaInicialTasks.getNaoConfereErro(), MessagesConstants.VALOR_TEMPO_INVALIDO);
    }

}