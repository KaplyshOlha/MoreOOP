package ua.edu.ucu.strategy;

import ua.edu.ucu.Character;

public class ElfKickStrategy extends KickStrategy{

    @Override
    public void kickStrategy(Character main, Character enemy) {
        if (enemy.getPower() < main.getPower()) {
            enemy.setHp(0);
        }
        else {
            enemy.setHp(enemy.getHp() - 1);
        }
    }
}
