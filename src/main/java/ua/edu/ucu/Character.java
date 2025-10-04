package ua.edu.ucu;

import lombok.Data;
import ua.edu.ucu.strategy.KickStrategy;

@Data
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public boolean isAlive () {
        return hp > 0;
    }
    
    public void kick(Character other) {
        kickStrategy.kickStrategy(this, other);
    }
}
