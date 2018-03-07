package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //When
        Product product1 = new Product("eggs");
        Product product2 = new Product( "spoon");

        Item item1 = new Item(product1, new BigDecimal(50), 4, new BigDecimal(200));
        Item item2 = new Item(product2,  new BigDecimal(200), 3,  new BigDecimal(600));

        product1.getItems().add(item1);
        product1.getItems().add(item2);

        item1.setProduct(product1);
        item2.setProduct(product2);

        Invoice invoice = new Invoice("112");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        int size = invoice.getItems().size();


        //Then
        Assert.assertNotEquals(0, id);
        Assert.assertEquals(2, size);

        //CleanUp
        try {
            invoiceDao.delete(invoice);
        } catch (Exception e) {
        //    do nothing
        }

    }
}
