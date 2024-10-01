package com.global.scheduler_finance.modules.financial_transfer.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class CreateDTO {
    @NotNull
//    @NotBlank(message = "Informe o valor da transferência")
    private BigDecimal valor;

    @NotNull
//    @NotBlank(message = "Informe a data da transferência EX: AAAA-MM-DD")
    private String dataTransferencia;

    @NotBlank
//    @NotBlank(message = "Informe a conta origem")
    private String contaOrigem;

    @NotBlank
//    @NotBlank(message = "Informe a conta destino")
    private String contaDestino;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(@NotNull @NotBlank(message = "Informe o valor da transferência") BigDecimal valor) {
        this.valor = valor;
    }

    public String getDataTransferencia() {
        return dataTransferencia;
    }

    public void setDataTransferencia(@NotNull @NotBlank(message = "Informe a data da transferência EX: AAAA-MM-DD") String dataTransferencia) {
        this.dataTransferencia = dataTransferencia;
    }

    public String getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(@NotBlank @NotBlank(message = "Informe a conta origem") String contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public String getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(@NotBlank @NotBlank(message = "Informe a conta destino") String contaDestino) {
        this.contaDestino = contaDestino;
    }
}
