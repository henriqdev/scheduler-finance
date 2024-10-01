package com.global.scheduler_finance.modules.financial_transfer;

import com.global.scheduler_finance.common.Helpers;
import com.global.scheduler_finance.core.service.TaxService;
import com.global.scheduler_finance.modules.financial_transfer.dto.CreateDTO;
import com.global.scheduler_finance.modules.financial_transfer.entities.Transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class TransferService {
    @Autowired
    private TransferRepository transferRepository;

    @Autowired
    private TaxService taxService;

    public Transfer create(CreateDTO createDTO) {
        LocalDate currentDate = Helpers.getCurrentLocalDate();
        LocalDate appointmentDate = Helpers.convertStringToLocalDate(createDTO.getDataTransferencia());

        BigDecimal taxa = taxService.calculateTax(currentDate, appointmentDate, createDTO.getValor());
        System.out.println("taxa");
        System.out.println(taxa);
        Transfer transfer = new Transfer();

        transfer.setTaxa(taxa);
        transfer.setValor(createDTO.getValor());
        transfer.setDataAgendamento(currentDate);
        transfer.setDataTransferencia(appointmentDate);

        // criar metodo para verifica se as contas são validas
        transfer.setContaDestino(createDTO.getContaDestino());
        transfer.setContaOrigem(createDTO.getContaOrigem());

        return transferRepository.save(transfer);
    }

    public List<Transfer> findAll() {
        return transferRepository.findAll();
    }
}
