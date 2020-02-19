public class Train implements Transportation {
    @Override
    public String chooseTransportation() {
        return "Train";
    }

    @Override
    public int price() {
        return 400;
    }
}
