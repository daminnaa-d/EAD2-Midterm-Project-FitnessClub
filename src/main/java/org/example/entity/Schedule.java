package org.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "programme")
    private String programme;

    @Column(name = "times")
    private String time;

    @Column(name = "price")
    private double price;

    @Column(name = "trainer")
    private String trainer;

    public Schedule(String programme, String time, double price, String trainer) {
        this.programme = programme;
        this.time = time;
        this.price = price;
        this.trainer = trainer;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }
}
