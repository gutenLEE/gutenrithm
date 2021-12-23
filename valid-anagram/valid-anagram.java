class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] arr = new int[26];
        
        // 97 - 122
        for( int i = 0; i < s.length(); i++ ){
            int asciiValue = s.charAt(i);
            arr[ asciiValue - 97] += 1;
        }
        for( int i = 0; i < t.length(); i++ ){
            int asciiValue2 = t.charAt(i);
            arr[ asciiValue2 - 97] -= 1;
        }
        
        boolean flag = true;
        for ( int elm : arr) {
            if ( elm != 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}