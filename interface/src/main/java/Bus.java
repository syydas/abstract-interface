public class Bus implements Transportation {
    @Override
    public String getTransportation() {
        return "Bus";
    }

    @Override
    public int price() {
        return 300;
    }
}
