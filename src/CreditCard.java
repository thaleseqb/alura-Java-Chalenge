import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double cardLimit;
    private double balance;
    private List<Bought> bougths;

    public CreditCard(double cardLimit) {
        this.cardLimit = cardLimit;
        this.balance = cardLimit;
        this.bougths = new ArrayList<>();
    }

    public boolean boughtLaunch(Bought bought) {
        if (this.balance > bought.getValue()) {
            this.balance -= bought.getValue();
            this.bougths.add(bought);
            return true;
        }
        return false;
    }

    public double getCardLimit() {
        return cardLimit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Bought> getBougths() {
        return bougths;
    }


}
