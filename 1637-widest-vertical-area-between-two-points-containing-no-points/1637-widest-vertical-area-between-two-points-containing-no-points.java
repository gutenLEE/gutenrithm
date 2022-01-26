class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {

        List<Integer> list = Arrays.stream(points)
            .map(r -> r[0])
            .sorted()
            .collect(Collectors.toList());

        int maxDis = 0;
        for (int i = 1; i < list.size(); i++) {
            int x1 = list.get(i-1);
            int dis = list.get(i) - x1;
            if (maxDis < dis){
                maxDis = dis;
            }
        }
        return maxDis;
    }
}