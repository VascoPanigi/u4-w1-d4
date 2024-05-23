package es3.entities;

import es3.interfaces.Checker;

public class Volunteer implements Checker {
    private int age;
    private String name;
    //    private CV[] curriculum;
    private boolean curriculum;

    public Volunteer(String name, int age, boolean curriculum) {
        this.name = name;
        this.age = age;
        this.curriculum = curriculum;
//        this.curriculum = new CV[3];
    }

    @Override
    public void checkIn() {
        System.out.println("A volunteer just checked in");
    }
}
