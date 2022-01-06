import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        boolean present = 
            Arrays.stream(nums).boxed()
                .collect(groupingBy(r -> r, Collectors.toList()))
                .values()
                .stream()
                .anyMatch(s -> s.size() > 1);
        return present;
    }

}
