package ru.argustelecom.task.witalijbukatkin.entity;

import javax.persistence.Entity;

@Entity
public class Node extends BaseEntity {
    private String name;
    private String region;
    private String street;
    private int house;

    public Node(long id, String name, String region, String street, int house) {
        super(id);
        this.name = name;
        this.region = region;
        this.street = street;
        this.house = house;
    }

    public Node(){
        super(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }
}
