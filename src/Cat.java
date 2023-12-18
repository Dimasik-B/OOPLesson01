import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal{
    private int legsCount;
    public Cat(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName, int legsCount) {
        super(name, birthDate, vaccination, illness, ownerName);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public void fly() {
        System.out.println("I'm a cat! I Can't fly!");
    }

    @Override
    public void swim() {
        System.out.println("I'm a cat! I hate water! But if you insist...");
    }
}
