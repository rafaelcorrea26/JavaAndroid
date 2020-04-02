package com.example.conversorcontaagua.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {
    private static final String name = "banco.db";
    private static final int version = 1;
    CadastroContaAguaDB cadastroContaAguaDB = new CadastroContaAguaDB();

    public Conexao(Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        db.execSQL("CREATE TABLE  " +
                cadastroContaAguaDB.getTabelaContaagua() + "(" +
                cadastroContaAguaDB.getColunaId() + " integer NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                cadastroContaAguaDB.getCOLUNA_ValorTotalAgua() + " Numeric(15,4), " +
                cadastroContaAguaDB.getCOLUNA_ConsumoPorMetro() + " Numeric(15,4), " +
                cadastroContaAguaDB.getCOLUNA_ValorTaxaDeServico() + " Numeric(15,4), " +
                cadastroContaAguaDB.getCOLUNA_ValorUtilizadoMesPassado() + " Numeric(15,4), " +
                cadastroContaAguaDB.getCOLUNA_ValorUtilizadoEsteMes() + " Numeric(15,4), " +
                cadastroContaAguaDB.getCOLUNA_TaxaDivida() + " Numeric(15,4), " +
                cadastroContaAguaDB.getCOLUNA_TotalMetrosUtilizado() + " Numeric(15,4), " +
                cadastroContaAguaDB.getCOLUNA_TotalPorMetro() + " Numeric(15,4), " +
                cadastroContaAguaDB.getCOLUNA_TotalAPagarPorMes() + " Numeric(15,4), " +
                cadastroContaAguaDB.getCOLUNA_DataAgua() + " varchar(20) )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
