package ru.argustelecom.task.witalijbukatkin.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class NamedEntity extends BaseEntity{
    @Column(unique = true)
    private String name;

    public NamedEntity() {
    }

    public NamedEntity(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
