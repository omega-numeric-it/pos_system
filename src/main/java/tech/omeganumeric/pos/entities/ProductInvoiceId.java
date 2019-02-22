package tech.omeganumeric.pos.entities;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductInvoiceId implements Serializable {
    @Column(name = "invoice_idd")
    private Long invoiceId;

    @Column(name = "product_id")
    private Long productId;

    public ProductInvoiceId() {
    }

    public ProductInvoiceId(Long invoiceId, Long productId) {
        this.invoiceId = invoiceId;
        this.productId = productId;
    }
}
