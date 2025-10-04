package ua.edu.ucu.strategy;

import java.util.Random;

import ua.edu.ucu.Character;

public class NobleStrategy extends KickStrategy{
    private static final Random RANDOM = new Random();

    @Override
    public void kickStrategy(Character main, Character other) {
        other.setHp(other.getHp() - RANDOM.nextInt(main.getPower()));
    }

}
