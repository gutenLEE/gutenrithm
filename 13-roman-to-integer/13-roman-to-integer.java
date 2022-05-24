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
        for (int i = 0; i < split.length - 1; i++) {
            int nextIndex = i + 1;
            if (map.get(split[i]) < map.get(split[nextIndex])) {
                sum -= map.get(split[i]);
            } else {
                sum += map.get(split[i]);
            }
        }
        return sum + map.get(split[s.length() - 1]);
    }
}