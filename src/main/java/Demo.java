import java.lang.reflect.InvocationTargetException;

import ua.edu.ucu.Character;
import ua.edu.ucu.CharacterFactory;

public class Demo {
    public static void main(String args[]) 
    throws NoSuchMethodException, InstantiationException,
                   IllegalAccessException, InvocationTargetException {
        System.out.println("Hello, world!");

        Character randomCharacter = CharacterFactory.createRandomCharacterReflections();
        System.out.println(randomCharacter);

        Character randomCharacterLib = CharacterFactory.createRandomCharacterWithLibReflections();
        System.out.println(randomCharacterLib);
    }
}
