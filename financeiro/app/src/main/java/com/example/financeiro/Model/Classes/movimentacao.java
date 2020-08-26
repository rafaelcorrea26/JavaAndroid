package com.example.financeiro.Model.Classes;

import java.util.Date;

public class movimentacao {
    private int ID;
    private String TIPOCONTA;
    private Date EMISSAO;
    private Date PAGAMENTO;
    private Date VENCIMENTO;
    private int PARCELAS;
    private String MOVIMENTACAO;
    private Double Valor;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTIPOCONTA() {
        return TIPOCONTA;
    }

    public void setTIPOCONTA(String TIPOCONTA) {
        this.TIPOCONTA = TIPOCONTA;
    }

    public Date getEMISSAO() {
        return EMISSAO;
    }

    public void setEMISSAO(Date EMISSAO) {
        this.EMISSAO = EMISSAO;
    }

    public Date getPAGAMENTO() {
        return PAGAMENTO;
    }

    public void setPAGAMENTO(Date PAGAMENTO) {
        this.PAGAMENTO = PAGAMENTO;
    }

    public Date getVENCIMENTO() {
        return VENCIMENTO;
    }

    public void setVENCIMENTO(Date VENCIMENTO) {
        this.VENCIMENTO = VENCIMENTO;
    }

    public int getPARCELAS() {
        return PARCELAS;
    }

    public void setPARCELAS(int PARCELAS) {
        this.PARCELAS = PARCELAS;
    }

    public String getMOVIMENTACAO() {
        return MOVIMENTACAO;
    }

    public void setMOVIMENTACAO(String MOVIMENTACAO) {
        this.MOVIMENTACAO = MOVIMENTACAO;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        Valor = valor;
    }


}
