import java.util.ArrayList;

public class PetExamples {
    public static void main(String[] args)
    {
        Dog dog = new Dog("Geronimo");
        Cat cat = new Cat("Goose");
        Duck duck = new Duck("Harold");

        //generic ArrayList - it assumes everything is an Object
        ArrayList genericPets = new ArrayList();
        genericPets.add(dog);
        genericPets.add(cat);
        genericPets.add(duck);
        genericPets.add("Funny sounding words");

        //loop over the generic ArrayList
        for (Object object: genericPets)
            System.out.println(object.toString());

        //get rid of the String in the generic ArrayList
        genericPets.remove(3);

        ArrayList<Pet> pets = new ArrayList<>();
        pets.addAll(genericPets);

        //loop over the collection, this time, they are no longer
        //generic objects, they are Pet objects, so we can call methods
        //defined in the Pet class
        for (Pet pet:pets)
            System.out.printf("%s named %s says \"%s\" %n",pet.getClass(), pet.getName(), pet.speak());


    }
}
