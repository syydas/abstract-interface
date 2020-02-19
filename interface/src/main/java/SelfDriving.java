public class SelfDriving implements Transportation {
    @Override
    public String getTransportation() {
        return "Self-driving";
    }

    @Override
    public int price() {
        return 500;
    }
}
