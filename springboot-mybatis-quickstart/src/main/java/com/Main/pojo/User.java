package com.Main.pojo;

public class User {
    private Integer id;
    private String name;
    private Short sge;
    private Short gender;
    private String phone;

    public User() {
    }
    public User(Integer id, String name, Short sge, Short gender, String phone) {
        this.id = id;
        this.name = name;
        this.sge = sge;
        this.gender = gender;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getSge() {
        return sge;
    }

    public void setSge(Short sge) {
        this.sge = sge;
    }

    public Short getGender() {
        return gender;
    }

    public void setGender(Short gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sge=" + sge +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                '}';
    }
}
