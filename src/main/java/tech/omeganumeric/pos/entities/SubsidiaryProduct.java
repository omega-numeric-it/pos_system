package tech.omeganumeric.pos.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SubsidiaryProduct {

    @EmbeddedId
    private SubsidiaryProductId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("subsidiaryId")
    private Subsidiary subsidiary;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("productId")
    private Product product;



    @OneToMany(
            mappedBy = "subsidiaryProduct",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<SubsidiaryProductSupplier> suppliers = new ArrayList<>();


}
