public class OctObserver extends Observer{
    public OctObserver() {
    }

    @Override
    public void update(String mes) {
        System.out.println("Oct" + mes);
    }
}
