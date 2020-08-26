package com.example.financeiro.Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.financeiro.Model.Classes.movimentacaoDB;

public class Conexao extends SQLiteOpenHelper {
    private static final String name = "banco.db";
    private static final int version = 1;
    com.example.financeiro.Model.Classes.movimentacaoDB movimentacaoDB = new movimentacaoDB();

    public Conexao(Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        db.execSQL("CREATE TABLE  " +
                movimentacaoDB.getTabelaMovimentacao() + "(" +
                movimentacaoDB.getColunaId() + " integer NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                movimentacaoDB.getCOLUNA_Valor() + " Numeric(15,4), " +
                movimentacaoDB.getCOLUNA_TIPOCONTA() + " Numeric(15,4), " +
                movimentacaoDB.getCOLUNA_EMISSAO() + " Numeric(15,4), " +
                movimentacaoDB.getCOLUNA_PAGAMENTO() + " Numeric(15,4), " +
                movimentacaoDB.getCOLUNA_VENCIMENTO() + " Numeric(15,4), " +
                movimentacaoDB.getCOLUNA_PARCELAS() + " Numeric(15,4), " +
                movimentacaoDB.getCOLUNA_MOVIMENTACAO() + " varchar(20) )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
