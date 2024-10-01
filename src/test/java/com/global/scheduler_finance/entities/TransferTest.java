package com.global.scheduler_finance.entities;

import com.global.scheduler_finance.modules.financial_transfer.entities.Transfer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class TransferTest {

    @Test
    public void testSetAndGetId() {
        Transfer transfer = new Transfer();
        transfer.setId(1L);
        assertEquals(1L, transfer.getId());
    }

    @Test
    public void testSetAndGetContaOrigem() {
        Transfer transfer = new Transfer();
        transfer.setContaOrigem("123456-7");
        assertEquals("123456-7", transfer.getContaOrigem());
    }

    @Test
    public void testSetAndGetContaDestino() {
        Transfer transfer = new Transfer();
        transfer.setContaDestino("765432-1");
        assertEquals("765432-1", transfer.getContaDestino());
    }

    @Test
    public void testSetAndGetValor() {
        Transfer transfer = new Transfer();
        BigDecimal valor = new BigDecimal("1000.00");
        transfer.setValor(valor);
        assertEquals(valor, transfer.getValor());
    }

    @Test
    public void testSetAndGetDataAgendamento() {
        Transfer transfer = new Transfer();
        LocalDate dataAgendamento = LocalDate.of(2024, 10, 1);
        transfer.setDataAgendamento(dataAgendamento);
        assertEquals(dataAgendamento, transfer.getDataAgendamento());
    }

    @Test
    public void testSetAndGetDataTransferencia() {
        Transfer transfer = new Transfer();
        LocalDate dataTransferencia = LocalDate.of(2024, 10, 5);
        transfer.setDataTransferencia(dataTransferencia);
        assertEquals(dataTransferencia, transfer.getDataTransferencia());
    }

    @Test
    public void testSetAndGetTaxa() {
        Transfer transfer = new Transfer();
        BigDecimal taxa = new BigDecimal("10.00");
        transfer.setTaxa(taxa);
        assertEquals(taxa, transfer.getTaxa());
    }
}
