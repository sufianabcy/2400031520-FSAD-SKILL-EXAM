package com.klef.fsad.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    private Integer bookingId; // manual & not null

    private String name;
    private String date;
    private String status;

    public Booking() {
    }

    public Booking(Integer bookingId, String name, String date, String status) {
        this.bookingId = bookingId;
        this.name = name;
        this.date = date;
        this.status = status;
    }
    public Integer getBookingId() {
        return bookingId;
    }
    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Booking ID: " + bookingId + ", Name: " + name + ", Date: " + date + ", Status: " + status;
    }
}
