import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal{
    public Eagle(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName) {
        super(name, birthDate, vaccination, illness, ownerName);
    }

    public void swim(){
        System.out.println("I can't swim, lets fly");
    }
}
