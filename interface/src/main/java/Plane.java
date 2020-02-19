public class Plane implements Transportation {
    @Override
    public String getTransportation() {
        return "Plane";
    }

    @Override
    public int price() {
        return 1000;
    }
}
