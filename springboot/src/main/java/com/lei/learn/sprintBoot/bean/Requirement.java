package com.lei.learn.sprintBoot.bean;

import javax.persistence.*;

@Entity
public class Requirement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long requirementId;
    private String name;
    private String Description;

    @ManyToOne
    @JoinColumn(name = "regulationId")
    private Regulation regulation;

    public Requirement() {
    }

    public Long getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(Long requirementId) {
        this.requirementId = requirementId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Regulation getRegulation() {
        return regulation;
    }

    public void setRegulation(Regulation regulation) {
        this.regulation = regulation;
    }
}
