package com.cielo.extrato.lancamento.novo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExtratoLancamentoDTO {

    private String dataLancamento;
    private String descricao;
    private Long numero;
    private String situacao;
    private String dataConfirmacao;
    private String dadosBancarios;
    private String valorFinal;

}
