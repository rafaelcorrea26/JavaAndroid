package com.example.conversorcontaagua.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.conversorcontaagua.Classes.CadastroContaAgua;

import java.util.ArrayList;
import java.util.List;

public class CadastroContaAguaSQL {

    private Conexao conexao;
    private SQLiteDatabase banco;

    public CadastroContaAguaSQL(Context context) {
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

        return banco.insert(cadastroContaAguaDB.getTabelaContaagua(), null, values);

    }

    public List<CadastroContaAgua> ObterTodas() {
        CadastroContaAguaDB cadastroContaAguaDB = new CadastroContaAguaDB();


        List<CadastroContaAgua> ListaContaAgua = new ArrayList<>();
        Cursor cursor = banco.query(cadastroContaAguaDB.getTabelaContaagua(), new String[]{cadastroContaAguaDB.getColunaId(), cadastroContaAguaDB.getCOLUNA_ValorTotalAgua(), cadastroContaAguaDB.getCOLUNA_ConsumoPorMetro(), cadastroContaAguaDB.getCOLUNA_ValorTaxaDeServico(), cadastroContaAguaDB.getCOLUNA_ValorUtilizadoMesPassado(), cadastroContaAguaDB.getCOLUNA_ValorUtilizadoEsteMes(), cadastroContaAguaDB.getCOLUNA_TaxaDivida(), cadastroContaAguaDB.getCOLUNA_TotalMetrosUtilizado(), cadastroContaAguaDB.getCOLUNA_ConsumoPorMetro(), cadastroContaAguaDB.getCOLUNA_ValorTotalAgua(), cadastroContaAguaDB.getCOLUNA_DataAgua()}, null, null, null, null, null);
        while (cursor.moveToNext()) {
            CadastroContaAgua c = new CadastroContaAgua();
            c.setID(cursor.getInt(0));
            c.setValorTotalAgua(cursor.getDouble(1));
            c.setConsumoPorMetro(cursor.getDouble(2));
            c.setValorTaxaDeServico(cursor.getDouble(3));
            c.setValorUtilizadoMesPassado(cursor.getDouble(4));
            c.setValorUtilizadoEsteMes(cursor.getDouble(5));
            c.setTaxaDivida(cursor.getDouble(6));
            c.setTotalMetrosUtilizado(cursor.getDouble(7));
            c.setTotalPorMetro(cursor.getDouble(8));
            c.setTotalAPagarPorMes(cursor.getDouble(9));
            c.setDataAgua(cursor.getString(10));
            ListaContaAgua.add(c);
        }

        return ListaContaAgua;

    }
}
