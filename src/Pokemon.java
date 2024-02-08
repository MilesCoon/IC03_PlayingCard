import java.text.NumberFormat;
import java.util.Objects;

public class Pokemon extends TradingCard {
    // Create instance variable for energyType (String)
    // Create instance variable for hitPoints (int)
    private String energyType = "unknown";
    private int hitPoints = 0;

    // Create an accessor/mutator for energyType
    // Create an accessor/mutator for hitPoints

    public String getEnergyType() { return energyType; }
    public void setEnergyType(String energyType) { this.energyType = energyType; }
    public int getHitPoints() { return hitPoints; }
    public void setHitPoints(int hitPoints) { this.hitPoints = hitPoints; }

    // Create a constructor with 5 parameters (name, price, rarity, energyType, hitPoints).
    // Initialize all instance variables.

    public Pokemon(String name, double price, String rarity, String energyType, int hitPoints) {
        super(name, price, rarity);
        this.energyType = energyType;
        this.hitPoints = hitPoints;
    }

    // Override the equals() method to compare all instance variables for equality.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pokemon pokemon = (Pokemon) o;
        return hitPoints == pokemon.hitPoints && Objects.equals(energyType, pokemon.energyType);
    }

    @Override
    public int hashCode() { return Objects.hash(super.hashCode(), energyType, hitPoints); }

    // Override the toString() method that displays all fields in the following format:
    // Pokemon [Name=Pikachu, Price=$500.00, Rarity=Special, Energy Type=Lightning, Hit Points=60]


    @Override
    public String toString() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return "Pokemon [Name=" + name +
                ", Price=" + currency.format(price) +
                ", Rarity=" + rarity +
                ", Energy Type=" + energyType +
                ", Hit Points=" + hitPoints + "]";
    }
}
