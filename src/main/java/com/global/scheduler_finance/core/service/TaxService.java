package com.global.scheduler_finance.core.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class TaxService {

    public BigDecimal calculateTax(LocalDate dataAgendamento, LocalDate dataTransferencia, BigDecimal valor) {
        long diasEntre = ChronoUnit.DAYS.between(dataAgendamento, dataTransferencia);
        System.out.println(diasEntre);
        if (diasEntre == 0) {
            return valor.multiply(BigDecimal.valueOf(0.025)).add(BigDecimal.valueOf(3.00));
        } else if (diasEntre >= 1 && diasEntre <= 10) {
            return BigDecimal.valueOf(12.00);
        } else if (diasEntre >= 11 && diasEntre <= 20) {
            return valor.multiply(BigDecimal.valueOf(0.082));
        } else if (diasEntre >= 21 && diasEntre <= 30) {
            return valor.multiply(BigDecimal.valueOf(0.069));
        } else if (diasEntre >= 31 && diasEntre <= 40) {
            return valor.multiply(BigDecimal.valueOf(0.047));
        } else if (diasEntre >= 41 && diasEntre <= 50) {
            return valor.multiply(BigDecimal.valueOf(0.017));
        }
        throw new IllegalArgumentException("Data de transferência inválida.");
    }
}
