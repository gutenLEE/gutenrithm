import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

class Solution {
    public boolean isValid(String s) {
        
       Stack<String> stack = new Stack<>();
        boolean flag = false;
        for (String a : s.split("")) {
            if ( a.equals("(") || a.equals("[") || a.equals("{")) stack.push(a);
            else {
                if (stack.isEmpty()) return false;

                String open = Optional.ofNullable(stack.pop()).orElse(null);
                if (open == null) return false;
                String bracket = open + a;
                System.out.println(bracket);
                if ( bracket.equals("()") || bracket.equals("[]") || bracket.equals("{}")) flag = true;
                else return false;
            }
        }
        if ( !stack.isEmpty() ) return false;
        return flag;
    }
}