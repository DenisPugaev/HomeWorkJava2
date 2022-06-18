package com.geekbrains.lesson1;

import com.geekbrains.lesson1.interfaces.Players;

public class Cat implements Players {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Cat(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }


    @Override
    public void jump() {
        System.out.println("Кот " + getName() + " прыгает.");
    }

    @Override
    public void toRun() {
        System.out.println("Кот " + getName() + " бежит.");
    }

    public String getName() {
        return name;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }
}
