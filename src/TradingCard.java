import java.util.Objects;

public abstract class TradingCard {
    // Create instance variables for name (String), price (double), and rarity (String).
    // **Be sure that all instance variables can be inherited by the two child classes**
    protected String name, rarity;
    protected double price;

    // Create a constructor that takes in 3 parameters (name, price, rarity).
    // Ensure this constructor is used for inheritance purposes only
    protected TradingCard (String name, double price, String rarity) {
        this.name = name;
        this.price = price;
        this.rarity = rarity;
    }

    // Create accessors/mutators for all instance variables.

    // Accessor and Mutator for Name
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // Accessor and Mutator for Rarity
    public String getRarity() { return rarity; }
    public void setRarity(String rarity) { this.rarity = rarity; }

    // Accessor and Mutator for Price
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }


    // Create an equals() method that compares all instance variables for equality.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TradingCard that = (TradingCard) o;
        return Double.compare(price, that.price) == 0 && Objects.equals(name, that.name) && Objects.equals(rarity, that.rarity);
    }

    @Override
    public int hashCode() { return Objects.hash(name, rarity, price); }
}