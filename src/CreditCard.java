public class CreditCard extends AbstractCard {
    public CreditCard(String nameOwner, String number, double current) {
        super(nameOwner, number, current);
    }

    @Override
    public void take(double amount) {
        if ((current - amount) < 0) {
            Dialog.inputPane("Запрошенная сумма превышает баланс");
            return;
        }
        if (amount > 0){
           current = current - ((double) (Math.round(((amount * 0.01) + amount) * 100)) /100);
        }

    }
}
