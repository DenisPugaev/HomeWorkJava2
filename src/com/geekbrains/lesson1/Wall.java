package com.geekbrains.lesson1;

import com.geekbrains.lesson1.interfaces.Obstacles;

public class Wall implements Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public boolean passing(int number) {
        if (number >= getHeight()) {
            System.out.println("Успешно перепрыгнул препятствие: " + getHeight() + "\n");
            return true;
        } else
            System.out.println("Не смог перепрыгнуть препятсятвие: " + getHeight() + "\n");
        return false;
    }
}
