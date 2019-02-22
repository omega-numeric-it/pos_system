package tech.omeganumeric.pos.entities;

import tech.omeganumeric.pos.entities.audit.DateAudit;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Expense extends DateAudit {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subsidiary_id", nullable = false)
    private Subsidiary subsidiary;
}
