package com.cielo.extrato.lancamento.novo.controller;

import com.cielo.extrato.lancamento.novo.dto.ExtratoLancamentoResponseDTO;
import com.cielo.extrato.lancamento.novo.service.ExtratoLancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/extrato/lancamento")
public class ExtratoLancamentoController {

    private ExtratoLancamentoService extratoLancamentoService;

    @Autowired
    public ExtratoLancamentoController(ExtratoLancamentoService extratoLancamentoService) {
        this.extratoLancamentoService = extratoLancamentoService;
    }

    @GetMapping
    public ExtratoLancamentoResponseDTO buscarExtratoDeLancamento() {
        return extratoLancamentoService.buscarExtratoDeLancamento();
    }
}
