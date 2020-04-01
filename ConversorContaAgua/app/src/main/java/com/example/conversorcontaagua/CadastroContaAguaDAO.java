package com.example.conversorcontaagua;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class CadastroContaAguaDAO {

    private Conexao conexao;
    private SQLiteDatabase banco;

    public CadastroContaAguaDAO(Context context){
     conexao = new Conexao(context);
     banco = conexao.getWritableDatabase();

    }

    public long inserir(CadastroContaAgua cadastrocontaagua) {
        ContentValues values = new ContentValues();
        values.put("ValorTotalAgua", cadastrocontaagua.getValorTotalAgua());
        values.put("ConsumoPorMetro", cadastrocontaagua.getConsumoPorMetro());
        values.put("ValorTaxaDeServico", cadastrocontaagua.getValorTaxaDeServico());
        values.put("ValorUtilizadoMesPassado", cadastrocontaagua.getValorUtilizadoMesPassado());
        values.put("ValorUtilizadoEsteMes", cadastrocontaagua.getValorUtilizadoEsteMes());

        values.put("TaxaDivida", cadastrocontaagua.getTaxaDivida());
        values.put("TotalMetrosUtilizado", cadastrocontaagua.getTotalMetrosUtilizado());
        values.put("TotalPorMetro", cadastrocontaagua.getTotalPorMetro());
        values.put("TotalAPagarPorMes", cadastrocontaagua.getTotalAPagarPorMes());
        values.put("DataAgua", cadastrocontaagua.getDataAgua());
       return banco.insert("CONTAAGUA",null,values);

    }
}
