package tech.omeganumeric.pos.entities;

import tech.omeganumeric.pos.entities.audit.DateAudit;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product extends DateAudit {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;


    /***
     *  MAPPED THE RELATION BETWEEN  SUBSIDAIRY AND PRODUCT===> STOCK RELATION
     */
  /*  @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "products")*/

    @OneToMany(
            mappedBy = "product",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<SubsidiaryProduct> subsidiaries = new ArrayList<>();



    /***
     * DEFINIED THE RELATION BETWEEN  PRODUCT AND INVOICE==>> ON SOLDE
     */
   /* @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "product_invoices",
            joinColumns = { @JoinColumn(name = "product_id") },
            inverseJoinColumns = { @JoinColumn(name = "invoice_id") })*/

    @OneToMany(
            mappedBy = "product",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ProductInvoice> invoices = new ArrayList<>();

}
