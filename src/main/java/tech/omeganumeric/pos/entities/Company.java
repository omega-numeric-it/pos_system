package tech.omeganumeric.pos.entities;

import tech.omeganumeric.pos.entities.audit.DateAudit;

import javax.persistence.*;
import java.util.List;


@Entity
public class Company extends DateAudit {

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "company")
    private List<FinancialInstitution> financialInstitutions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taxSystem_id", nullable = false)
    private TaxSystem taxSystem;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "company")
    private List<Subsidiary> subsidiaries;
}
