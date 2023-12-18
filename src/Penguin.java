import java.time.LocalDate;
import java.util.List;

public class Penguin extends Animal{
    public Penguin(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName) {
        super(name, birthDate, vaccination, illness, ownerName);
    }

    @Override
    public void fly() {
        System.out.println("Yes, I'm a bird, but i can't fly =(");
    }
}
