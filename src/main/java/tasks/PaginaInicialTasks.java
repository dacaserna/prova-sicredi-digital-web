package tasks;

import BaseTest.BaseTest;
import pageobjects.PaginaInicialPO;

public class PaginaInicialTasks extends BaseTest {

    public void preencherValorAplicarMenorQueMinimo(){
        PaginaInicialPO.valorAplicarTextField().sendKeys("1999");
        PaginaInicialPO.valorInvestirTextField().sendKeys("0");
    }

    public void preencherValorInvestirMenorQueMinimo(){
        PaginaInicialPO.valorInvestirTextField().sendKeys("1999");
        PaginaInicialPO.valorAplicarTextField().sendKeys("0");
    }

    public void preencherValorNaoConfereZero(){
        PaginaInicialPO.tempoTextField().sendKeys("0");
        PaginaInicialPO.valorAplicarTextField().sendKeys("0");
    }

    public void preencherValores(String aplicar, String investir, String tempo){
        PaginaInicialPO.valorAplicarTextField().sendKeys(aplicar);
        PaginaInicialPO.valorInvestirTextField().sendKeys(investir);
        PaginaInicialPO.tempoTextField().sendKeys(tempo);
    }

    public String getValorAplicarErro(){
        return PaginaInicialPO.valorAplicarMinimoErroLabel().getText();
    }

    public String getValorInvestirErro(){
        return PaginaInicialPO.valorInvestirMinimoErroLabel().getText();
    }

    public String getNaoConfereErro(){
        return PaginaInicialPO.valorNaoConfereErroLabel().getText();
    }

    public void clicarBotaoSimular(){
        PaginaInicialPO.simularButton().click();
    }

    public String getSimulacaoProntaText(){
        return PaginaInicialPO.simulacaoProntaMensagemLabel().getText();
    }

    public String getValorSimulacao(){
        return PaginaInicialPO.valorSimulacaoLabel().getText();
    }

    public String getCabecalhoTabelaTempo(){
        return PaginaInicialPO.cabecalhoTabelaTempoLabel().getText();
    }

    public String getCabecalhoTabelaValor(){
        return PaginaInicialPO.cabecalhoTabelaValorLabel().getText();
    }



}
