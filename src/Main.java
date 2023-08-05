public class Main {
    public static void main(String[] args) {
        Card card1 = new DebetCard("Tom","1234 1234 0000 9088", 100 );
        Card card2 = new CreditCard("Tom","1234 1234 0000 9088", 100 );
        Card card3 = new DepositCard ("Tom","1234 1234 0000 9088", 100 );
        Card card4 = new FixedCard ("Tom","1234 1234 0000 9088", 100 );
        card1.take(Dialog.checkID("Введите сумму"));
        System.out.println(card1.getCurrent());
        card2.put(Dialog.checkID("Введите сумму"));
        card2.take(Dialog.checkID("Введите сумму"));
        System.out.println(card2.getCurrent());
        card3.take(Dialog.checkID("Введите сумму"));
        System.out.println(card3.getCurrent());
        card4.take(Dialog.checkID("Введмте сумму"));
        System.out.println(card4.getCurrent());
     }
    }
