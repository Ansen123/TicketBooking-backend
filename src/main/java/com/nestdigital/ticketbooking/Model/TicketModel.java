package com.nestdigital.ticketbooking.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class TicketModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String date;
    private String venue;

    public TicketModel(int id, String name, String date, String venue) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.venue = venue;
    }

    public TicketModel() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getVenue() {
        return venue;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}
