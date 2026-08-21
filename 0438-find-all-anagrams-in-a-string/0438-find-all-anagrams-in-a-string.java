class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length() > s.length()) {
            return res;
        }
        int[] patternFrequency = new int[26];
        for (int i = 0; i < p.length(); i++) {
            patternFrequency[p.charAt(i) - 'a']++;
        }
        int k = p.length();
        int[] windowFrequency = new int[26];
        for (int i = 0; i < k; i++) {
            windowFrequency[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(patternFrequency, windowFrequency)) {
            res.add(0);
        }
        int left = 0;
        for (int right = k; right < s.length(); right++) {
            windowFrequency[s.charAt(left) - 'a']--;
            windowFrequency[s.charAt(right) - 'a']++;
            left++;
            if (Arrays.equals(patternFrequency, windowFrequency)) {
                res.add(left);
            }
        }
        return res;
    }
}