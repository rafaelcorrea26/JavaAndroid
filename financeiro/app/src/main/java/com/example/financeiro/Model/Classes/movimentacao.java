package com.example.financeiro.MODEL.CLASSES;

public class movimentacao {
    private int ID;
    private String TIPOCONTA;
    private String EMISSAO;
    private String PAGAMENTO;
    private String VENCIMENTO;
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

    public String getEMISSAO() {
        return EMISSAO;
    }

    public void setEMISSAO(String EMISSAO) {
        this.EMISSAO = EMISSAO;
    }

    public String getPAGAMENTO() {
        return PAGAMENTO;
    }

    public void setPAGAMENTO(String PAGAMENTO) {
        this.PAGAMENTO = PAGAMENTO;
    }

    public String getVENCIMENTO() {
        return VENCIMENTO;
    }

    public void setVENCIMENTO(String VENCIMENTO) {
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
