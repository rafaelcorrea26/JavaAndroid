package com.example.financeiro.MODEL.CLASSES;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.financeiro.MODEL.conexao;


public class movimentacaoSQL {

    private com.example.financeiro.MODEL.conexao conexao;
    private SQLiteDatabase banco;

    public movimentacaoSQL(Context context){
        conexao = new conexao(context);
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