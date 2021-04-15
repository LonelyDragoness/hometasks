package CollectionsTask;

import CollectionsTask.classification.GemPreciousness;
import CollectionsTask.classification.GemTransparency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Jewel {

    public static int countPrice(List<Gemstone> jewel) {
        int summaryGemPrice = 0;
        for (Gemstone gemstone : jewel) {
            summaryGemPrice += gemstone.getPrice();
        }
        return summaryGemPrice;
    }

    public static int countWeight(List<Gemstone> jewel) {
        int summaryGemWeight = 0;
        for (Gemstone gemstone : jewel) {
            summaryGemWeight += gemstone.getWeight();
        }
        return summaryGemWeight;
    }

    public static List<Gemstone> getStonesWithTransparencyInRange(List<Gemstone> jewel, GemTransparency transparencyMaximum,
                                                                  GemTransparency transparencyMinimum) {
        List<Gemstone> gemsWithSpecificTransparency = new ArrayList<>();
        for (Gemstone gemstone : jewel) {
            if (gemstone.getTransparency().ordinal() >= transparencyMaximum.ordinal() &
                    gemstone.getTransparency().ordinal() <= transparencyMinimum.ordinal()) {
                gemsWithSpecificTransparency.add(gemstone);
            }
        }
        return gemsWithSpecificTransparency;
    }

    public static List<Gemstone> sortGemsByPreciousness(List<Gemstone> jewel) {
        List<Gemstone> gemsSortedByPreciousness = new ArrayList<>();
        int preciousnessOrdinal = 0;
        for (Gemstone gemstone : jewel) {
            if (gemstone.getPreciousness().ordinal() > preciousnessOrdinal) {

            }
        }
        return gemsSortedByPreciousness;
    }


    public static int compare(Gemstone o1, Gemstone o2) {
        return o1.getPreciousness().ordinal() - o2.getPreciousness().ordinal();
    }

}
