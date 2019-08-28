package com.lei.learn.sprintBoot.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Regulation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long regulationId;

    private String name;

    private Date validFrom;

    private Date validTo;

    @OneToMany(targetEntity = Requirement.class,mappedBy = "regulation")
    private List<Requirement> requirements;

    public Regulation() {
    }

    public Long getRegulationId() {
        return regulationId;
    }

    public void setRegulationId(Long regulationId) {
        this.regulationId = regulationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public List<Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<Requirement> requirements) {
        this.requirements = requirements;
    }
}
