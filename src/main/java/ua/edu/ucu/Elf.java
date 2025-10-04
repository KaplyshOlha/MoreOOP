package ua.edu.ucu;

import ua.edu.ucu.strategy.ElfKickStrategy;

public class Elf extends Character{
    public Elf() {
        super(10, 10);
        this.setKickStrategy(new ElfKickStrategy());
    }
}
