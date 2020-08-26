package com.example.financeiro.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.conversorcontaagua.Classes.CadastroContaAgua;
import com.example.financeiro.Model.Classes.movimentacaoDB;

public class movimentacaoSQL {

    private Conexao conexao;
    private SQLiteDatabase banco;

    public movimentacaoSQL(Context context){
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();

    }

    public long inserir(Movimentacao Movimentacao) {
        ContentValues values = new ContentValues();
        movimentacaoDB movimentacaoDB = new movimentacaoDB();

        values.put(movimentacaoDB.getCOLUNA_ValorTotalAgua(), Movimentacao.getValorTotalAgua());
        values.put(movimentacaoDB.getCOLUNA_ConsumoPorMetro(), Movimentacao.getConsumoPorMetro());
        values.put(movimentacaoDB.getCOLUNA_ValorTaxaDeServico(), Movimentacao.getValorTaxaDeServico());
        values.put(movimentacaoDB.getCOLUNA_ValorUtilizadoMesPassado(), Movimentacao.getValorUtilizadoMesPassado());
        values.put(movimentacaoDB.getCOLUNA_ValorUtilizadoEsteMes(), Movimentacao.getValorUtilizadoEsteMes());
        values.put(movimentacaoDB.getCOLUNA_TaxaDivida(), Movimentacao.getTaxaDivida());
        values.put(movimentacaoDB.getCOLUNA_TotalMetrosUtilizado(), Movimentacao.getTotalMetrosUtilizado());
        values.put(movimentacaoDB.getCOLUNA_TotalPorMetro(), Movimentacao.getTotalPorMetro());
        values.put(movimentacaoDB.getCOLUNA_TotalAPagarPorMes(), Movimentacao.getTotalAPagarPorMes());
        values.put(movimentacaoDB.getCOLUNA_DataAgua(), Movimentacao.getDataAgua());

        return banco.insert(movimentacaoDB.getTabelaContaagua(),null, values);

    }
}