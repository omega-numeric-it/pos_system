package tech.omeganumeric.pos.entities;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SubsidiaryProductId implements Serializable {
    @Column(name = "subsidiary_id")
    private Long subsidiaryId;

    @Column(name = "product_id")
    private Long productId;

    public SubsidiaryProductId() {
    }

    public SubsidiaryProductId(Long subsidiaryId, Long productId) {

        this.subsidiaryId = subsidiaryId;
        this.productId = productId;
    }
}
