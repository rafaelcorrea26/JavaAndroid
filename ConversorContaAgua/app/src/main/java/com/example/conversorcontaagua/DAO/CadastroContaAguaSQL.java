package com.example.conversorcontaagua.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.conversorcontaagua.Classes.CadastroContaAgua;

public class CadastroContaAguaSQL {

    private Conexao conexao;
    private SQLiteDatabase banco;

    public CadastroContaAguaSQL(Context context){
     conexao = new Conexao(context);
     banco = conexao.getWritableDatabase();

    }

    public long inserir(CadastroContaAgua cadastrocontaagua) {
        ContentValues values = new ContentValues();
        CadastroContaAguaDB cadastroContaAguaDB = new CadastroContaAguaDB();

        values.put(cadastroContaAguaDB.getCOLUNA_ValorTotalAgua(), cadastrocontaagua.getValorTotalAgua());
        values.put(cadastroContaAguaDB.getCOLUNA_ConsumoPorMetro(), cadastrocontaagua.getConsumoPorMetro());
        values.put(cadastroContaAguaDB.getCOLUNA_ValorTaxaDeServico(), cadastrocontaagua.getValorTaxaDeServico());
        values.put(cadastroContaAguaDB.getCOLUNA_ValorUtilizadoMesPassado(), cadastrocontaagua.getValorUtilizadoMesPassado());
        values.put(cadastroContaAguaDB.getCOLUNA_ValorUtilizadoEsteMes(), cadastrocontaagua.getValorUtilizadoEsteMes());
        values.put(cadastroContaAguaDB.getCOLUNA_TaxaDivida(), cadastrocontaagua.getTaxaDivida());
        values.put(cadastroContaAguaDB.getCOLUNA_TotalMetrosUtilizado(), cadastrocontaagua.getTotalMetrosUtilizado());
        values.put(cadastroContaAguaDB.getCOLUNA_TotalPorMetro(), cadastrocontaagua.getTotalPorMetro());
        values.put(cadastroContaAguaDB.getCOLUNA_TotalAPagarPorMes(), cadastrocontaagua.getTotalAPagarPorMes());
        values.put(cadastroContaAguaDB.getCOLUNA_DataAgua(), cadastrocontaagua.getDataAgua());

       return banco.insert(cadastroContaAguaDB.getTabelaContaagua(),null, values);

    }
}
