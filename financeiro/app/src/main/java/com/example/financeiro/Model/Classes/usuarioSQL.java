package com.example.financeiro.MODEL.CLASSES;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.financeiro.MODEL.conexao;


public class usuarioSQL {

    private com.example.financeiro.MODEL.conexao conexao;
    private SQLiteDatabase banco;

    public usuarioSQL(Context context){
        conexao = new conexao(context);
        banco = conexao.getWritableDatabase();

    }

    public long inserir(usuario u) {
        ContentValues values = new ContentValues();
        usuarioDB usuarioDB = new usuarioDB();

        values.put(usuarioDB.getColunaNome(), u.getNOME());
        values.put(usuarioDB.getColunaEmail(), u.getEMAIL());
        values.put(usuarioDB.getColunaLogin(), u.getLOGIN());
        values.put(usuarioDB.getColunaSenha(), u.getSENHA());
        values.put(usuarioDB.getColunaDataCad(), u.getDATA_CAD());


        return banco.insert(usuarioDB.getTabelaUsuario(),null, values);

    }
}