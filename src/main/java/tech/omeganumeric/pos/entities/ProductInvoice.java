package tech.omeganumeric.pos.entities;

import javax.persistence.*;

@Entity
public class ProductInvoice {

    @EmbeddedId
    private ProductInvoiceId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("invoiceId")
    private Invoice invoice;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("productId")
    private Product product;


}
