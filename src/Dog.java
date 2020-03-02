public class Dog extends Pet {

    /**
     * This is calling the "super" class (Pet) constructor
     * @param name
     */
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "woof woof";
    }

    public void wagTail()
    {
        System.out.println("tail is wagging - very happy pooch");
    }
}
