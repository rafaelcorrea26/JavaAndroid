package com.example.financeiro.MODEL;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.financeiro.MODEL.CLASSES.movimentacaoDB;

public class conexao extends SQLiteOpenHelper {
    private static final String name = "banco.db";
    private static final int version = 1;
    com.example.financeiro.MODEL.CLASSES.movimentacaoDB movimentacaoDB = new movimentacaoDB();

    public conexao(Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        db.execSQL("CREATE TABLE  " +
                movimentacaoDB.getTabelaMovimentacao() + "(" +
                movimentacaoDB.getColunaId() + " integer NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                movimentacaoDB.getColunaTipoconta() + " Numeric(15,4), " +
                movimentacaoDB.getColunaEmissao() + " Text, " +
                movimentacaoDB.getColunaVencimento() + " Text, " +
                movimentacaoDB.getColunaParcelas() + " integer, " +
                movimentacaoDB.getColunaMovimentacao() + " varchar(20), " +
                movimentacaoDB.getColunaValor() + " Numeric(15,4), ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
