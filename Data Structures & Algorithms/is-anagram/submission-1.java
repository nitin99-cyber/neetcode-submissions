class Solution {
    public boolean isAnagram(String s, String t) {
        // Step 1: Check if lengths are different
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create a frequency array for 26 lowercase English letters
        int[] count = new int[26];

        // Step 3: Increment count for 's' and decrement for 't'
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Step 4: Verify all counts have returned to zero
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}
