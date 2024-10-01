package com.global.scheduler_finance.modules.financial_transfer;

import com.global.scheduler_finance.modules.financial_transfer.dto.CreateDTO;
import com.global.scheduler_finance.modules.financial_transfer.entities.Transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/transferencias")
public class TransferController {

    @Autowired
    private TransferService service;

    @PostMapping
    public ResponseEntity<Transfer> scheduleTransfer(@RequestBody @Valid CreateDTO dto) {
        Transfer res = service.create(dto);
        return ResponseEntity.ok(res);
    }

    @GetMapping
    public List<Transfer> findTransfer() {
        return service.findAll();
    }
}
