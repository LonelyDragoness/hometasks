package CollectionsTask;

import CollectionsTask.classification.GemPreciousness;
import CollectionsTask.classification.GemTransparency;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JewelCreation {
    static List<Gemstone> gemstoneList = Arrays.asList(
            new Gemstone("Ruby",10, 8400, GemPreciousness.PRECIOUS_FIRST_CLASS,
                    GemTransparency.SEMI_TRANSPARENT),
            new Gemstone("Garnet",12, 2800, GemPreciousness.PRECIOUS_THIRD_CLASS,
                    GemTransparency.TRANSLUCENT),
            new Gemstone("Topaz",20, 9800, GemPreciousness.PRECIOUS_SECOND_CLASS,
                    GemTransparency.SEMI_TRANSLUCENT),
            new Gemstone("Jade",30, 620, GemPreciousness.SEMI_PRECIOUS_FIRST_CLASS,
                    GemTransparency.TRANSPARENT),
            new Gemstone("Amber",26, 130, GemPreciousness.ORGANOGENIC,
                    GemTransparency.SEMI_TRANSPARENT),
            new Gemstone("Diamond",6, 2100, GemPreciousness.PRECIOUS_FIRST_CLASS,
                    GemTransparency.OPAQUE),
            new Gemstone("Moonstone",24, 1820, GemPreciousness.PRECIOUS_THIRD_CLASS,
                    GemTransparency.TRANSPARENT),
            new Gemstone("Obsidian",32, 140, GemPreciousness.SEMI_PRECIOUS_SECOND_CLASS,
                    GemTransparency.OPAQUE),
            new Gemstone("Sapphire",18, 26000, GemPreciousness.PRECIOUS_FIRST_CLASS,
                    GemTransparency.TRANSPARENT),
            new Gemstone("Quartzite",60, 80, GemPreciousness.SEMI_PRECIOUS_THIRD_CLASS,
                    GemTransparency.SEMI_TRANSLUCENT),
            new Gemstone("Emerald",16, 1800, GemPreciousness.PRECIOUS_FIRST_CLASS,
                    GemTransparency.SEMI_TRANSPARENT),
            new Gemstone("Spinel",6, 7500, GemPreciousness.PRECIOUS_FIRST_CLASS,
                    GemTransparency.TRANSLUCENT)
    );

    public static void main(String[] args) {
        System.out.println("Summary price of the chosen gemstones: " + Jewel.countPrice(gemstoneList) + " $");
        System.out.println("\nSummary weight of the chosen gemstones: " + Jewel.countWeight(gemstoneList) + " ct.");

        System.out.println("\nList of gemstones with specific transparency:");
        List <Gemstone> gemsWithSpecificTransparency = Jewel.getStonesWithTransparencyInRange(gemstoneList,
                GemTransparency.TRANSPARENT, GemTransparency.TRANSLUCENT);
        for (Gemstone gem : gemsWithSpecificTransparency) {
            System.out.println(gem.toString());
        }

        System.out.println("\nList of gemstones sorted by their preciousness:");
        Comparator<Gemstone> preciousnessComparator = new PreciousnessComparator();
        gemstoneList.sort(preciousnessComparator);
        for (Gemstone gem : gemstoneList) {
            System.out.println(gem.toString());
        }
    }
}
