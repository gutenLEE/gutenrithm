class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        
        String[] split = s.split("");
        int sum = 0;
        int passIndex = Integer.MIN_VALUE;
        for (int i = 0; i < split.length; i++) {
            if (i == passIndex)
                continue;
            if (i + 1 != split.length && map.get(split[i]) < map.get(split[i + 1])) {
                Integer a = map.get(split[i]);
                Integer b = map.get(split[i + 1]);
                sum += b - a;
                passIndex = i + 1;
            } else {
                sum += map.get(split[i]);
            }
        }
        return sum;
    }
}