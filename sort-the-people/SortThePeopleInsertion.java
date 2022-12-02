class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // Insertion sort
        for(int i = 1; i<heights.length;i++){
            String tempName = names[i];
            int tempHeight = heights[i];
            int position = i-1;
            while(position>=0){
                if(heights[position] < tempHeight){
                    heights[position+1] = heights[position];
                    names[position+1] = names[position];
                    position = position-1;
                } else {
                    break;
                }
            }
            heights[position+1]=tempHeight;
            names[position+1]=tempName;
        }
        return names;
    }
}