class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Size 128 covers standard ASCII without needing to subtract 'a'
        int[] count = new int[128];

        // Enhanced for-loops with toCharArray() avoid bounds-checking overhead
        for (char c : s.toCharArray()) {
            count[c]++;
        }

        for (char c : t.toCharArray()) {
            // Early exit: if a count drops below 0, it's already not an anagram
            if (--count[c] < 0) {
                return false;
            }
        }

        return true;
    }
}
