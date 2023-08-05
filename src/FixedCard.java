public class FixedCard extends AbstractCard{
    public FixedCard(String nameOwner, String number, double current) {
        super(nameOwner, number, current);
    }

    @Override
    public void put(double amount) {
    }

    @Override
    public void take(double amount) {
    }
}
