package app.vercel.ayannadaf.spring_crud_application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private Long id;
    private String name;
    private int age;
    private String designation;

    /* CREATE DATABASE company;
    * USE employee;
    * CREATE TABLE employee(
    * id BIGINT AUTO_INCREMENT PRIMARY KEY,
    * name VARCHAR(255),
    * age INT NOT NULL,
    * designation VARCHAR(255) NOT NULL); */

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
