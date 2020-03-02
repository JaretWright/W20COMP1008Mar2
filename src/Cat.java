import java.security.SecureRandom;

public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "meow meow";
    }

    public void chaseMouse()
    {
        SecureRandom rng = new SecureRandom();
        if (rng.nextInt(2)==0)
            System.out.println("The cat caught the mouse");
        else
            System.out.println("The mouse got away");
    }
}
