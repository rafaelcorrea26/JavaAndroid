package com.example.conversorcontaagua.DAO;

public class CadastroContaAguaDB {
    private static final String TABELA_CONTAAGUA = "TBL_CONTAAGUA";
    private static final String COLUNA_ID = "ID";
    private static final String COLUNA_ValorTotalAgua = "ValorTotalAgua";
    private static final String COLUNA_ConsumoPorMetro = "ConsumoPorMetro";
    private static final String COLUNA_ValorTaxaDeServico = "ValorTaxaDeServico";
    private static final String COLUNA_ValorUtilizadoMesPassado = "ValorUtilizadoMesPassado";
    private static final String COLUNA_ValorUtilizadoEsteMes = "ValorUtilizadoEsteMes";
    private static final String COLUNA_TaxaDivida = "TaxaDivida";
    private static final String COLUNA_TotalMetrosUtilizado = "TotalMetrosUtilizado";
    private static final String COLUNA_TotalPorMetro = "TotalPorMetro";
    private static final String COLUNA_TotalAPagarPorMes = "TotalAPagarPorMes";
    private static final String COLUNA_DataAgua = "DataAgua";

    public static String getColunaId() {
        return COLUNA_ID;
    }

    public static String getCOLUNA_TotalPorMetro() {
        return COLUNA_TotalPorMetro;
    }

    public static String getCOLUNA_TotalAPagarPorMes() {
        return COLUNA_TotalAPagarPorMes;
    }

    public  String getTabelaContaagua() {
        return TABELA_CONTAAGUA;
    }

    public  String getCOLUNA_ValorTotalAgua() {

        return COLUNA_ValorTotalAgua;
    }

    public  String getCOLUNA_ConsumoPorMetro() {

        return COLUNA_ConsumoPorMetro;
    }

    public  String getCOLUNA_ValorTaxaDeServico() {

        return COLUNA_ValorTaxaDeServico;
    }

    public  String getCOLUNA_ValorUtilizadoMesPassado() {

        return COLUNA_ValorUtilizadoMesPassado;
    }

    public  String getCOLUNA_ValorUtilizadoEsteMes() {
        return COLUNA_ValorUtilizadoEsteMes;
    }

    public  String getCOLUNA_TaxaDivida() {

        return COLUNA_TaxaDivida;
    }

    public  String getCOLUNA_TotalMetrosUtilizado() {

        return COLUNA_TotalMetrosUtilizado;
    }

    public String getCOLUNA_DataAgua() {

        return COLUNA_DataAgua;
    }
    public  CadastroContaAguaDB(){

    };

}
