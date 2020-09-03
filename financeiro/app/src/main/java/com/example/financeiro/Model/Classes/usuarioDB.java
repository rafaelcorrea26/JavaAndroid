package com.example.financeiro.MODEL.CLASSES;

public class usuarioDB {
    private static final String TABELA_USUARIO= "TBL_USUARIO";
    private static final String COLUNA_ID = "ID";
    private static final String COLUNA_NOME = "NOME";
    private static final String COLUNA_EMAIL = "EMAIL";
    private static final String COLUNA_LOGIN = "LOGIN";
    private static final String COLUNA_SENHA = "SENHA";
    private static final String COLUNA_DATA_CAD = "DATA_CAD";

    public static String getTabelaUsuario() {
        return TABELA_USUARIO;
    }

    public static String getColunaId() {
        return COLUNA_ID;
    }

    public static String getColunaNome() {
        return COLUNA_NOME;
    }

    public static String getColunaEmail() {
        return COLUNA_EMAIL;
    }

    public static String getColunaLogin() {
        return COLUNA_LOGIN;
    }

    public static String getColunaSenha() {
        return COLUNA_SENHA;
    }

    public static String getColunaDataCad() {
        return COLUNA_DATA_CAD;
    }






    public usuarioDB(){

    };



}