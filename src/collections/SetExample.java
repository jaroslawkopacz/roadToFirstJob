package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        Animal azor = new Animal("Azor", 4);
        Animal szanta = new Animal("Szanta", 6);
        Animal ares = new Animal("Ares", 8);

        TreeSet<Animal> treeAnimals = new TreeSet<>();
        treeAnimals.add(azor);
        treeAnimals.add(ares);
        treeAnimals.add(new Animal("Franek", 6));
        treeAnimals.add(szanta);

        System.out.println(treeAnimals);

//        System.out.println(treeAnimals.ceiling(new Animal("Szanta", 7)));
//        System.out.println(treeAnimals.higher(new Animal("Szanta", 5)));
//        System.out.println(treeAnimals.floor(new Animal("Szanta", 6)));
//        System.out.println(treeAnimals.lower(new Animal("Ares", 8)));

        System.out.println(treeAnimals.pollLast());
        System.out.println(treeAnimals);
        System.out.println(treeAnimals.last());
        System.out.println(treeAnimals);


    }
}
