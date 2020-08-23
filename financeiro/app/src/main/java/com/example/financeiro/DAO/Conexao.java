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
                cadastroContaAguaDB.getTabelaMovimentacao() + "(" +
                cadastroContaAguaDB.getColunaId() + " integer NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                cadastroContaAguaDB.getCOLUNA_Valor() + " Numeric(15,4), " +
                cadastroContaAguaDB.getCOLUNA_TIPOCONTA() + " Numeric(15,4), " +
                cadastroContaAguaDB.getCOLUNA_EMISSAO() + " Numeric(15,4), " +
                cadastroContaAguaDB.getCOLUNA_PAGAMENTO() + " Numeric(15,4), " +
                cadastroContaAguaDB.getCOLUNA_VENCIMENTO() + " Numeric(15,4), " +
                cadastroContaAguaDB.getCOLUNA_PARCELAS() + " Numeric(15,4), " +
                cadastroContaAguaDB.getCOLUNA_MOVIMENTACAO() + " varchar(20) )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
