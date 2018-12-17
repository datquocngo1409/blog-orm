package com.codegym.blog.model;


import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name, decripstion, infomation;

    public Blog() {
    }

    public Blog(String name, String decripstion, String infomation) {
        this.name = name;
        this.decripstion = decripstion;
        this.infomation = infomation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecripstion() {
        return decripstion;
    }

    public void setDecripstion(String decripstion) {
        this.decripstion = decripstion;
    }

    public String getInfomation() {
        return infomation;
    }

    public void setInfomation(String infomation) {
        this.infomation = infomation;
    }
}
