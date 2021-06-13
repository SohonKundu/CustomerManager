package com.example.demo.Model;


import javax.persistence.*;


@Entity
public class Customer {

    @Id
    @SequenceGenerator(initialValue = 1003221, name = "CustomerSequence")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "CustomerSequence")
    private long id;

    private String userName;

    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
