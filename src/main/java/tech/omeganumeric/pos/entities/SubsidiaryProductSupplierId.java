package tech.omeganumeric.pos.entities;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SubsidiaryProductSupplierId implements Serializable {
    @Column(name = "supplier_id")
    private Long supplierId;

    @Column(name = "subsidiary_product_id")
    private Long SubsidiaryProductId;

    public SubsidiaryProductSupplierId() {
    }

    public SubsidiaryProductSupplierId(Long supplierId, Long subsidiaryProductId) {
        this.supplierId = supplierId;
        SubsidiaryProductId = subsidiaryProductId;
    }
}
