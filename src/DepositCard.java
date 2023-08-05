import java.time.LocalDateTime;

public class DepositCard extends AbstractCard{
    LocalDateTime lastDateTime = LocalDateTime.now();
    public DepositCard(String nameOwner, String number, double current) {
        super(nameOwner, number, current);
    }
    @Override
    public void take (double amount){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowMinusDay = now.minusDays(1);
        if (!nowMinusDay.isBefore(lastDateTime)) {
            if (amount > 0) {
                current += amount;
                lastDateTime = now;
                return;
            }
        }
        Dialog.messagePane("Время прошедшее с последнего снятия менее 24 часов");

    }
}

