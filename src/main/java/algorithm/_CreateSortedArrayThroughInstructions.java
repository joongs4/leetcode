package algorithm;

import org.apache.commons.collections.map.AbstractSortedMapDecorator;

import java.util.*;
import java.util.stream.Collectors;

public class _CreateSortedArrayThroughInstructions {

    public static void main(String... args) {
//        int[] instructions = {1, 5, 6, 2};
//        int[] instructions = {1, 2, 3, 6, 5, 4};

//        int[] instructions = {1, 3, 3, 3, 2, 4, 2, 1, 2};
        int[] instructions = {4, 14, 10, 2, 5, 3, 8, 19, 7, 20, 12, 1, 9, 15, 13, 11, 18, 6, 16, 17};

//        int[] instructions = {1, 81615, 2, 25510, 29663, 41656, 46576, 49465, 55416};
//        int[] instructions = {1, 2, 3, 6, 5, 4};
//        int[] instructions = {1, 81615, 2, 81614, 3, 81613, 4, 81612, 5, 81611, 6, 81610, 7, 81609, 8, 81608, 9, 81607, 10, 81606, 11, 81605, 12, 81604, 13, 81603, 14, 81602};
        _CreateSortedArrayThroughInstructions createSortedArrayThroughInstructions = new _CreateSortedArrayThroughInstructions();
        createSortedArrayThroughInstructions.createSortedArray(instructions);
    }

    public int createSortedArray(int[] instructions) {
        int totalCost = 0;

        HashMap<Integer, Integer> storage = new HashMap<>(Math.min(instructions.length / 2, 100));

        for (int instruction : instructions) {
            Integer count = storage.getOrDefault(instruction, new Integer(0));
            storage.put(instruction, ++count);

            int lowCost = 0;
            int highCost = 0;

            for (Object objEntry : storage.entrySet().toArray()) {
                Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) objEntry;
                if (entry.getKey() < instruction) {
                    lowCost += entry.getValue();
                } else if (entry.getKey() > instruction) {
                    highCost += entry.getValue();
                }
            }
            totalCost += Math.min(lowCost, highCost);
        }
        return totalCost;
    }
}
