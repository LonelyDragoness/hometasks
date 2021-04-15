package CollectionsTask;

import CollectionsTask.classification.GemPreciousness;
import CollectionsTask.classification.GemTransparency;

public class Gemstone {
    private final String gemstoneName;
    private final int weight;
    private final int price;
    private final GemPreciousness preciousness;
    private final GemTransparency transparency;

    public Gemstone(String gemstoneName, int weight, int price, GemPreciousness preciousness,
                    GemTransparency transparency) {
        this.gemstoneName = gemstoneName;
        this.weight = weight;
        this.price = price;
        this.preciousness = preciousness;
        this.transparency = transparency;
    }

    public String getGemstoneName() {
        return gemstoneName;
    }

    public float getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public GemPreciousness getPreciousness() {
        return preciousness;
    }

    public GemTransparency getTransparency() {
        return transparency;
    }

    @Override
    public String toString() {
        return String.format("Gemstone: %s, Weight: %dct., Price: %d$, Preciousness: %s, " +
                        "Transparency: %s", gemstoneName, weight, price, preciousness, transparency);
    }
}
