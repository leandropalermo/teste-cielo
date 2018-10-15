package com.cielo.extrato.lancamento.legado.service.impl;

import com.cielo.extrato.lancamento.legado.dto.ExtratoLancamentoLegadoDTO;
import com.cielo.extrato.lancamento.legado.service.ExtratoLancamentoLegadoService;
import com.cielo.extrato.lancamento.legado.utils.LerArquivoJson;

public class ExtratoLancamentoLegadoServiceImpl implements ExtratoLancamentoLegadoService {
    @Override
    public ExtratoLancamentoLegadoDTO buscarExtratoDeLancamento() {
        ExtratoLancamentoLegadoDTO extratoLancamentoDTO = LerArquivoJson.lerArquivoJson();
        return extratoLancamentoDTO;
    }
}
