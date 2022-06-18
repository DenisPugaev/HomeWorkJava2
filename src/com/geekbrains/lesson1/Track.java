package com.geekbrains.lesson1;

import com.geekbrains.lesson1.interfaces.Obstacles;

public class Track implements Obstacles {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean passing(int number) {
        if (number >= getLength()) {
            System.out.println("Успешно пробежал дистанцию: " + getLength() + "\n");
            return true;
        } else
            System.out.println("Не смог пробежать дистанцию: " + getLength() + "\n");
        return false;
    }

    @Override
    public int getHeight() {
        return 0;
    }

}
