package com.global.scheduler_finance.modules.financial_transfer.entities;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Transfer {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String contaOrigem;

    @NotBlank
    private String contaDestino;

    @NotNull
    private BigDecimal valor;

    @NotNull
    private LocalDate dataAgendamento; // DATA EM QUE ESTA SENDO AGENDADO A TRANSFERENCIA

    @NotNull
    private LocalDate dataTransferencia; // DATA EM QUE ESTA AGENDADO PARA EFETUAR A TRANSFERENCIA

    private BigDecimal taxa;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public @NotBlank String getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(@NotBlank String contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public @NotBlank String getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(@NotBlank String contaDestino) {
        this.contaDestino = contaDestino;
    }

    public @NotNull BigDecimal getValor() {
        return valor;
    }

    public void setValor(@NotNull BigDecimal valor) {
        this.valor = valor;
    }

    public @NotNull LocalDate getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(@NotNull LocalDate dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public @NotNull LocalDate getDataTransferencia() {
        return dataTransferencia;
    }

    public void setDataTransferencia(@NotNull LocalDate dataTransferencia) {
        this.dataTransferencia = dataTransferencia;
    }

    public BigDecimal getTaxa() {
        return taxa;
    }

    public void setTaxa(BigDecimal taxa) {
        this.taxa = taxa;
    }
}
