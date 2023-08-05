public class DebetCard extends AbstractCard {
    public DebetCard(String nameOwner, String number, double current) {
        super(nameOwner, number, current);
    }

    @Override
    public void take(double amount) {
        if ((current - amount) < 0) {
            Dialog.messagePane("Запрошенная сумма превышает баланс");
            return;
        }
        if (amount > 0)
            current = current - amount;
    }
}
