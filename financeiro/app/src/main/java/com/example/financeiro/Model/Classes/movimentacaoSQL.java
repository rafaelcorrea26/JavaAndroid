package com.example.financeiro.MODEL.CLASSES;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.financeiro.MODEL.Conexao;


public class movimentacaoSQL {

    private Conexao conexao;
    private SQLiteDatabase banco;

    public movimentacaoSQL(Context context){
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();

    }

    public long inserir(movimentacao m) {
        ContentValues values = new ContentValues();
        movimentacaoDB movimentacaoDB = new movimentacaoDB();

        values.put(movimentacaoDB.getColunaTipoconta(), m.getTIPOCONTA());
        values.put(movimentacaoDB.getColunaEmissao(), m.getEMISSAO());
        values.put(movimentacaoDB.getColunaVencimento(), m.getVENCIMENTO());
        values.put(movimentacaoDB.getColunaParcelas(), m.getPARCELAS());
        values.put(movimentacaoDB.getColunaMovimentacao(), m.getMOVIMENTACAO());
        values.put(movimentacaoDB.getColunaValor(), m.getValor());


        return banco.insert(movimentacaoDB.getTabelaMovimentacao(),null, values);

    }
}