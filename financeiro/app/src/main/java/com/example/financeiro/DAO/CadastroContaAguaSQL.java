package com.example.financeiro.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.conversorcontaagua.Classes.CadastroContaAgua;

public class SQL {

    private Conexao conexao;
    private SQLiteDatabase banco;

    public SQL(Context context){
     conexao = new Conexao(context);
     banco = conexao.getWritableDatabase();

    }

    public long inserir(Movimentacao Movimentacao) {
        ContentValues values = new ContentValues();
        CadastroContaAguaDB cadastroContaAguaDB = new CadastroContaAguaDB();

        values.put(cadastroContaAguaDB.getCOLUNA_ValorTotalAgua(), Movimentacao.getValorTotalAgua());
        values.put(cadastroContaAguaDB.getCOLUNA_ConsumoPorMetro(), Movimentacao.getConsumoPorMetro());
        values.put(cadastroContaAguaDB.getCOLUNA_ValorTaxaDeServico(), Movimentacao.getValorTaxaDeServico());
        values.put(cadastroContaAguaDB.getCOLUNA_ValorUtilizadoMesPassado(), Movimentacao.getValorUtilizadoMesPassado());
        values.put(cadastroContaAguaDB.getCOLUNA_ValorUtilizadoEsteMes(), Movimentacao.getValorUtilizadoEsteMes());
        values.put(cadastroContaAguaDB.getCOLUNA_TaxaDivida(), Movimentacao.getTaxaDivida());
        values.put(cadastroContaAguaDB.getCOLUNA_TotalMetrosUtilizado(), Movimentacao.getTotalMetrosUtilizado());
        values.put(cadastroContaAguaDB.getCOLUNA_TotalPorMetro(), Movimentacao.getTotalPorMetro());
        values.put(cadastroContaAguaDB.getCOLUNA_TotalAPagarPorMes(), Movimentacao.getTotalAPagarPorMes());
        values.put(cadastroContaAguaDB.getCOLUNA_DataAgua(), Movimentacao.getDataAgua());

       return banco.insert(cadastroContaAguaDB.getTabelaContaagua(),null, values);

    }
}
