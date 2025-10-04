package ua.edu.ucu;

import ua.edu.ucu.strategy.HobbitKickStrategy;

public class Hobbit extends Character{
    public Hobbit() {
        super(0, 3);
        this.setKickStrategy(new HobbitKickStrategy());
    }
}
