package org.Riwi.EventsAPIcmRest.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import java.time.LocalDate;

@Entity
@Table
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "eventDate", nullable = false)
    @FutureOrPresent
    private LocalDate date;
    @Column(name = "ubication")
    private String ubication;
    @Column(name = "maximumCapacity")
    private Integer capacity;

    public EventEntity() {
    }

    public EventEntity(String id, String name, LocalDate date, String ubication, Integer capacity) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.ubication = ubication;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "eventEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", ubication='" + ubication + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
