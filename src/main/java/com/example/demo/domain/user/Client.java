package com.example.demo.domain.user;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String clientName;

    @Column(nullable = false, unique = true)
    private String email;

    private Boolean active;

    @Temporal(TemporalType.DATE)
    private Date subscriptionDate;

    private String gender;
    private String phoneRegistered;
    private String nearCity;
    private String age;

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(Date subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneRegistered() {
        return phoneRegistered;
    }

    public void setPhoneRegistered(String phoneRegistered) {
        this.phoneRegistered = phoneRegistered;
    }

    public String getNearCity() {
        return nearCity;
    }

    public void setNearCity(String nearCity) {
        this.nearCity = nearCity;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
