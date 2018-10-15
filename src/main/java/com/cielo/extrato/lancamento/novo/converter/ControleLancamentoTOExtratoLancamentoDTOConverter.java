package com.cielo.extrato.lancamento.novo.converter;

import com.cielo.extrato.lancamento.legado.ControleLancamento;
import com.cielo.extrato.lancamento.legado.LancamentoContaCorrenteCliente;
import com.cielo.extrato.lancamento.novo.dto.ExtratoLancamentoDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.NumberFormat;

@Component
public class ControleLancamentoTOExtratoLancamentoDTOConverter implements Converter<ControleLancamento, ExtratoLancamentoDTO> {

    @Override
    public ExtratoLancamentoDTO convert(ControleLancamento controleLancamento) {
        StringBuilder descricao = new StringBuilder();
        descricao.append(controleLancamento.getNomeBanco().trim());
        descricao.append(" Ag ");
        descricao.append(controleLancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroAgencia());
        descricao.append(" CC ");
        descricao.append(controleLancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroContaCorrente());

        NumberFormat nf = new java.text.DecimalFormat("#,###,##0.00");
        StringBuilder valorFinal = new StringBuilder();
        valorFinal.append("R$ ");
        valorFinal.append(nf.format(controleLancamento.getValorLancamentoRemessa()));

        ExtratoLancamentoDTO extratoLancamentoDTO =
                ExtratoLancamentoDTO.builder().
                        dataLancamento(controleLancamento.getDataLancamentoContaCorrenteCliente()).
                        descricao(controleLancamento.getLancamentoContaCorrenteCliente().getNomeTipoOperacao()).
                        numero(controleLancamento.getLancamentoContaCorrenteCliente().getNumeroRemessaBanco()).
                        situacao(controleLancamento.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa()).
                        dataConfirmacao(controleLancamento.getDataEfetivaLancamento()).
                        dadosBancarios(descricao.toString()).
                        valorFinal(valorFinal.toString()).
                build();

        return extratoLancamentoDTO;
    }
}
