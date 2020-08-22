package com.example.financeiro.Classes;

import java.util.Date;

public class usuario {
    private int ID;
    private String NOME;
    private String SENHA;
    private String EMAIL;
    private Date DATA_CAD;

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

    public Date getDATA_CAD() {
        return DATA_CAD;
    }

    public void setDATA_CAD(Date DATA_CAD) {
        this.DATA_CAD = DATA_CAD;
    }



}
