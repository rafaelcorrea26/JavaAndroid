package com.example.financeiro.Model.Classes;

public class movimentacaoDB {
    private static final String TABELA_MOVIMENTACAO = "TBL_MOVIMENTACAO";
    private static final String COLUNA_ID = "ID";
    private static final String COLUNA_TIPOCONTA = "TIPOCONTA";
    private static final String COLUNA_EMISSAO = "EMISSAO";
    private static final String COLUNA_VENCIMENTO= "VENCIMENTO";
    private static final String COLUNA_PARCELAS = "PARCELAS";
    private static final String COLUNA_MOVIMENTACAO = "MOVIMENTACAO";
    private static final String COLUNA_VALOR = "VALOR";


    public static String getTabelaMovimentacao() {
        return TABELA_MOVIMENTACAO;
    }

    public static String getColunaId() {
        return COLUNA_ID;
    }

    public static String getColunaTipoconta() {
        return COLUNA_TIPOCONTA;
    }

    public static String getColunaEmissao() {
        return COLUNA_EMISSAO;
    }

    public static String getColunaVencimento() {
        return COLUNA_VENCIMENTO;
    }

    public static String getColunaParcelas() {
        return COLUNA_PARCELAS;
    }

    public static String getColunaMovimentacao() {
        return COLUNA_MOVIMENTACAO;
    }

    public static String getColunaValor() {
        return COLUNA_VALOR;
    }

    public movimentacaoDB(){

    };

}
