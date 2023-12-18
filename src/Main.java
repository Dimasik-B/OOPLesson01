import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(1993, 6, 6), new ArrayList<>(), "Chumka", "Boss", 4);
        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());
        Animal eagle = new Eagle("Kesha", LocalDate.of(1993, 6, 6), new ArrayList<>(), "Chumka", "Boss");

        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
        System.out.println("-------------------------");
        barsik.lifeCircle();
        System.out.println("-------------------------");
        Duck duck = new Duck("Donald", LocalDate.of(1934, 5, 3), new ArrayList<>(), "Flu", "Walter");
        Penguin penguin = new Penguin("Lolo", LocalDate.of(1987, 6, 26), new ArrayList<>(), "Flu", "Gennady");
        System.out.println("Cat:");
        barsik.toGo();
        barsik.fly();
        barsik.swim();
        System.out.println("Eagle:");
        eagle.toGo();
        eagle.fly();
        eagle.swim();
        System.out.println("Duck;");
        duck.toGo();
        duck.fly();
        duck.swim();
        System.out.println("Penguin");
        penguin.toGo();
        penguin.fly();
        penguin.swim();
    }
}