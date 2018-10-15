package com.cielo.extrato.lancamento.novo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExtratoLancamentoResponseDTO {
    List<ExtratoLancamentoDTO> extratoLancamento;
    private Integer indice;
    private Integer tamanhoPagina;
    private Integer totalElements;
}
