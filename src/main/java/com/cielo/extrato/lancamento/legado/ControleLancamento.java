package com.cielo.extrato.lancamento.legado;

import java.math.BigDecimal;

public class ControleLancamento {

    private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
    private String dataEfetivaLancamento;
    private String dataLancamentoContaCorrenteCliente;
    private Long numeroEvento;
    private String descricaoGrupoPagamento;
    private String codigoIdentificadorUnico;
    private String nomeBanco;
    private Integer quantidadeLancamentoRemessa;
    private String numeroRaizCNPJ;
    private String numeroSufixoCNPJ;
    private BigDecimal valorLancamentoRemessa;
    private String dateLancamentoContaCorrenteCliente;
    private String dateEfetivaLancamento;

    public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
        return lancamentoContaCorrenteCliente;
    }

    public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
        this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
    }

    public String getDataEfetivaLancamento() {
        return dataEfetivaLancamento;
    }

    public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
        this.dataEfetivaLancamento = dataEfetivaLancamento;
    }

    public String getDataLancamentoContaCorrenteCliente() {
        return dataLancamentoContaCorrenteCliente;
    }

    public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
        this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
    }

    public Long getNumeroEvento() {
        return numeroEvento;
    }

    public void setNumeroEvento(Long numeroEvento) {
        this.numeroEvento = numeroEvento;
    }

    public String getDescricaoGrupoPagamento() {
        return descricaoGrupoPagamento;
    }

    public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
        this.descricaoGrupoPagamento = descricaoGrupoPagamento;
    }

    public String getCodigoIdentificadorUnico() {
        return codigoIdentificadorUnico;
    }

    public void setCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
        this.codigoIdentificadorUnico = codigoIdentificadorUnico;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Integer getQuantidadeLancamentoRemessa() {
        return quantidadeLancamentoRemessa;
    }

    public void setQuantidadeLancamentoRemessa(Integer quantidadeLancamentoRemessa) {
        this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
    }

    public String getNumeroRaizCNPJ() {
        return numeroRaizCNPJ;
    }

    public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
        this.numeroRaizCNPJ = numeroRaizCNPJ;
    }

    public String getNumeroSufixoCNPJ() {
        return numeroSufixoCNPJ;
    }

    public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
        this.numeroSufixoCNPJ = numeroSufixoCNPJ;
    }

    public BigDecimal getValorLancamentoRemessa() {
        return valorLancamentoRemessa;
    }

    public void setValorLancamentoRemessa(BigDecimal valorLancamentoRemessa) {
        this.valorLancamentoRemessa = valorLancamentoRemessa;
    }

    public String getDateLancamentoContaCorrenteCliente() {
        return dateLancamentoContaCorrenteCliente;
    }

    public void setDateLancamentoContaCorrenteCliente(String dateLancamentoContaCorrenteCliente) {
        this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
    }

    public String getDateEfetivaLancamento() {
        return dateEfetivaLancamento;
    }

    public void setDateEfetivaLancamento(String dateEfetivaLancamento) {
        this.dateEfetivaLancamento = dateEfetivaLancamento;
    }
}
