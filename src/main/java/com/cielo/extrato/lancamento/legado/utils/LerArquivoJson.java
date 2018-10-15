package com.cielo.extrato.lancamento.legado.utils;

import com.cielo.extrato.lancamento.legado.dto.ExtratoLancamentoLegadoDTO;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class LerArquivoJson {

    private static String CAMINHO_ARQUIVO = "/lancamento-conta-legado.txt";

    public static ExtratoLancamentoLegadoDTO lerArquivoJson() {
        ExtratoLancamentoLegadoDTO extratoLancamentoDTO = null;
        try {
            Gson gson = new Gson();
            InputStream in = ExtratoLancamentoLegadoDTO.class.getResourceAsStream(CAMINHO_ARQUIVO);
            String text = IOUtils.toString(in, StandardCharsets.UTF_8.name());
            extratoLancamentoDTO = gson.fromJson(text, ExtratoLancamentoLegadoDTO.class);
        } catch (Exception e) {
            e.getStackTrace();
        }
        return extratoLancamentoDTO;
    }
}
