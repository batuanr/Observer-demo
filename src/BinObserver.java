public class BinObserver extends Observer{
    public BinObserver() {
    }

    @Override
    public void update(String mes) {
        System.out.println("Bin" + mes);
    }
}
