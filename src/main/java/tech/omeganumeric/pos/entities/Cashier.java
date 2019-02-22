package tech.omeganumeric.pos.entities;

import tech.omeganumeric.pos.entities.audit.DateAudit;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cashier extends DateAudit {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subsidiary_id", nullable = false)
    private Subsidiary subsidiary;



    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "cashier")
    private List<Invoice> invoices;

}
