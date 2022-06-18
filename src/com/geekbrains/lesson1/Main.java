package com.geekbrains.lesson1;
//Created by: Pugaev Denis

import com.geekbrains.lesson1.interfaces.Obstacles;
import com.geekbrains.lesson1.interfaces.Players;

import java.util.Random;

/*
Homework
for
Java2 lesson 1

Задача:
1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
2.Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
3.Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();                   //Дистанция и высота препятствий генерируется Random() с ограничнениями 1000 и 100, чтобы хотябы один из обьектов смог пройти все испытания.
        int lengthObstacles = rnd.nextInt(1000);
        int heightObstacles = rnd.nextInt(10);

        Players[] players = new Players[3];          // Создатеся первый масссив с учтастниками
        players[0] = new Cat("Мартин", 100, 3); // Ограничиния оставил не изменяемые, по необходисмости можно поменять их в ручную или реализовать изменения через Сеттеры.
        players[1] = new Human("Борис", 500, 5);
        players[2] = new Robot("AtlasD7", 1000, 10);

        Obstacles[] obstacles = new Obstacles[2];    // Создатеся второй масссив с препятсвиями
        obstacles[0] = new Track(lengthObstacles);
        obstacles[1] = new Wall(heightObstacles);

        for (Players p : players) {   //Участники путем перебора массива проходят препятсвия.
            p.toRun();
            obstacles[0].passing(p.getRunDistance());
            if (p.getRunDistance() >= obstacles[0].getLength()) { // Те участники которые не прошли первый этап("Дорожку")не проходят на второй("Стена")
                p.jump();
                obstacles[1].passing(p.getJumpHeight());
            } else System.out.println(p.getName() + " не прошел первый этап и был ДИСКВАЛИФИЦИРОВАН! \n");
        }
    }
}


