package ua.edu.ucu;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

public class CharacterFactory {
    public static final Random RANDOM = new Random();

    public static final List<Class<?>> classes 
        = List.of(Hobbit.class, Elf.class, King.class, Knight.class);

    public static Character createRandomCharacterReflections() 
    throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException{
        int choice = RANDOM.nextInt(classes.size());
        Class<?> characterClass = classes.get(choice);
        return (Character) characterClass.getDeclaredConstructor().newInstance();
    }

    public static Character createRandomCharacterWithLibReflections() 
    throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        Reflections reflections = new Reflections("ua.edu.ucu");
        Set<Class<? extends Character>> subTypes = 
            reflections.getSubTypesOf(Character.class);

        subTypes.removeIf(c -> Modifier.isAbstract(c.getModifiers()));
        if (subTypes.isEmpty()) {
            throw new IllegalStateException("No instantiable subclasses of Character found!");
        }
        
        int choice = RANDOM.nextInt(subTypes.size());
        Class<?> characterClass = (Class<?>) subTypes.toArray()[choice];
        return (Character) characterClass.getDeclaredConstructor().newInstance();
    }
}