package algorithm;

import java.util.Arrays;

public class BoatToSavePeople {

    public static void main(String... args) {
        int[] people = {3, 2, 2, 1};
        int limit = 3;

        BoatToSavePeople boatToSavePeople = new BoatToSavePeople();
        boatToSavePeople.numRescueBoats(people, limit);
    }

    public int numRescueBoats(int[] people, int limit) {
        //
        int numRescueBoats = 0;

        Arrays.sort(people);
        int i = 0, j = people.length - 1;

        while (i <= j) {
            numRescueBoats++;
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
        }

        return numRescueBoats;
    }
}
