package tech.omeganumeric.pos.entities;

import tech.omeganumeric.pos.entities.audit.DateAudit;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Subsidiary extends DateAudit {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "subsidiary")
    private List<Cashier> cashiers;


    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "subsidiary")
    private List<Expense> expenses;






    /***
     * DEFINIED THE RELATION BETWEEN  SUBSIDAIRY AND PRODUCT==>> STOCK OF A SUSIDIARY
     */
/*
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "subsidiary_products",
            joinColumns = { @JoinColumn(name = "subsidiary_id") },
            inverseJoinColumns = { @JoinColumn(name = "product_id") })
    private List<Product> products = new ArrayList<>();
*/


    @OneToMany(
            mappedBy = "subsidiary",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<SubsidiaryProduct> products = new ArrayList<>();
}
