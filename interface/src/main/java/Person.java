import java.util.ArrayList;

public class Person {
    private String name;
    private int money;

    public Person() {
    }

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void chooseTransportation(ArrayList<Transportation> Transportation) {
        for (Transportation transportation : Transportation) {
            if (getMoney() >= transportation.price()) {
                System.out.println(getName() + " can choose the " + transportation.getTransportation() + ".");
            }
        }
    }
}
