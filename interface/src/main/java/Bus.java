public class Bus implements Transportation {
    @Override
    public String chooseTransportation() {
        return "Bus";
    }

    @Override
    public int price() {
        return 300;
    }
}
