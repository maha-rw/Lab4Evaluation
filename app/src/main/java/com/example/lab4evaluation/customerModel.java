package com.example.lab4evaluation;
public class customerModel{
    private int ID;
    private String name;
    private int age;
    private boolean isActive;

    public customerModel(){

    }
    public customerModel(int i, String n, int a, boolean ac)
    {
        ID=i;
        name=n;
        age=a;
        isActive=ac;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "cutomerModel{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }
}

