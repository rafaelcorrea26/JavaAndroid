package com.example.conversorcontaagua;

import java.util.Date;

public class CadastroContaAgua {
    private Integer ID;
    private Double ValorTotalAgua;
    private Double ConsumoPorMetro;
    private Double ValorTaxaDeServico;
    private Double ValorUtilizadoMesPassado;
    private Double ValorUtilizadoEsteMes;
    private Double TaxaDivida;
    private Double TotalMetrosUtilizado;
    private Double TotalPorMetro;
    private Double TotalAPagarPorMes;
    private String DataAgua;

    public String getDataAgua() {
        return DataAgua;
    }

    public void setDataAgua(String dataAgua) {
        DataAgua = dataAgua;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Double getValorTotalAgua() {
        return ValorTotalAgua;
    }

    public void setValorTotalAgua(Double valorTotalAgua) {
        ValorTotalAgua = valorTotalAgua;
    }

    public Double getConsumoPorMetro() {
        return ConsumoPorMetro;
    }

    public void setConsumoPorMetro(Double consumoPorMetro) {
        ConsumoPorMetro = consumoPorMetro;
    }

    public Double getValorTaxaDeServico() {
        return ValorTaxaDeServico;
    }

    public void setValorTaxaDeServico(Double valorTaxaDeServico) {
        ValorTaxaDeServico = valorTaxaDeServico;
    }

    public Double getValorUtilizadoMesPassado() {
        return ValorUtilizadoMesPassado;
    }

    public void setValorUtilizadoMesPassado(Double valorUtilizadoMesPassado) {
        ValorUtilizadoMesPassado = valorUtilizadoMesPassado;
    }

    public Double getValorUtilizadoEsteMes() {
        return ValorUtilizadoEsteMes;
    }

    public void setValorUtilizadoEsteMes(Double valorUtilizadoEsteMes) {
        ValorUtilizadoEsteMes = valorUtilizadoEsteMes;
    }

    public Double getTaxaDivida() {
        return TaxaDivida;
    }

    public void setTaxaDivida(Double taxaDivida) {
        TaxaDivida = taxaDivida;
    }

    public Double getTotalMetrosUtilizado() {
        return TotalMetrosUtilizado;
    }

    public void setTotalMetrosUtilizado(Double totalMetrosUtilizado) {
        TotalMetrosUtilizado = totalMetrosUtilizado;
    }

    public Double getTotalPorMetro() {
        return TotalPorMetro;
    }

    public void setTotalPorMetro(Double totalPorMetro) {
        TotalPorMetro = totalPorMetro;
    }

    public Double getTotalAPagarPorMes() {
        return TotalAPagarPorMes;
    }

    public void setTotalAPagarPorMes(Double totalAPagarPorMes) {
        TotalAPagarPorMes = totalAPagarPorMes;
    }



}