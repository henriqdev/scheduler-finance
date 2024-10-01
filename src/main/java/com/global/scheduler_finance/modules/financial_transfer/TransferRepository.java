package com.global.scheduler_finance.modules.financial_transfer;

import com.global.scheduler_finance.modules.financial_transfer.entities.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<Transfer, Long> {
}
