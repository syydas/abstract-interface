public class SelfDriving implements Transportation {
    @Override
    public String chooseTransportation() {
        return "Self-driving";
    }

    @Override
    public int price() {
        return 500;
    }
}
