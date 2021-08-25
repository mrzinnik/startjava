package com.startjava.lesson_2_3.robot;

public class Jaeger {

    private String name;
    private float height;
    private int weight;
    private String weapon;

    public Jaeger() {}

    public Jaeger(String name, float height, int weight, String weapon) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean drift() {
        System.out.println(name + " pilots engaged in neural bridge");
        return true;
    }

    public void move() {
        System.out.println(name + " is moving");
    }

    public String scanKaiju() {
        return name + " completed scanning";
    }

    public void useWeapon() {
        System.out.println(name + " use " + weapon);
    }

    public String toString() {
        return "name = " + name + "\n" +
                "height = " + height + "\n" +
                "weight = " + weight + "\n" +
                "weapon = " + weapon;
    } 
}