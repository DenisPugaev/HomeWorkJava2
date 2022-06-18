package com.geekbrains.lesson1;


import com.geekbrains.lesson1.interfaces.Players;

public class Robot implements Players {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void jump() {
        System.out.println("Робот " + getName() + " прыгает.");
    }

    @Override
    public void toRun() {
        System.out.println("Робот " + getName() + " бежит.");
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


