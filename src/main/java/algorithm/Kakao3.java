package algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Kakao3 {

    public static void main(String... args) {
        List<Integer> start_time = new ArrayList<>();
        start_time.add(1);
        start_time.add(3);
        start_time.add(3);
        start_time.add(5);
        start_time.add(7);
//        start_time.add(3);
//        start_time.add(1);
//        start_time.add(3);
//        start_time.add(5);

//        start_time.add(17);
//        start_time.add(978);
//        start_time.add(409);
//        start_time.add(229);
//        start_time.add(934);
//        start_time.add(299);
//        start_time.add(982);
//        start_time.add(636);
//        start_time.add(14);
//        start_time.add(866);
//        start_time.add(815);
//        start_time.add(64);
//        start_time.add(537);
//        start_time.add(426);
//        start_time.add(670);
//        start_time.add(116);
//        start_time.add(95);
//        start_time.add(630);


        List<Integer> running_time = new ArrayList<>();
        running_time.add(2);
        running_time.add(2);
        running_time.add(1);
        running_time.add(2);
        running_time.add(1);
//        running_time.add(3);
//        running_time.add(2);
//        running_time.add(2);
//        running_time.add(2);
//        running_time.add(1);
//        running_time.add(5);

//        running_time.add(17);
//        running_time.add(502);
//        running_time.add(518);
//        running_time.add(196);
//        running_time.add(106);
//        running_time.add(405);
//        running_time.add(452);
//        running_time.add(299);
//        running_time.add(189);
//        running_time.add(124);
//        running_time.add(506);
//        running_time.add(883);
//        running_time.add(753);
//        running_time.add(567);
//        running_time.add(717);
//        running_time.add(338);
//        running_time.add(439);
//        running_time.add(145);

        solution(start_time, running_time);

    }

    public static class Range {
        private int start;
        private int end;

        private HashSet<Range> duplicated = new HashSet<>();

        public Range(int start, int runningTime) {
            this.start = start;
            this.end = start + runningTime;
        }

        public boolean contains(Range target) {
            if (this.equals(target)) {
                return false;
            }
            return this.start <= target.start && target.end <= this.end;
        }

        public boolean linked(Range target) {
            if (this.equals(target))
                return false;

            boolean linked = this.start < target.start && this.end > target.start;
            duplicated.add(target);
            return linked;
        }

        public boolean existsInDuplicateList(Range target) {
            return duplicated.contains(target);
        }

        public static List<Range> removeIfContains(List<Range> ranges) {
            List<Range> copied = new ArrayList<>(ranges);

            for (int i = 0; i < ranges.size(); i++) {
                Range target = ranges.get(i);
                for (int j = 0; j < copied.size(); j++) {
                    if (copied.get(j).contains(target)) {
                        copied.remove(j);
                        break;
                    }
                }
            }
            return copied;
        }

        public static int count(List<Range> ranges) {
            int dupCount = 0;
            for (int i = 0; i < ranges.size() - 1; i++) {
                Range target = ranges.get(i);

                for (int j = i + 1; j < ranges.size(); j++) {
                    Range temp = ranges.get(j);

                    if (target.linked(temp) && !temp.existsInDuplicateList(target)) {
                        dupCount++;
                        break;
                    }
                }
            }

            return ranges.size() - dupCount;
        }
    }

    public static int solution(List<Integer> start_time, List<Integer> running_time) {

        List<Range> ranges = new ArrayList<>();

        for (int i = 0; i < start_time.size(); i++) {
            Range range = new Range(start_time.get(i), running_time.get(i));
            ranges.add(range);
        }

        ranges = Range.removeIfContains(ranges);
        int totalCount = Range.count(ranges);

        return totalCount;
    }
}
