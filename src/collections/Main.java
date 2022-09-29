package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal azor = new Animal("Azor", 4);
        Animal szanta = new Animal("Szanta", 6);
        Animal ares = new Animal("Ares", 8);

        List<Animal> animals = new LinkedList<>();
        animals.add(azor);
        animals.add(ares);
        animals.add(szanta);
        animals.add(new Animal("Pimpek", 2));

        System.out.println(animals);

        animals.sort(Comparator.comparingInt(Animal::getAge).reversed());

        System.out.println(animals);

        boolean empty = animals.isEmpty();
        System.out.println(empty);


    }
}
