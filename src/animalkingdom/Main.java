package animalkingdom;


import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void collectionOfAnimals(List<AbstractAnimal> animals, CheckAnimalTester tester)
    {
        for (AbstractAnimal v : animals)
        {
            if(tester.test(v))
            {
                System.out.println(v.getName()+" "+ v.reproduce()+" "+v.move()+" "+v.breath()+" "+v.getYearDiscovered());
            }
        }
    }

    public static void main(String[] args) 
    {
        // System.out.println("works"); // test to make sure everything complies correctly
        
        List<AbstractAnimal> arrayAnimals = new ArrayList<>();

        arrayAnimals.add(new Mammals("Panda", 1869));
        arrayAnimals.add(new Mammals("Zebra", 1778));
        arrayAnimals.add(new Mammals("Koala", 1816));
        arrayAnimals.add(new Mammals("Sloth", 1804));
        arrayAnimals.add(new Mammals("Armadillo", 1758));
        arrayAnimals.add(new Mammals("Raccoon", 1758));
        arrayAnimals.add(new Mammals("Bigfoot", 2021));

        arrayAnimals.add(new Birds("Pigeon", 1837));
        arrayAnimals.add(new Birds("Peacock", 1821));
        arrayAnimals.add(new Birds("Toucan", 1758));
        arrayAnimals.add(new Birds("Parrot", 1824));
        arrayAnimals.add(new Birds("Swan", 1758));

        arrayAnimals.add(new Fish("Salmon", 1758));
        arrayAnimals.add(new Fish("Catfish", 1817));
        arrayAnimals.add(new Fish("Perch", 1758));

        // decending by year discovered
        arrayAnimals.sort((a1, a2) -> {
            return a2.getYearDiscovered() - a1.getYearDiscovered();
        });
        System.out.println(arrayAnimals.toString());

        System.out.println("-----alpha");
        
        // alphabetically
        arrayAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(arrayAnimals.toString());

        System.out.println("-----move");

        // move
        arrayAnimals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println(arrayAnimals.toString());

        System.out.println("-----breath = lungs");
        
        // breath lungs
        collectionOfAnimals(arrayAnimals, animal -> animal.breath().equalsIgnoreCase("lungs"));

        System.out.println("-----lungs 1758");
        
        // breath lungs 1758
        collectionOfAnimals(arrayAnimals, animal -> (animal.breath().equalsIgnoreCase("lungs") && animal.getYearDiscovered() == 1758));

        System.out.println("-----lungs, eggs");

        // lungs, eggs
        collectionOfAnimals(arrayAnimals, animal -> (animal.breath().equalsIgnoreCase("lungs") && animal.reproduce().equalsIgnoreCase("eggs")));

        System.out.println("-----alpha 1758");

        // alphabetically list animals named after 1758
        arrayAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        collectionOfAnimals(arrayAnimals, animal -> (animal.getYearDiscovered()==1758));
        
    }



}