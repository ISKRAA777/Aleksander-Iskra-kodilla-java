package com.kodilla.hibernate.invoice.dao_1303;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
//Given
        Invoice invoice = new Invoice("26/02/2020");

        Product cocaCola = new Product("coca-cola");
        Product fanta = new Product("fanta");
        Product snikers = new Product("snikers");

        Item itemcocaCola = new Item(cocaCola, new BigDecimal(3), 2);
        Item itemFanta = new Item(fanta, new BigDecimal(2), 1);
        Item itemSnikers = new Item(snikers, new BigDecimal(4), 1);

        itemcocaCola.setInvoice(invoice);
        itemFanta.setInvoice(invoice);
        itemSnikers.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(itemcocaCola);
        items.add(itemFanta);
        items.add(itemSnikers);

        invoice.setItems(items);

//When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int itemSize = invoice.getItems().size();

        Invoice invoiceReadFromDB = invoiceDao.findById(invoiceId);

//Then
        Assert.assertEquals(invoiceId, invoiceReadFromDB.getId());
        Assert.assertEquals(3, itemSize);
        Assert.assertEquals(itemSize, invoiceReadFromDB.getItems().size());
    }
}
