package com.example.conversorcontaagua;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {
    private static final String name = "bando.db";
    private static final int version = 1;

    public Conexao(@Nullable Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL("create table CONTAAGUA (id integer primary key autoincrement,"+
        "ValorTotalAgua NUMERIC(15,4), ConsumoPorMetro NUMERIC(15,4), ValorTaxaDeServico NUMERIC(15,4), " +
        "ValorUtilizadoMesPassado NUMERIC(15,4), ValorUtilizadoEsteMes NUMERIC(15,4), TaxaDivida NUMERIC(15,4), "  +
        "TotalMetrosUtilizado NUMERIC(15,4) , DataAgua varchar(20))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
