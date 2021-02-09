package algorithm;

import java.util.ArrayList;
import java.util.List;

public class MaximizeDistanceToClosestPerson {

    public static void main(String... args) {

        int[] seats1 = new int[]{1, 0, 0, 0, 1, 0, 1};
        int[] seats2 = new int[]{0, 0, 1};
        int[] seats3 = new int[]{1, 0, 0, 1};
        int[] seats4 = new int[]{1, 0, 0};
        int[] seats5 = new int[]{0, 0, 1, 0};
        int[] seats6 = new int[]{0, 1, 0, 0, 0, 1, 1, 0, 1, 1};
        int[] seats7 = new int[]{0, 1, 0, 1, 0};

        MaximizeDistanceToClosestPerson maximizeDistanceToClosestPerson = new MaximizeDistanceToClosestPerson();
        int maxDist1 = maximizeDistanceToClosestPerson.maxDistToClosest(seats1);
        int maxDist2 = maximizeDistanceToClosestPerson.maxDistToClosest(seats2);
        int maxDist3 = maximizeDistanceToClosestPerson.maxDistToClosest(seats3);
        int maxDist4 = maximizeDistanceToClosestPerson.maxDistToClosest(seats4);
        int maxDist5 = maximizeDistanceToClosestPerson.maxDistToClosest(seats5);
        int maxDist6 = maximizeDistanceToClosestPerson.maxDistToClosest(seats6);
        int maxDist7 = maximizeDistanceToClosestPerson.maxDistToClosest(seats7);
        System.out.println("MaxDist2 is " + maxDist1);
        System.out.println("MaxDist2 is " + maxDist2);
        System.out.println("MaxDist1 is " + maxDist3);
        System.out.println("MaxDist2 is " + maxDist4);
        System.out.println("MaxDist2 is " + maxDist5);
        System.out.println("MaxDist2 is " + maxDist6);
        System.out.println("MaxDist1 is " + maxDist7);
    }

    public int maxDistToClosest(int[] seats) {

        int maxDist = 0;
        int currentDist = 0;
        int beginIndex = -1;

        for (int i = 0; i < seats.length; i++) {

            if (seats[i] == 1) {
                if (i == 0) {
                    beginIndex = i;
                    continue;
                }

                if (beginIndex != -1) {
                    currentDist = (currentDist + 1) / 2;
                }

                if (currentDist > maxDist) {
                    maxDist = currentDist;
                }

                currentDist = 0;
                beginIndex = i;

            } else {
                currentDist++;
                if (i == seats.length - 1) {
                    if (currentDist > maxDist) {
                        maxDist = currentDist;
                    }
                }
            }
        }

        return maxDist;
    }
}
