import java.text.NumberFormat;
import java.util.Objects;

public class Hearthstone extends TradingCard {
    // Create instance variable for cardClass (String)
    // Create instance variable for golden (boolean)
    private String cardClass = "unknown";
    private boolean golden = false;
    // Create an accessor/mutator for cardClass
    // Create an accessor/mutator for golden
    public String getCardClass() { return cardClass; }
    public void setCardClass(String cardClass) { this.cardClass = cardClass; }
    public boolean isGolden() { return golden; }
    public void setGolden(boolean golden) { this.golden = golden; }
    // Create a constructor with 5 parameters (name, price, rarity, cardClass, golden).  Initialize all instance variables.
    public Hearthstone(String name, double price, String rarity, String cardClass, boolean golden) {
        super(name, price, rarity);
        this.cardClass = cardClass;
        this.golden = golden;
    }
    // Override the equals() method to compare all instance variables for equality.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hearthstone that = (Hearthstone) o;
        return golden == that.golden && Objects.equals(cardClass, that.cardClass);
    }
    @Override
    public int hashCode() { return Objects.hash(super.hashCode(), cardClass, golden); }

    // Override the toString() method that displays all fields in the following format:
    // Hearthstone [Name=Baleful Banker, Price=$400.00, Rarity=Epic, Card Class=Neutral, Golden=true]
    @Override
    public String toString() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return "Hearthstone [Name=" + name +
                ", Price=" + currency.format(price) +
                ", Rarity=" + rarity +
                ", Card Class=" + cardClass +
                ", Golden=" + golden +
                "]";
    }
}
