import java.util.ArrayList;

public class ChooseTransportation {
    public static void main(String[] args) {
        Person person = new  Person("小明", 300);
        Transportation selfDriving = new SelfDriving();
        Transportation bus = new Bus();
        Transportation train = new Train();
        Transportation plane = new Plane();

        ArrayList<Transportation> transportation = new ArrayList<>();
        transportation.add(selfDriving);
        transportation.add(bus);
        transportation.add(train);
        transportation.add(plane);

        person.chooseTransportation(transportation);
    }
}
