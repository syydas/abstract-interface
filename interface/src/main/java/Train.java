public class Train implements Transportation {
    @Override
    public String getTransportation() {
        return "Train";
    }

    @Override
    public int price() {
        return 400;
    }
}
