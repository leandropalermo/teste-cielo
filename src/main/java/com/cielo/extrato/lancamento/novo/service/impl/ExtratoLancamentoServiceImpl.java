package com.cielo.extrato.lancamento.novo.service.impl;

import com.cielo.extrato.lancamento.legado.ControleLancamento;
import com.cielo.extrato.lancamento.legado.dto.ExtratoLancamentoLegadoDTO;
import com.cielo.extrato.lancamento.legado.service.impl.ExtratoLancamentoLegadoServiceImpl;
import com.cielo.extrato.lancamento.novo.dto.ExtratoLancamentoDTO;
import com.cielo.extrato.lancamento.novo.dto.ExtratoLancamentoResponseDTO;
import com.cielo.extrato.lancamento.novo.service.ExtratoLancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ExtratoLancamentoServiceImpl implements ExtratoLancamentoService {

    private ExtratoLancamentoLegadoServiceImpl extratoLancamentoLegadoService;

    ConversionService conversionService;

    @Autowired
    public ExtratoLancamentoServiceImpl(ConversionService conversionService) {
        this.conversionService = conversionService;
        extratoLancamentoLegadoService = new ExtratoLancamentoLegadoServiceImpl();
    }

    @Override
    public ExtratoLancamentoResponseDTO buscarExtratoDeLancamento() {
        ExtratoLancamentoResponseDTO response = ExtratoLancamentoResponseDTO.builder().extratoLancamento(new ArrayList<>()).build();
        ExtratoLancamentoLegadoDTO extratoLancamentoLegadoDTO = extratoLancamentoLegadoService.buscarExtratoDeLancamento();
        extratoLancamentoLegadoDTO.
                getListaControleLancamento().
                stream().
                forEach(controleLancamento -> {
                    ExtratoLancamentoDTO extratoLancamentoDTO = conversionService.convert(controleLancamento, ExtratoLancamentoDTO.class);
                    response.getExtratoLancamento().add(extratoLancamentoDTO);
                });
        response.setIndice(extratoLancamentoLegadoDTO.getIndice());
        response.setTamanhoPagina(extratoLancamentoLegadoDTO.getTamanhoPagina());
        response.setTotalElements(extratoLancamentoLegadoDTO.getTotalElements());
        return response;
    }
}
