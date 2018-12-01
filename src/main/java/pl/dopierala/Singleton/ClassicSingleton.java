package pl.dopierala.Singleton;

import java.util.Objects;

public class ClassicSingleton {
    private static ClassicSingleton uniqueInstance;

    private ClassicSingleton() {
    }

    public static ClassicSingleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ClassicSingleton();
            System.out.println("New object has been crated.");
        } else {
            System.out.println("Instance already exists!");
        }
        return uniqueInstance;
    }

}
