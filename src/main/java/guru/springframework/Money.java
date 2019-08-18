package guru.springframework;

public abstract class Money {

    protected int amount;

    public abstract Money times(int multiplier);

    public static Dollar dollar(int amount){
        return new Dollar(amount);
    }

    public static Franc franc(int amount){
        return new Franc(amount);
    }

    public boolean equals(Object object) {
        if (object == null) return false;
        Money money = (Money) object;
        return this.amount == money.amount &&
                this.getClass().equals(object.getClass());
    }

}
