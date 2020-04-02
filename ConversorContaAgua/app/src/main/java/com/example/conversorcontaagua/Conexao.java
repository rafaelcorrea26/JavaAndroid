package com.example.conversorcontaagua;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {
    private static final String name = "banco.db";
    private static final int version = 1;

    public Conexao(Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table CONTAAGUA (id integer NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "ValorTotalAgua Numeric(15,4), ConsumoPorMetro Numeric(15,4), ValorTaxaDeServico Numeric(15,4), " +
                "ValorUtilizadoMesPassado Numeric(15,4), ValorUtilizadoEsteMes Numeric(15,4), TaxaDivida Numeric(15,4), " +
                "TotalMetrosUtilizado Numeric(15,4) , DataAgua varchar(20))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
