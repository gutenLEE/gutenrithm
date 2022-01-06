import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        long count = 
                Arrays.stream(nums)
                    .boxed()
                    .collect(groupingBy(r -> r, Collectors.toList()))
                    .values()
                    .stream().map(List::size)
                    .filter(isDuplicated)
                    .map(accumulateDuplicatedListCount)
                    .count();
        return count > 0;
    }
    
    static Predicate<Integer> isDuplicated = (listSize) -> {
        return listSize > 1;
    };

    static Function<Integer, Long> accumulateDuplicatedListCount = (listSize) -> {
        return 1L;
    };
}