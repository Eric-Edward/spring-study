package edu.eric.pojo;

import java.util.*;

public class Student {
    private String name;
    private Address address;
    private String[] girlFriendsName;
    private Map<String,String> teacher;
    private Set<String> hobby;
    private List<String> major;
    private String haveChild;
    private Properties info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getGirlFriendsName() {
        return girlFriendsName;
    }

    public void setGirlFriendsName(String[] girlFriendsName) {
        this.girlFriendsName = girlFriendsName;
    }

    public Map<String, String> getTeacher() {
        return teacher;
    }

    public void setTeacher(Map<String, String> teacher) {
        this.teacher = teacher;
    }

    public Set<String> getHobby() {
        return hobby;
    }

    public void setHobby(Set<String> hobby) {
        this.hobby = hobby;
    }

    public List<String> getMajor() {
        return major;
    }

    public void setMajor(List<String> major) {
        this.major = major;
    }

    public String getHaveChild() {
        return haveChild;
    }

    public void setHaveChild(String haveChild) {
        this.haveChild = haveChild;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address.toString() +
                ", girlFriendsName=" + Arrays.toString(girlFriendsName) +
                ", teacher=" + teacher +
                ", hobby=" + hobby +
                ", major=" + major +
                ", haveChild='" + haveChild + '\'' +
                ", info=" + info +
                '}';
    }
}
