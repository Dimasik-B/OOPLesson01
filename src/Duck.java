import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal{
    public Duck(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName) {
        super(name, birthDate, vaccination, illness, ownerName);
    }
}
