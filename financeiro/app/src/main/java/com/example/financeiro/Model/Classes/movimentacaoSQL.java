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

    public long inserir(movimentacao Movimentacao) {
        ContentValues values = new ContentValues();
        movimentacaoDB movimentacaoDB = new movimentacaoDB();

        values.put(movimentacaoDB.getColunaTipoconta(), Movimentacao.getTIPOCONTA());
        values.put(movimentacaoDB.getColunaEmissao(), Movimentacao.getEMISSAO());
        values.put(movimentacaoDB.getColunaVencimento(), Movimentacao.getVENCIMENTO());
        values.put(movimentacaoDB.getColunaParcelas(), Movimentacao.getPARCELAS());
        values.put(movimentacaoDB.getColunaMovimentacao(), Movimentacao.getMOVIMENTACAO());
        values.put(movimentacaoDB.getColunaValor(), Movimentacao.getValor());


        return banco.insert(movimentacaoDB.getTabelaMovimentacao(),null, values);

    }
}