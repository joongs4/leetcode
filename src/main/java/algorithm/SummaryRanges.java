package algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SummaryRanges {


    public static void main(String... args) {

//        int[] nums = new int[]{0, 1, 2, 4, 5, 7};
        int[] nums = new int[]{-212, -211, 211};

        SummaryRanges summaryRanges = new SummaryRanges();
        List<String> summary = summaryRanges.summaryRanges(nums);

        for (String summaryStr : summary) {
            System.out.println(summaryStr);
        }

    }

    public List<String> summaryRanges(int[] nums) {

        List<String> retVal = new ArrayList<String>();

        Integer startNum = null;
        Integer lastNum = null;

        for (int i = 0; i < nums.length; i++) {
            if (startNum == null) {
                startNum = nums[i];
            }

            if (lastNum == null) {
                lastNum = nums[i];
                continue;
            }

            if (lastNum + 1 == (nums[i])) {
                lastNum = nums[i];
                continue;
            } else {
                retVal.add(generateSummary(startNum, lastNum));
                startNum = nums[i];
                lastNum = nums[i];
            }
        }

        if (startNum != null) {
            retVal.add(generateSummary(startNum, lastNum));
        }

        return retVal;
    }

    private String generateSummary(Integer startNum, Integer lastNum) {
        if (startNum.equals(lastNum)) {
            return String.valueOf(startNum);
        } else {
            return String.format("%d->%d", startNum, lastNum);
        }
    }
}
