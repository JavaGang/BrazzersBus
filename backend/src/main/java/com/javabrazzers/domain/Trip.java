/*
 * Developed by Cheshire on 26.07.18 14:16.
 * Last modified 26.07.18 14:16.
 * Copyright (c) 2018. All rights reserved.
 */

package com.javabrazzers.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "trip")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String busModel;
    private String from;
    private String to;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateMin;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateMax;

    private double price;

    public Trip() {
    }

    public Trip(String busModel, String from, String to, LocalDateTime dateMin, LocalDateTime dateMax, double price) {
        this.busModel = busModel;
        this.from = from;
        this.to = to;
        this.dateMin = dateMin;
        this.dateMax = dateMax;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBusModel() {
        return busModel;
    }

    public void setBusModel(String busModel) {
        this.busModel = busModel;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalDateTime getDateMin() {
        return dateMin;
    }

    public void setDateMin(LocalDateTime dateMin) {
        this.dateMin = dateMin;
    }

    public LocalDateTime getDateMax() {
        return dateMax;
    }

    public void setDateMax(LocalDateTime dateMax) {
        this.dateMax = dateMax;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
