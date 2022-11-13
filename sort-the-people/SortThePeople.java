class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // bubble sort
        int unsortedUntilIndex = heights.length - 1;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for(int i =0; i < unsortedUntilIndex; i++){
                if(heights[i] < heights[i+1]){

                    String tempName = names[i];
                    names[i] = names[i+1];
                    names[i+1] = tempName;

                    int tempHeights = heights[i];
                    heights[i] = heights[i+1];
                    heights[i+1] = tempHeights;

                    sorted = false;
                }
            }
            unsortedUntilIndex--;
        }
        System.out.println(names);
        return names;
    }
}