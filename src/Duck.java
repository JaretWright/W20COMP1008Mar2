import java.time.LocalDate;

public class Duck extends Pet {

    public Duck(String name) {
        super(name);
    }

    public void fly()
    {
        int monthNum = LocalDate.now().getMonthValue();
        if (monthNum >= 9 && monthNum >=12)
            System.out.println("Duck is flying south");
        else if (monthNum >= 3 && monthNum <= 6)
            System.out.println("Duck is flying north");
        else
            System.out.println("Duck is hanging poolside");
    }


    @Override
    public String speak() {
        return "quack quack";
    }
}
