package com.application.hms.service;

import com.application.hms.model.Invoice;

public interface InvoiceService {

    Invoice createInvoice(Invoice invoice);
    Invoice getInvoice(int id);
}
