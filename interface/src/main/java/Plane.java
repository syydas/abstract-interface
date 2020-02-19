public class Plane implements Transportation {
    @Override
    public String chooseTransportation() {
        return "Plane";
    }

    @Override
    public int price() {
        return 1000;
    }
}
