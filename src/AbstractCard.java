public abstract class AbstractCard implements Card {
    private String nameOwner;
    private String number;
    protected double current;

    public String getNameOwner() {
        return nameOwner;
    }

    public String getNumber() {
        return number;
    }
    @Override
    public double getCurrent() {
        return current;
    }

    public AbstractCard(String nameOwner, String number, double current) {
        this.nameOwner = nameOwner;
        this.number = number;
        if (current >= 0)
            this.current = current;
        else {
            Dialog.inputPane("Нулевой баланс");
            this.current = 0;
        }
    }

    @Override
    public void put(double amount) {
        if (amount > 0)
            current += amount;
    }

    @Override
    public void take(double amount) {

    }

    @Override
    public String toString() {
        return "AbstractCard{" +
                "nameOwner='" + nameOwner + '\'' +
                ", number='" + number + '\'' +
                ", current=" + current +
                '}';
    }
}

