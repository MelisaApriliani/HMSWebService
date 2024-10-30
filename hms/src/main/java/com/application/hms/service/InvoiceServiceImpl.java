package com.application.hms.service;

import com.application.hms.model.Invoice;
import com.application.hms.repository.InvoiceRepository;

public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public InvoiceServiceImpl(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public Invoice getInvoice(int id) {
        return invoiceRepository.findInvoiceById(id);
    }
}
