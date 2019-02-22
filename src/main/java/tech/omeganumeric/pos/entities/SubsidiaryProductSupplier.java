package tech.omeganumeric.pos.entities;

import javax.persistence.*;

@Entity
public class SubsidiaryProductSupplier {

    @EmbeddedId
    private SubsidiaryProductSupplierId  id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("subsidiaryProductId")
    private SubsidiaryProduct subsidiaryProduct;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("supplierId")
    private Supplier supplier;


}
