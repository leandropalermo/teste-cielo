package com.cielo.extrato.lancamento.legado.dto;

import com.cielo.extrato.lancamento.legado.ControleLancamento;
import com.cielo.extrato.lancamento.legado.TotalControleLancamento;
import com.cielo.extrato.lancamento.legado.utils.LerArquivoJson;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class ExtratoLancamentoLegadoDTO implements Serializable {

    private List<ControleLancamento> listaControleLancamento;
    private TotalControleLancamento totalControleLancamento;
    private Integer indice;
    private Integer tamanhoPagina;
    private Integer totalElements;

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public List<ControleLancamento> getListaControleLancamento() {
        return listaControleLancamento;
    }

    public void setListaControleLancamento(List<ControleLancamento> listaControleLancamento) {
        this.listaControleLancamento = listaControleLancamento;
    }

    public TotalControleLancamento getTotalControleLancamento() {
        return totalControleLancamento;
    }

    public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
        this.totalControleLancamento = totalControleLancamento;
    }

    public Integer getTamanhoPagina() {
        return tamanhoPagina;
    }

    public void setTamanhoPagina(Integer tamanhoPagina) {
        this.tamanhoPagina = tamanhoPagina;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }
}
