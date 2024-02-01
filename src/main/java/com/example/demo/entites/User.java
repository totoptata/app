package com.example.demo.entites;

import jakarta.persistence.*;

@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String FN;
    private String LN;
    private int id;
    private String email;
    public User(){

    }

    public String getFN() {
        return FN;
    }

    public void setFN(String FN) {
        this.FN = FN;
    }

    public String getLN() {
        return LN;
    }

    public void setLN(String LN) {
        this.LN = LN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String FN, String LN, int id, String email) {
        this.FN = FN;
        this.LN = LN;
        this.id = id;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "FN='" + FN + '\'' +
                ", LN='" + LN + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
