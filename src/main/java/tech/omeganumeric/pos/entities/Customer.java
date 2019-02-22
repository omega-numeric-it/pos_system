package tech.omeganumeric.pos.entities;

import tech.omeganumeric.pos.entities.audit.DateAudit;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Customer extends DateAudit {

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "customer")
    private List<Invoice> invoices;
}
