package com.example.financeiro.MODEL.CLASSES;

import java.util.Date;

public class usuario {
    private int ID;
    private String NOME;
    private String LOGIN;
    private String SENHA;
    private String EMAIL;
    private String DATA_CAD;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getLOGIN() {
        return LOGIN;
    }

    public void setLOGIN(String LOGIN) {
        this.LOGIN = LOGIN;
    }

    public String getSENHA() {
        return SENHA;
    }

    public void setSENHA(String SENHA) {
        this.SENHA = SENHA;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getDATA_CAD() {
        return DATA_CAD;
    }

    public void setDATA_CAD(String DATA_CAD) {
        this.DATA_CAD = DATA_CAD;
    }




}
