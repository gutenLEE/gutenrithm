class Solution {
    public int firstUniqChar(String s) {
        Queue<Integer> queue = new LinkedList();
        int[] arr = new int[150];
        for(int i = 0; i < s.length(); i++){
            int ascii = (int) s.charAt(i);
            arr[ascii]++;
            queue.offer(ascii);
        }
        
        
        while(queue.size() > 0){
            int ascii = queue.peek();
            if(arr[ascii] == 1){
                break;
            } else {
                queue.poll();
            }
        }
        if(queue.size() > 0){
            return s.indexOf(Character.toString(queue.peek()));
        } else {
            return -1;
        }
    }
}