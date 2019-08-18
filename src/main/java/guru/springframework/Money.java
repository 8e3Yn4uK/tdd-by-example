package guru.springframework;

public class Money {

    protected int amount;

    public boolean equals(Object object) {
        if (object == null) return false;
        Money money = (Money) object;
        return this.amount == money.amount &&
                this.getClass().equals(object.getClass());
    }

}
