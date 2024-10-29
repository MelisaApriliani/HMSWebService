package com.application.hms.repository;

import com.application.hms.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

    Invoice findInvoiceById(int id);
}
